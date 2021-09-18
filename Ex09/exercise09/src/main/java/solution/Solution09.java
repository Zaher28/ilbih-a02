/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Zaher Ilbih
 */
package solution;

import java.util.Scanner;
import java.lang.Math;

public class Solution09 {
    /*
    Calculate gallons of paint needed to paint the ceiling of a room.
    Prompt for the length and width, and assume one gallon covers 350 square feet.
        read in length and width of ceiling into Ceiling object using Scanner object
        calculate area of Ceiling
    Display the number of gallons needed to paint the ceiling as a whole number.
        divide area of ceiling by constant gallon to ftsqrd conversion
        Use Math.ceil to round up number to the nearest integer
     */
    public static final int GALLON_TO_FTSQRD_CONVERSION = 350;
    public static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args){

        System.out.print("Enter the length of the ceiling in feet: ");
        float length = scan.nextFloat();

        System.out.print("Enter the width of the ceiling in feet: ");
        float width = scan.nextFloat();

        Ceiling ceil = new Ceiling(length,width);

        float areaOfCeiling = ceil.getCeilingArea();

        System.out.printf("You will need to purchase %.0f gallon(s) of paint to cover %.2f square feet.",Math.ceil((double) areaOfCeiling/GALLON_TO_FTSQRD_CONVERSION), areaOfCeiling);



    }

}
