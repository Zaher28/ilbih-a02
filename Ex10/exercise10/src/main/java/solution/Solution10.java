/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Zaher Ilbih
 */
package solution;

import java.util.Scanner;

public class Solution10 {



    /*
    Create a simple self-checkout system.
    Prompt for the prices and quantities of three items.
        Ask for prices and quantities of items
        Read in prices and quantities
    Calculate the subtotal of the items.
        Add up all prices*quantities amounts and store it
    Then calculate the tax using a tax rate of 5.5%.
        multiply total amount by constant TAX_RATE
    Print out the line items with the quantity and total, and then print out the subtotal, tax amount, and total.
     */

    private static final Scanner scan = new Scanner(System.in);
    private static final double TAX_RATE = .055;

    private double calculatePriceForItem(double pricePerItem, int quantity){

        return pricePerItem * quantity;

    }

    private double calculateSubtotalPrice(double price1,double price2, double price3){

        return (price1 + price2 + price3);

    }

    private double calculateTax(double subtotalPrice){
        return subtotalPrice*TAX_RATE;
    }

    private double calculateTotalPrice(double subtotalPrice){
        return subtotalPrice*(1+TAX_RATE);
    }

    public static void main(String[] args){

        Solution10 sol = new Solution10();

        String price1,price2,price3,q1,q2,q3;
        double p1,p2,p3;
        int quant1,quant2,quant3;


        System.out.printf("Enter the price of item 1: ");
        price1 = scan.nextLine();
        System.out.printf("Enter the quantity of item 1: ");
        q1 = scan.nextLine();

        System.out.printf("Enter the price of item 2: ");
        price2 = scan.nextLine();
        System.out.printf("Enter the quantity of item 2: ");
        q2 = scan.nextLine();

        System.out.printf("Enter the price of item 3: ");
        price3 = scan.nextLine();
        System.out.printf("Enter the quantity of item 3: ");
        q3 = scan.nextLine();

        p1 = Double.parseDouble(price1);
        p2 = Double.parseDouble(price2);
        p3 = Double.parseDouble(price3);

        quant1=Integer.parseInt(q1);
        quant2=Integer.parseInt(q2);
        quant3=Integer.parseInt(q3);

        double priceForAllItem1 = sol.calculatePriceForItem(p1,quant1);
        double priceForAllItem2 = sol.calculatePriceForItem(p2,quant2);
        double priceForAllItem3 = sol.calculatePriceForItem(p3,quant3);

        double subtotalPrice = sol.calculateSubtotalPrice(priceForAllItem1,priceForAllItem2,priceForAllItem3);
        double taxAmount = sol.calculateTax(subtotalPrice);
        double totalPrice = sol.calculateTotalPrice(subtotalPrice);

        String subtotal = "Subtotal: $" + subtotalPrice;
        String tax = "Tax: $" + taxAmount;
        String total = "Total: $" + totalPrice;

        System.out.println(subtotal);
        System.out.println(tax);
        System.out.println(total);



    }

}
