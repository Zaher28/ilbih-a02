/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Zaher Ilbih
 */
package solution;

import java.util.Scanner;

public class Solution19 {


    /*
    Create a program to calculate the body mass index (BMI)
    for a person using the person’s height in inches and weight in pounds.
    The program should prompt the user for weight and height.
        take in weight and height as Strings
        try to parse to doubles and catch exceptions if needed
    Calculate the BMI by using the following formula:
        bmi = (weight / (height × height)) * 703
    If the BMI is between 18.5 and 25,
    display that the person is at a normal weight.
    If they are out of that range, tell them if they are underweight
    or overweight and tell them to consult their doctor.
        use if elses to check BMI ranges and display whether user is
        overweight or underweight depending on BMI
     */



    private double bmiCalculator(double weight,double height){


        return (weight/ (height*height)) * 703;

    }

    private void doctorCheck(double bmi){

        if(bmi<18.5){
            System.out.println("You are underweight. You should see your doctor.");
        }
        else if(bmi>25){
            System.out.println("You are overweight. You should see your doctor.");
        }
        else{
            System.out.println("You are within the ideal weight range.");
        }

    }

    public static final Scanner scan= new Scanner(System.in);

    public static void main(String[] args){

        Solution19 sol = new Solution19();

        System.out.print("Please enter your weight in pounds: ");
        String weight =  scan.nextLine();

        System.out.print("Please enter your height in inches: ");
        String height = scan.nextLine();

        try{
            Double.parseDouble(weight);
            Double.parseDouble(height);

        }catch(NumberFormatException e){
            System.out.println("Please enter numbers only!");
        }

        double poundWeight = Double.parseDouble(weight);
        double inchHeight =  Double.parseDouble(height);

        double bmi= sol.bmiCalculator(poundWeight,inchHeight);
        System.out.printf("Your BMI is %.2f\n",bmi);
        sol.doctorCheck(bmi);


    }
}
