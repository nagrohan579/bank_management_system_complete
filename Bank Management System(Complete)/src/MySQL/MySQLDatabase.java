/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MySQL;

import app.User;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author nagro
 */
public class MySQLDatabase {

    private Connection con;
    private String tableName;
    private String url;
    private String username = "root";
    private String password = "";

//    public MySQLDatabase() throws SQLException, ClassNotFoundException, IOException {
//        tableName = "";
//        String url = "jdbc:mysql://localhost:3306/";
//        String username = "root";
//        String password = "";
//
//        con = DriverManager.getConnection(url,username,password);
//        Statement st = con.createStatement();
//
//        String query = "CREATE DATABASE IF NOT EXISTS myDB69";
//        st.executeUpdate(query);
//    }

    public MySQLDatabase(String tableName, String tableFields) throws SQLException, ClassNotFoundException, IOException {
        this.tableName = tableName;
        
//        con = DriverManager.getConnection(url,username,password);
//        
//
//        
//        st.executeUpdate(query);

        // Create table
        // Establish connection, create database if needed, and select it
        url = "jdbc:mysql://localhost:3306/customerDB";
        try{
            con = DriverManager.getConnection(url,username,password);
        }catch(SQLException e)
        {
            // Database doesn't exist yet, create it
            createDatabase();
            con = DriverManager.getConnection(url,username,password);
        }
        
        Statement st = con.createStatement();
        st = con.createStatement();
        String query = String.format("CREATE TABLE IF NOT EXISTS %s %s", tableName, tableFields);
        st.executeUpdate(query);
    }

    private void createDatabase() throws SQLException {
        String createDBUrl = "jdbc:mysql://localhost:3306/";
        Connection createDBCon = DriverManager.getConnection(createDBUrl, username, password);
        Statement st = createDBCon.createStatement();
        st.executeUpdate("CREATE DATABASE IF NOT EXISTS customerDB");
        st.close();
        createDBCon.close();
    }

    public void showTables() throws SQLException {
        try (ResultSet rs = con.getMetaData().getTables(null, null, null, null)) {
            while (rs.next()) {
                System.out.println(rs.getString("TABLE_NAME"));
            }
        }
    }

    public void insertData(List<String> inputList) throws SQLException {
        String query = String.format("INSERT INTO %s VALUES(?", tableName);
        for(int i = 1; i < inputList.size(); i++ )
            query += ",?";
        query += ")";
//        String query = String.format("INSERT INTO %s VALUES(?,?,?,?);
        try (PreparedStatement p = con.prepareStatement(query)) {
            int i = 1;
            for(String elem : inputList)
            {
                p.setString(i, elem);
                i++;
            }
            
            int count = p.executeUpdate();
            
            System.out.println(String.format("Added %d row(s) added sucessfully to %s table", count, tableName));
        }
    }

    public List<String> readData(String query, int columns) throws SQLException {
//        String query = String.format("SELECT * FROM %s", tableName);
//        Formatter formatter = new Formatter();

        Statement st = con.createStatement(); 
        ResultSet rs = st.executeQuery(query);
        List<String> resultList = new ArrayList<>();
//            formatter.format("%-5s %-25s %-25s %-25s\n", "id", "name", "username", "password");

        while(rs.next())
        {
            for (int i = 1; i <= columns; i++) {
                resultList.add(rs.getString(i));
            }
//            int id = rs.getInt(1);
//            String name = rs.getString(2);
//            String username = rs.getString(3);
//            String password = rs.getString(4);
//            
//            formatter.format("%-5s %-25s %-25s %-25s\n", id,name,username, password);
//            System.out.println(String.format("%d \t\t %s \t\t %s \t\t %s", id, name, username, password));
        }
//            System.out.println(formatter);
        return resultList;
    }
    
    public void deleteData(int id) throws SQLException {
        String query = String.format("DELETE FROM %s WHERE id=?", tableName);
        try (PreparedStatement p = con.prepareStatement(query)) {
            p.setInt(1, id);
            
            int count = p.executeUpdate();
            
            System.out.println(String.format("%d row(s) deleted sucessfully", count));
        }
    }

    public boolean validatePassword(String username, String password) throws SQLException {
        String query = "SELECT * FROM " + tableName + " " + "WHERE username=?";
        PreparedStatement st = con.prepareStatement(query);
        st.setString(1, username);
        ResultSet rs = st.executeQuery();

        if (rs.next()) {
            if (rs.getString("password").equals(password)) {
                User.name = rs.getString("fullname");
                return true;
            } else {
//                System.out.println("Invalid password!");
                JOptionPane.showMessageDialog(null, "Invalid password!", "WARNING!", JOptionPane.WARNING_MESSAGE);
                return false;
            }
        }

        JOptionPane.showMessageDialog(null, "Invalid username!", "WARNING!", JOptionPane.WARNING_MESSAGE);
        System.out.println("Invalid username!");
        return false;
    }

    public void close() throws SQLException {
        con.close();
    }
}
