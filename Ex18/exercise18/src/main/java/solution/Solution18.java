/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Zaher Ilbih
 */
package solution;

import java.util.Scanner;

public class Solution18 {

    /*
    Create a program that converts temperatures from Fahrenheit to Celsius or from Celsius to Fahrenheit.
    Prompt for the starting temperature.
    The program should prompt for the type of conversion and then perform the conversion.

        use if else statements to see which temperature the user wants to convert to
        use TemperatureConverter class methods to convert one temp to another
        print out final results based on above
     */

    public static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args){

        TemperatureConverter convert = new TemperatureConverter();

        System.out.print("Press C to convert from Fahrenheit to Celsius.\n");
        System.out.print("Press F to convert from Celsius to Fahrenheit.\nYour choice: ");
        String temperatureChosen = scan.nextLine();

        if(temperatureChosen.equals("C") || temperatureChosen.equals("c")){
            System.out.print("Please enter the temperature in Fahrenheit: ");
            double temperature = scan.nextDouble();
            convert.setFahrenheit(temperature);
            System.out.printf("The temperature in Celsius is %.2f",convert.convertFahrenheitToCelsius());
        }
        else if(temperatureChosen.equals("F") || temperatureChosen.equals("f")){
            System.out.print("Please enter the temperature in Celsius: ");
            double temperature = scan.nextDouble();
            convert.setCelsius(temperature);
            System.out.printf("The temperature in Fahrenheit is %.2f",convert.convertCelsiusToFahrenheit());
        }

    }
}
