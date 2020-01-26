/**
 * Simulate an ATM machine. Create ten accounts in an array with id 0, 1, . . .
 * , 9, and initial balance $100. The system prompts the user to enter an id. If
 * the id is entered incorrectly, ask the user to enter a correct id. Once an id
 * is accepted, the main menu is displayed. You can enter a choice 1 for viewing
 * the current balance, 2 for withdrawing money, 3 for depositing money, and 4
 * for exiting the main menu. Once you exit, the system will prompt for an id
 * again. Thus, once the system starts, it will not stop.
 */

package day3;

import java.util.Scanner;

/**
 * Atm
 */

import day3.Account;

public class Atm {

    // array to store accounts iid
    Account[] customerId = new Account[10];
    Scanner input = new Scanner(System.in);
    int id;
    int choiceOption;
    boolean exit = false;
    boolean isValidAccount = false;

    public static void main(String[] args) {
        Atm atm = new Atm();

        // create the customers account id
        atm.createCustomerAccounts();

        while (!atm.exit) {
            atm.startProcess();
            atm.checkId();
        }
    }

    private void startProcess() {
        System.out.println("Enter an id: ");
        this.id = input.nextInt();
    }

    private void createCustomerAccounts() {

        // id 0...9 with initial balance of $100.
        for (int i = 0; i < customerId.length; i++) {
            customerId[i] = new Account(i, 100);
        }
    }

    private void mainMenu() {
        System.out.println("Main Menu \n1: check balance \n2: withdraw \n3: deposit \n4: exit ");
        System.out.println("Enter a choice");
        this.choiceOption = input.nextInt();
        this.choiceSelected();
    }

    private void checkId() {
        for (int i = 0; i < customerId.length; i++) {
            // check for id
            if (this.id == customerId[i].getAccountId()) {
                isValidAccount = true;
            }

        }

        if (!isValidAccount) {
            System.out.println("Invalid account Please enter a valid id");
            return;
        } else {
            this.mainMenu();
            return;
        }
    }

    private void choiceSelected() {
        if (choiceOption == 1) {
            double balance = customerId[id].getAccountBalance();
            System.out.println("The balance is " + balance);
        }

        if (choiceOption == 2) {
            System.out.print("Enter amount you want to withdraw: ");
            int amount = input.nextInt();
            customerId[id].withdrawFromAccount(amount);
            System.out.println("Successful, you withdrew " + amount);
        }

        if (choiceOption == 3) {
            System.out.print("Enter amount you want to deposit: ");
            int amount = input.nextInt();
            double amountIn = customerId[id].depositToAccount(amount);
            System.out.println("Successful, you have " + amountIn + " in your account");
        }

        if (choiceOption == 4) {
            this.exit = true;
        }
    }

}