/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Zaher Ilbih
 */
package solution;

import java.util.Scanner;


public class Solution15 {

    /*
    Create a simple program that validates user login credentials.
    The program must prompt the user for a password.
        Ask user for password
        Store it in String object
    The program should compare the password given by the user to a known password.
        use if statements and .equals method to compare passwords
    If the password matches, the program should display “Welcome!”
        if the passwords are the same then print Welcome!
    If it doesn’t match, the program should display “I don’t know you.”
        else, print I don't know you.
     */

    //checks if passwords match
    private void passCheck(String pass){

        if(pass.equals(password)){
            System.out.println("Welcome!");
        }
        else{
            System.out.println("I don't know you.");
        }

    }

    public static final Scanner scan = new Scanner(System.in);
    public static final String password = "qrisjx@fr";

    public static void main(String[] args){

        Solution15 sol = new Solution15();

        System.out.print("What is the password? ");
        String pass = scan.nextLine();
        sol.passCheck(pass);

    }


}
