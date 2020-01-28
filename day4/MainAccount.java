package day4;

/**
 * Account
 */

import day4.Transaction;
import day3.Account;
import java.util.*;

class MainAccount extends Account {
    private String name;

    ArrayList<Transaction> transactions = new ArrayList<>();

    MainAccount(int id, String name, double balance, double interestRate) {
        super(id, balance);
        super.setAnnaulIntrestRate(interestRate);
        this.name = name;
    }

    protected String getAccountName() {
        return this.name;
    }

    @Override
    public int getAccountId() {
        return super.getAccountId();
    }

    @Override
    public double getAccountBalance() {
        return super.getAccountBalance();
    }

    protected void withdraw(int amount) {
        int pay = super.withdrawFromAccount(amount);
        double balance = this.getAccountBalance();

        Transaction transact = new Transaction('W', pay, balance, "Withdraw some amount");
        transactions.add(transact);

        System.out.println("Withdraw successfull " + pay);
    }

    protected void deposit(double amount) {
        double deposit = super.depositToAccount(amount);
        double balance = this.getAccountBalance();

        Transaction transact = new Transaction('D', deposit, balance, "Deposited some amount");
        transactions.add(transact);

        System.out.println("Deposit successfull " + deposit);
    }
}