/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Zaher Ilbih
 */
package solution;

import java.util.Scanner;

public class Solution11 {

    /*
Write a program that converts currency. Specifically, convert euros to U.S. dollars.
Prompt for the amount of money in euros you have,
    take in euros and dollars as Strings
    then parse to EuroToDollarConverter object
and prompt for the current exchange rate of the euro.
    take in exchange rate to EuroToDollarConverter object
Print out the new amount in U.S. dollars.
    calculate and print out the amount in dollars using methods within EuroToDollarConverter
 */
    public static final Scanner scan =  new Scanner(System.in);

    public static void main(String[] args){

        String euro,exchangeRate;
        EuroToDollarConverter convert = new EuroToDollarConverter();

        System.out.print("How many euros are you exchanging? ");
        euro = scan.nextLine();

        System.out.print("What is the exchange rate? ");
        exchangeRate = scan.nextLine();

        double euros = Double.parseDouble(euro);
        double exchangeRates = Double.parseDouble(exchangeRate);

        convert.setEuros(euros);
        convert.setExchangeRate(exchangeRates);
        double dollars = convert.convertEurosToDollars();

        System.out.printf("%.2f euros at an exchange rate of %.4f is %.2f U.S. dollars.", euros,exchangeRates,dollars);




    }
}
