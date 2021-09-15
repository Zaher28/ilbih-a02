/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Zaher Ilbih
 */

package solution06;

import java.util.Calendar;

public class RetirementAge {

    //method that takes in your ageForRetirement and your currentAge and
    //returns the yearsLeft until you retire.
    public int getYearsLeft(int ageForRetirement, int currentAge){

        int yearsLeft;
        yearsLeft = ageForRetirement - currentAge;

        return yearsLeft;
    }

    //method that takes in the yearsLeft till you retire and returns
    //the years in which you will retire
    public int getRetirementYear(int yearsLeft){

        int currentYear = Calendar.getInstance().get(Calendar.YEAR);


        return currentYear + yearsLeft;
    }
}
