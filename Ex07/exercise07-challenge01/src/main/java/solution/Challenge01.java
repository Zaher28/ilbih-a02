/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Zaher Ilbih
 */
package solution;

import java.util.Scanner;
import solution.Room;

public class Challenge01 {
    /*
    Create a program that calculates the area of a room.
        Scanner object for input
             Prompt the user for the length and width of the room in feet.
             use try catch blocks to check if user entered numbers
                disallow user from continuing if what was entered were not numbers
        Room object for calculation
            Use non-default constructor for width and length
            Both for feet area and meters area
        String objects and double variables for holding input
    Then display the area in both square feet and square meters.
        print out area in sqr ft and sqr m
     */
    public static void main(String[] args){

        //prompt user for len and wid and take it in
        Scanner scan = new Scanner(System.in);

        System.out.print("What is the length of the room in feet? ");
        String len =  scan.nextLine();
        System.out.print("What is the width of the room in feet? ");
        String wid = scan.nextLine();


        //try and catch blocks
        double width;
        double length;
        try{
            length = Double.parseDouble(len);
            width = Double.parseDouble(wid);
        }
        catch(NumberFormatException e){
            System.out.println("You have to enter actual numbers!");
        }

        length = Double.parseDouble(len);
        width = Double.parseDouble(wid);
        System.out.printf("You entered dimensions of %.3f feet by %.3f feet\n", length, width );

        //create Room object for area calculation
        Room area = new Room(length,width);
        double areaInFeet = area.getAreaInFeet();
        double areaInMeters = area.getAreaInMeters();

        System.out.println("The area is");
        System.out.printf("%.3f square feet\n", areaInFeet);
        System.out.printf("%.3f square meters", areaInMeters);




    }
}
