
package day3;

/**
 * AccountClient
 */

import day3.Account;

public class AccountClient {

    public static void main(String[] args) {

        Account newAccount = new Account(1122, 20000);

        // get account id
        System.out.println("Your account Id is: " + newAccount.getAccountId());

        // date account was created
        System.out.println("Your account was created on: " + newAccount.getDateCreated());

        // get the balance
        System.out.println("Your account balance is: " + newAccount.getAccountBalance());

        // get account intrest rate
        System.out.println("Your account annual interest rate is: " + newAccount.getAnnualIntrestRate());

        // update intrest rate
        newAccount.setAnnaulIntrestRate(0.045);

        // check mothnly intrest
        System.out.println("Your monthly interest is: " + newAccount.getMonthlyInterest());

        // check monthly intrest rate
        System.out.println("Your monthly interest rate is: " + newAccount.getMonthlyInterestRate());

        // withdraw $2500
        newAccount.withdrawFromAccount(2500);

        // check balance
        System.out.println("Debit alert, Your current account balance is: " + newAccount.getAccountBalance());

        // deposits $3000
        newAccount.depositToAccount(3000);

        // check balance
        System.out.println("Credit alert, Your current account balance is: " + newAccount.getAccountBalance());
    }
}