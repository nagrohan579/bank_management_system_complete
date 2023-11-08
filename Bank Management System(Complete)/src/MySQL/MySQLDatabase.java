/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MySQL;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.Formatter;

/**
 *
 * @author nagro
 */
public class MySQLDatabase {

    private Connection con;
    private String tableName;

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

        String url = "jdbc:mysql://localhost:3306/";
        String username = "root";
        String password = "";

        con = DriverManager.getConnection(url,username,password);
        Statement st = con.createStatement();

        String query = "CREATE DATABASE IF NOT EXISTS customerDB";
        st.executeUpdate(query);

        // Create table
        url = "jdbc:mysql://localhost:3306/customerDB";
        con = DriverManager.getConnection(url,username,password);
        st = con.createStatement();
        query = String.format("CREATE TABLE IF NOT EXISTS %s %s", tableName, tableFields);
        st.executeUpdate(query);
    }

    public void showTables() throws SQLException {
        try (ResultSet rs = con.getMetaData().getTables(null, null, null, null)) {
            while (rs.next()) {
                System.out.println(rs.getString("TABLE_NAME"));
            }
        }
    }

    public void insertData(int id, String name, String username, String password) throws SQLException {
        String query = String.format("INSERT INTO %s VALUES(?,?,?,?)", tableName);
        PreparedStatement p = con.prepareStatement(query);
        p.setInt(1, id);
        p.setString(2, name);
        p.setString(3, username);
        p.setString(4, password);

        int count = p.executeUpdate();

        System.out.println(String.format("%d row(s) added sucessfully", count));

        p.close();
    }

    public void readData() throws SQLException {
        String query = String.format("SELECT * FROM %s", tableName);
        Formatter formatter = new Formatter();

        try (Statement st = con.createStatement(); 
             ResultSet rs = st.executeQuery(query)) {

            formatter.format("%-5s %-25s %-25s %-25s\n", "id", "name", "username", "password");

        while(rs.next())
        {
            int id = rs.getInt(1);
            String name = rs.getString(2);
            String username = rs.getString(3);
            String password = rs.getString(4);
            
            formatter.format("%-5s %-25s %-25s %-25s\n", id,name,username, password);
//            System.out.println(String.format("%d \t\t %s \t\t %s \t\t %s", id, name, username, password));
        }
            System.out.println(formatter);

        }
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
                return true;
            } else {
                System.out.println("Invalid password!");
                return false;
            }
        }

        System.out.println("Invalid username!");
        return false;
    }

    public void close() throws SQLException {
        con.close();
    }
}
