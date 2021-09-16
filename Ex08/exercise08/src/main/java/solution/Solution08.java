/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Zaher Ilbih
 */
package solution;

import java.util.Scanner;

public class Solution08 {
    /*
    Write a program to evenly divide pizzas.
    Prompt for the number of people, the number of pizzas, and the number of slices per pizza.
        Scanner object to take in all these values
        integer variables to hold the values
        Use PizzaSlicer object to
    Ensure that the number of pieces comes out even.
        Use integer division and modulus to truncate pizza slices per person
    Display the number of pieces of pizza each person should get.
        print out integer division and integer modulus.
    If there are leftovers, show the number of leftover pieces.
     */
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int pizzas,people,pizzaSlicesPerPizza;
        System.out.print("How many people? ");
        people = scan.nextInt();
        System.out.print("How many pizzas do you have? ");
        pizzas = scan.nextInt();
        System.out.print("How many slices per pizza? ");
        pizzaSlicesPerPizza = scan.nextInt();

        System.out.printf("%d people with %d pizzas (%d slices)\n",people,pizzas,pizzaSlicesPerPizza*pizzas);

        PizzaSlicer slicer = new PizzaSlicer(pizzaSlicesPerPizza*pizzas, people);

        int slicesPerPerson = slicer.getPizzaPerPerson();
        int slicesLeft = slicer.getPizzaSlicesLeft();

        System.out.printf("Each person gets %d slices of pizza.\n", slicesPerPerson);
        System.out.printf("There are %d leftover pieces.", slicesLeft);


    }
}
