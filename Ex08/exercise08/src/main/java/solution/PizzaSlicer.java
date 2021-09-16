/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Zaher Ilbih
 */
package solution;

public class PizzaSlicer {
    private int pizzaSlices;
    private int pizzaPeople;

    //non default constructor that takes in slices and people
    public PizzaSlicer(int slices, int people){
        pizzaSlices = slices;
        pizzaPeople = people;
    }
    //setter for pizzaSlices
    public void setPizzaSlices(int slices){
        pizzaSlices = slices;
    }
    //setter for pizzaPeople
    public void setPizzaPeople(int people){
        pizzaPeople = people;
    }
    //getter for pizzaSlices
    public int getPizzaSlices(){
        return pizzaSlices;
    }
    //getter for pizzaPeople
    public int getPizzaPeople(){
        return pizzaPeople;
    }
    //returns how many pizza slices per person
    public int getPizzaPerPerson(){

        return pizzaSlices/pizzaPeople;

    }
    //returns how many slices are left after everyone gets pizzas
    public int getPizzaSlicesLeft(){

        return pizzaSlices % pizzaPeople;
    }






}
