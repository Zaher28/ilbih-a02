/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Zaher Ilbih
 */
package solution;

import java.util.Scanner;

public class Solution12 {

    /*
    Create a program that computes simple interest.
    Prompt for the principal amount, the rate as a percentage, and the time, and
        Take in principal amount into a BankAccount object
        Take in rate into BankAccount object
        Take in years into BankAccount object
    display the amount accrued (principal + interest).
        use method from BankAccount and format accordingly
     */

    public static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args){

        BankAccount account = new BankAccount();

        System.out.print("Enter the principal: ");
        double principal = scan.nextDouble();

        System.out.print("Enter the rate of interest: ");
        double rate = scan.nextDouble();

        System.out.print("Enter the number of years: ");
        int years = scan.nextInt();

        account.setPrincipal(principal);
        account.setInterestRate(rate);
        account.setYears(years);
        double finalCash = account.getAccruedMoney();

        System.out.printf("After %d years at %.2f%%, the investment will be worth $%.2f", years, rate, finalCash);


    }
}
