/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Zaher Ilbih
 */
package solution;

public class Ceiling {

    private float length;
    private float width;

    public Ceiling(float len, float wid){

        length = len;
        width = wid;

    }

    //gets area of ceiling
    public float getCeilingArea(){

        return length * width;
    }

    //Getters and setters for private members
    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }
}
