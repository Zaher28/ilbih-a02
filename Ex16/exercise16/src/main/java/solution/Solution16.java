/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Zaher Ilbih
 */
package solution;

import java.util.Scanner;

public class Solution16 {
    /*
    Write a program that asks the user for their age and compare it to the legal driving age of sixteen.
    If the user is sixteen or older,
    then the program should display "You are old enough to legally drive."
    If the user is under sixteen,
    the program should display "You are not old enough to legally drive."

        Write a method that takes in the age input by the user. Depending on how big the number 'age' is
        then return String that says whether or not user is old enough to drive by comparing to 16.
        Then print out String
     */

    private String testDrivingAge(int age){

       String response = (age >= 16) ? "You are old enough to legally drive.":"You are not old enough to legally drive.";
       return response;

    }

    public static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args){

        Solution16 sol = new Solution16();

        System.out.print("What is your age? ");
        int age = scan.nextInt();

        System.out.printf("%s",sol.testDrivingAge(age));


    }

}
