/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Zaher Ilbih
 */
package solution;

public class EuroToDollarConverter {

    private double euros;
    private double exchangeRate;

    //ensure it rounds to nearest cent
    public double convertEurosToDollars(){

        double dollars = euros *exchangeRate;
        //this will help round up the nearest cent with Math.ceil
        double cents = (dollars * 100);

        return Math.ceil(cents) / 100.0;


    }

    public double getEuros() {
        return euros;
    }

    public void setEuros(double euros) {
        this.euros = euros;
    }

    public double getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }
}
