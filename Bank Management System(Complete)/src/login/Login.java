/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package login;

import java.io.Console;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author nagro
 */
public class Login {
    public static String username;
    public static String password;
    public static void showLoginPage(Scanner sc) throws IOException, InterruptedException
    {
//        System.out.print("\033[H\033[2J");  
//        System.out.flush();  
        
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();  
        
        System.out.println("WELCOME TO THE BANK\n");
        System.out.println("==================================================\n");
        System.out.print("Enter username: ");
        username = sc.nextLine();
        
        Console console = System.console();
        if (console == null) {
            System.err.println("No console available.");
            System.exit(1);
        }

        char[] passwordArray = console.readPassword("Enter your password: ");
        password = new String(passwordArray);
        
    }
}
