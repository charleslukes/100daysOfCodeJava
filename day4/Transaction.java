
package day4;

/**
 * Transaction
 */

import java.util.*;

class Transaction {

    private Date date = new Date();
    private char type;
    private double amount;
    private double balance;
    private String description;

    Transaction(char type, double amount, double balance, String description) {
        this.type = type;
        this.amount = amount;
        this.balance = balance;
        this.description = description;
    }

    protected double getAmount() {
        return this.amount;
    }

    protected double getBalance() {
        return this.balance;
    }

    protected Date getDate() {
        return this.date;
    }

    protected char getType() {
        return this.type;
    }

    protected String getDescription() {
        return this.description;
    }

    protected void setAmount(double amount) {
        this.amount = amount;
    }

    protected void setBalance(double balance) {
        this.balance = balance;
    }

    protected void setType(char type) {
        this.type = type;
    }

    protected void setDescription(String description) {
        this.description = description;
    }
}