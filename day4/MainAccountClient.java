package day4;

/**
 * MainAccountClient
 */

import day4.MainAccount;

public class MainAccountClient {

    public static void main(String[] args) {
        MainAccount mainAccount = new MainAccount(1112, "Charles", 1000, 0.05);

        mainAccount.deposit(30);
        mainAccount.deposit(40);
        mainAccount.deposit(50);

        mainAccount.withdraw(5);
        mainAccount.withdraw(4);
        mainAccount.withdraw(2);

        System.out.println(mainAccount.getAccountBalance());
    }

}