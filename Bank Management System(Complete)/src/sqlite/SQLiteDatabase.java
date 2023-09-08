/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sqlite;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
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
public class SQLiteDatabase {

    private Connection con;
    private final String tableName;
    private final String tableFields;

    public SQLiteDatabase() throws SQLException, ClassNotFoundException, IOException {
        tableName = "";
        tableFields = "";
        Class.forName("org.sqlite.JDBC");
        Path dbFile = Files.createTempFile(null, ".db");
        try (InputStream embeddedDB
                = SQLiteDatabase.class.getResourceAsStream(
                        "/databases/customerDB.db")) {
            Files.copy(embeddedDB, dbFile, StandardCopyOption.REPLACE_EXISTING);
        }

        String url = "jdbc:sqlite:" + dbFile;
        con = DriverManager.getConnection(url);

    }

    public SQLiteDatabase(String tableName, String tableFields) throws SQLException, ClassNotFoundException, IOException {
        this.tableName = tableName;
        this.tableFields = tableFields;
        Class.forName("org.sqlite.JDBC");
        String query = String.format("CREATE TABLE IF NOT EXISTS %s %s", tableName, tableFields);

        Path dbFile = Files.createTempFile(null, ".db");
        try (InputStream embeddedDB
                = SQLiteDatabase.class.getResourceAsStream(
                        "/databases/customerDB.db")) {
            Files.copy(embeddedDB, dbFile, StandardCopyOption.REPLACE_EXISTING);
        }

        String url = "jdbc:sqlite:" + dbFile;
        con = DriverManager.getConnection(url);
//        con = DriverManager.getConnection("jdbc:sqlite:src/databases/customerDB.db");

        Statement st = con.createStatement();
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

    public void close() throws SQLException {
        con.close();
    }
}
