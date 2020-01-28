/**
 Write a test program that creates an Account object with an account ID of 1122,
 a balance of $20,000, and an annual interest rate of 4.5%. Use the withdraw 
 method to withdraw $2,500, use the deposit method to deposit $3,000, 
 and print the balance, the monthly interest, and the date when this account 
 was created.
 */

package day3;

import java.util.*;

/**
 * Account
 */
public class Account {

    private int id;
    private double balance;
    private double InterestRate;
    private Date dateCreated;

    public Account() {
        // assign all default values
        this.id = 0;
        this.balance = 0;

        // assume all accounts have the same intrest rate.
        this.InterestRate = 0;
        this.dateCreated = new Date();
    }

    public Account(int id, double balance) {
        this();

        // update the id and balance
        this.id = id;
        this.balance = balance;
    }

    public int getAccountId() {
        return this.id;
    }

    public double getAccountBalance() {
        return this.balance;
    }

    public double getAnnualIntrestRate() {
        return this.InterestRate * 12;
    }

    public Date getDateCreated() {
        return this.dateCreated;
    }

    public void setAccountId(int id) {
        this.id = id;
    }

    public void setAccountBalance(double balance) {
        this.balance = balance;
    }

    public void setAnnaulIntrestRate(double intrestRate) {
        this.InterestRate = intrestRate * 12;
    }

    public double getMonthlyInterestRate() {
        return this.InterestRate / 12;
    }

    public double getMonthlyInterest() {
        // get the balance
        double balance = this.balance;

        // get the monthly intrest rate
        double monthlyInterestRate = this.getMonthlyInterestRate();

        return balance * monthlyInterestRate;
    }

    public int withdrawFromAccount(int amount) {
        // check the balance
        double balance = this.balance;

        if (amount > balance) {
            return 0;
        } else {
            // update the current balance
            this.balance = this.balance - amount;
            return amount;
        }
    }

    public double depositToAccount(double amount) {
        this.balance = this.balance + amount;
        return this.balance;
    }
}