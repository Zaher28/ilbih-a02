/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Zaher Ilbih
 */
package solution;

import java.util.Scanner;

public class Solution07 {
    /*
    Create a program that calculates the area of a room.
        Scanner object for input
             Prompt the user for the length and width of the room in feet.
        Room object for calculation
            Use non-default constructor for width and length
            Both for feet area and meters area
        double variables for holding input
    Then display the area in both square feet and square meters.
        print out area in sqr ft and sqr m

     */
    public static void main(String[] args){

        //prompt user for len and wid and take it in
        Scanner scan = new Scanner(System.in);
        System.out.print("What is the length of the room in feet? ");
        double len = scan.nextDouble();
        System.out.print("What is the width of the room in feet? ");
        double wid = scan.nextDouble();
        System.out.printf("You entered dimensions of %.3f feet by %.3f feet", len, wid );

        //create Room object for area calculation
        Room area = new Room(len,wid);
        double areaInFeet = area.getAreaInFeet();
        double areaInMeters = area.getAreaInMeters();

        System.out.println("The area is");
        System.out.printf("%.3f square feet\n", areaInFeet);
        System.out.printf("%.3f square meters", areaInMeters);




    }
}
