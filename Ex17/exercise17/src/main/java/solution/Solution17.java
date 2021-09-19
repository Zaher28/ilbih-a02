/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Zaher Ilbih
 */
package solution;

import java.util.Scanner;

public class Solution17 {

    /*
    Create a program that prompts for your weight, gender,
    total alcohol consumed (in ounces), and the amount of time since your last drink.
    Calculate your blood alcohol content (BAC) using this formula

        Create a method that prints something based on whether it is legal
        for the user to drive.
            if BAC>=.08
                'can't drive'
            else
                'can drive'
        Use Given formula to test and use more if-else clauses for whether the user
        is a male or a female.
        Test according to BAC = (A × 5.14 / W × r) − .015 × H

        Test whether numeric values are entered using String parsing and exception throwing
     */

    private void testForLegalDriving(int gender, double ouncesOfAlc, double poundWeight, int hoursSinceLastDrink){

        double bac;
        if(gender == 1){
            bac = ((ouncesOfAlc*5.14)/(poundWeight) *ADR_FOR_MEN) - (.015 * hoursSinceLastDrink);
        }
        else{
            bac = ((ouncesOfAlc*5.14)/(poundWeight) *ADR_FOR_WOMEN) - (.015 * hoursSinceLastDrink);
        }

        System.out.printf("Your BAC is %f\n", bac);
        if(bac>=.08)

            System.out.println("It is not legal for you to drive");
        else
            System.out.println("It is legal for you to drive.");

    }

    private static final double ADR_FOR_MEN = .73;
    private static final double ADR_FOR_WOMEN = .66;
    public static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args){

        Solution17 sol = new Solution17();

        System.out.print("Enter a 1 if you are male or a 2 if you are female: ");
        String gender = scan.nextLine();

        System.out.print("How many ounces of alcohol did you have? ");
        String ounces = scan.nextLine();

        System.out.print("What is your weight, in pounds? ");
        String weight = scan.nextLine();

        System.out.print("How many hours has it been since your last drink? ");
        String hoursSinceLastDrink = scan.nextLine();

        try{
            Integer.parseInt(gender);
            Double.parseDouble(ounces);
            Double.parseDouble(weight);
            Integer.parseInt(hoursSinceLastDrink);
        }catch(NumberFormatException e){

            System.out.print("Input only numbers!!!");

        }

        int gen = Integer.parseInt(gender);
        double ouncesOfAlc = Double.parseDouble(ounces);
        double weightInPounds = Double.parseDouble(weight);
        int hours = Integer.parseInt(hoursSinceLastDrink);

        sol.testForLegalDriving(gen,ouncesOfAlc,weightInPounds,hours);










    }
}
