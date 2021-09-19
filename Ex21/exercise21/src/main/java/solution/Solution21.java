/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Zaher Ilbih
 */
package solution;

import java.util.Scanner;

public class Solution21 {
    /*
    Write a program that converts a number from 1 to 12 to the corresponding month.
    Prompt for a number and display the corresponding calendar month,
        Take in number
        Use method that contains a switch statement to display corresponding month
    with 1 being January and 12 being December.
    For any value outside that range, display an appropriate error message.
        default case will be an error message
     */

    private String numberToMonth(int number){

        return switch (number) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "nonexistent in our current calendar";
        };

    }

    public static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args){

        Solution21 sol = new Solution21();

        System.out.print("Please enter the number of the month: ");
        int num = scan.nextInt();

        System.out.printf("The name of the month is %s.",sol.numberToMonth(num));


    }
}
