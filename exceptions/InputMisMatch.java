/**
 * (InputMismatchException) Write a program that prompts the user 
 * to read two integers and displays their sum. Your program should 
 * prompt the user to read the number again if the input is incorrect
 */

package exceptions;

import java.util.*;

/**
 * InputMisMatch
 */
public class InputMisMatch {

    public static void main(String[] args) {
        System.out.println("Enter two numbers");

        // using a try resource to close resources.
        try (Scanner input = new Scanner(System.in)) {

            int firstNum = input.nextInt();
            int secondNum = input.nextInt();

            // displays result when user input is correct.
            System.out.println(firstNum + secondNum);

        } catch (InputMismatchException e) {
            // displays this when user input is not a number.
            System.out.println("Input must be a number ");
        }

    }
}