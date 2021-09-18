/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Zaher Ilbih
 */
package solution;

public class BankAccountPlus {
    private double principal;
    private double interestRate;
    private int years;
    private int timesCompounded;


    public double getTotalInvestment(){
        //ensure the rounding is correct
        double cents = 100*(principal* Math.pow((1+(interestRate/100)/timesCompounded),timesCompounded*years));
        cents = Math.ceil(cents);
        return cents/100;

    }

    public int getTimesCompounded() {
        return timesCompounded;
    }

    public void setTimesCompounded(int timesCompounded) {
        this.timesCompounded = timesCompounded;
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
