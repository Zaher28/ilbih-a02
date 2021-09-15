/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Zaher Ilbih
 */
package solution06;

import java.util.Scanner; //imports Scanner class
import java.util.Calendar; //imports Date class


public class Solution06 {
/*
Create a program that determines how many years you have left until retirement
and the year you can retire.
It should prompt for your current age and the age you want to retire
    Create Scanner object 'scan'
    Create String objects 'age' and 'retireAge'
    Create RetirementAge object
        This class has the methods required to calculate
        how many years left till retirement and what year it'll be
        when the user retires.
    Prompt for 'age' and take it in
    initialize int for 'yearsLeft'
    set 'yearsLeft' equal to the result returned by RetirementAge.getYearsLeft
and display the output as shown in the example that follows.
    print out how many years user has left till he/she retires.
    print out what year the user will retire in using RetirementAge class and Calendar class
 */




    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        RetirementAge retirement = new RetirementAge();
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);

        System.out.print("What is your current age? ");
        String age = scan.nextLine();
        System.out.print("At what age would you like to retire? ");
        String retireAge = scan.nextLine();

        int currentAge = Integer.parseInt(age);
        int ageForRetirement = Integer.parseInt(retireAge);

        int yearsLeft = retirement.getYearsLeft(ageForRetirement, currentAge);
        int yearToRetire = retirement.getRetirementYear(yearsLeft);

        System.out.printf("You have %d years left until you can retire.\n", yearsLeft);
        System.out.printf("It's %d, so you can retire in %d", currentYear, yearToRetire);











    }

}
