/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sqlite;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author nagro
 */
public class SQLiteDatabase {
    private Connection con;
    private final String tableName;
    private final String tableFields;
    
    public SQLiteDatabase(String tableName, String tableFields) throws SQLException, ClassNotFoundException
    {
        this.tableName = tableName;
        this.tableFields = tableFields;
        Class.forName("org.sqlite.JDBC");
        String query=String.format("CREATE TABLE IF NOT EXISTS %s %s", tableName, tableFields);
        
        con = DriverManager.getConnection("jdbc:sqlite:src/databases/customerDB.db");
        Statement st = con.createStatement();
        st.executeUpdate(query);
    }
}
