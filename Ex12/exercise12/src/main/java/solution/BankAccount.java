/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Zaher Ilbih
 */
package solution;

public class BankAccount {
    private double principal;
    private double interestRate;
    private int years;


    public double getAccruedMoney(){

        //this will ensure it is rounded to the next penny
        double cents= 100*(principal*(1 + ((interestRate/100)*years)));
        cents = Math.ceil(cents);

        return cents/100.0;

    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public double getPrincipal() {
        return principal;
    }

    public void setPrincipal(double principal) {
        this.principal = principal;
    }
}
