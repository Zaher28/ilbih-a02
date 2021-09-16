/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Zaher Ilbih
 */
package solution;

public class Room {

    public static final double FT_SQRD_TO_M_SQRD_CONVERSION = 0.09290304;
    private double length;
    private double width;

    //constructor for Room class, takes in l and w and sets length and width to those
    //respectively
    public Room(double l, double w) {
        length = l;
        width = w;

    }
    //method that takes in nothing and returns the area in feet using the private variables
    //within the class
    public double getAreaInFeet(){

        return length*width;

    }
    //method that takes in nothing and returns the area in meters using defined constant
    //and the private variables within the class
    public double getAreaInMeters(){

        return length*width*FT_SQRD_TO_M_SQRD_CONVERSION;
    }
    //length setter
    public void setLength(double len){

        length= len;

    }
    //width setter
    public void setWidth(double wid){

        width = wid;
    }
    //length getter
    public double getLength(){

        return length;
    }
    //width getter
    public double getWidth(){

        return width;
    }
}
