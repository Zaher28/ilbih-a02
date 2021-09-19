/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Zaher Ilbih
 */
package solution;

import java.util.Scanner;

public class Solution20 {
    /*
    Create a tax calculator that handles multiple states and multiple counties within each state.
    The program prompts the user for the order amount and the state where the order will be shipped.
        take in order amount as double and stae as String
    Wisconsin residents must be changed 5% sales tax with an additional county-level charge.
        if else statement to check for Wisconsin and then further check if they live in any of the
        mentioned counties
            calculate extra tax as seen below based on results above
    For Wisconsin residents, prompt for the county of residence.
        For Eau Claire county residents, add an additional 0.5% tax.
        For Dunn county residents, add an additional 0.4% tax.
    Illinois residents must be charged 8% sales tax with no additional county-level charge.

    All other states are not charged tax.

The program then displays the tax and the total for Wisconsin and Illinois residents but just the total for everyone else.
     */

    private double calculateTax(double orderAmount, String state,String county){

        if(state.equals("Wisconsin")){

            if(county.equals("Eau Claire")){
                return (orderAmount * (WI_TAX + EAU_ADD_TAX));
            }
            else if(county.equals("Dunn")){
                return (orderAmount * (WI_TAX + DUNN_ADD_TAX));
            }
            else{
                return (orderAmount * WI_TAX);
            }
        }
        else if(state.equals("Illinois")){
            return (orderAmount * IL_TAX);
        }
        else{
            return 0.0;
        }

    }

    public static final double WI_TAX = .05;
    public static final double EAU_ADD_TAX = .005;
    public static final double DUNN_ADD_TAX = .004;
    public static final double IL_TAX = .08;
    public static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args){

        Solution20 sol = new Solution20();

        System.out.print("What is the order amount? ");
        double amount = scan.nextDouble();

        System.out.print("What state do you live in? ");
        scan.nextLine();
        String state = scan.nextLine();
        String response,taxResponse;

        if(state.equals("Wisconsin")){
            System.out.print("What county do you live in? ");
            String county = scan.nextLine();
            double tax = sol.calculateTax(amount,state,county);
            taxResponse = "The tax is $" + tax + ".";
            response = "The total is $" + (amount+tax) + ".";
        }
        else if(state.equals("Illinois")){
            double tax = sol.calculateTax(amount,state,"None");
            taxResponse = "The tax is $" + tax + ".";
            response = "The total is $" + (amount + tax) + ".";
        }
        else{
            taxResponse = "";
            response = "The total is $" + amount + ".";
        }

        System.out.print(taxResponse + "\n" + response);
    }

}
