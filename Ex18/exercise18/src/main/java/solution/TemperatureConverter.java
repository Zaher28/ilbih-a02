/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Zaher Ilbih
 */
package solution;

public class TemperatureConverter {

    private double fahrenheit;
    private double celsius;

    public double convertCelsiusToFahrenheit(){
        return (celsius * (9.0/5.0)) +32;
    }

    public double convertFahrenheitToCelsius(){
        return (fahrenheit - 32) * (5.0/9.0);
    }


    public double getFahrenheit() {
        return fahrenheit;
    }

    public void setFahrenheit(double fahrenheit) {
        this.fahrenheit = fahrenheit;
    }

    public double getCelsius() {
        return celsius;
    }

    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }
}
