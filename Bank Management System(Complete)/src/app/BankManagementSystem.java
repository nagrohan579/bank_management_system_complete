package app;

//real
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import static login.Login.*;

import MySQL.MySQLDatabase;

public class BankManagementSystem {
    public static void main(String[] args) {
        
//        Login ob = new Login();
//          SignUp ob1 = new SignUp();
//          Form_1 ob2 = new Form_1();
//          Form_2 ob3 = new Form_2();

        new HomePage();
        
        
       
//        
//        try(Scanner sc = new Scanner(System.in))
//        {
//            MySQLDatabase sql = new MySQLDatabase("userDetails",
//                    "(id int, " +
//                    "name varchar(255), " +
//                    "username varchar(255)," +
//                    "password varchar(255))");
//
////            sql.insertData(1, "rohan", "rohan", "1234");
////            sql.deleteData(1);
//            sql.readData();
//
//        }
//        catch(Exception e)
//        {
//            Logger.getLogger(BankManagementSystem.class.getName()).log(Level.SEVERE, null, e);
//        }
    }
}