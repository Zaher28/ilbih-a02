/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Zaher Ilbih
 */
package solution;

import java.util.Scanner;

public class Solution13 {
    /*
    Write a program to compute the value of an investment compounded over time.
    The program should ask for the starting amount,
        read in principal
        set in BankAccountPlus object
    the number of years to invest, the interest rate,
    and the number of periods per year to compound.
        Use BankAccountPlus object to return moneyAccrued based on
        compound interest formula.
     */

    public static final Scanner scan =  new Scanner(System.in);

    public static void main (String[] args){

        BankAccountPlus account = new BankAccountPlus();

        System.out.print("What is the principal amount? ");
        double principal = scan.nextDouble();

        System.out.print("What is the rate? ");
        double rate = scan.nextDouble();

        System.out.print("What is the number of years? ");
        int years = scan.nextInt();

        System.out.print("What is the number of times the interest iss compounded per year? ");
        int timesComp = scan.nextInt();

        account.setPrincipal(principal);
        account.setInterestRate(rate);
        account.setYears(years);
        account.setTimesCompounded(timesComp);
        double totalCash = account.getTotalInvestment();

        System.out.printf("$%.2f invested at %.2f%% for %d years ",principal,rate,years);
        System.out.printf("compounded %d times per year is $%.2f.",timesComp,totalCash);




    }
}
