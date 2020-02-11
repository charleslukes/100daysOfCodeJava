/**
 * (ArrayIndexOutOfBoundsException) Write a program that meets the following requirements:
   Creates an array with 100 randomly chosen integers.
   Prompts the user to enter the index of the array, then displays the 
   corresponding element value. If the specified index is out of bounds, display the 
   message Out of Bounds.
 */

package exception;

/**
 * ArrayOutOfBound
 */

import java.util.*;

public class ArrayOutOfBound {
    static int[] array = new int[100];

    public static void main(String[] args) {

        try (Scanner userInput = new Scanner(System.in)) {
            System.out.print("Enter the array index you want to search for: ");
            populateArr();
            int input = userInput.nextInt();

            int value = array[input];

            System.out.println(value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Out of Bound");
        }

    }

    private static void populateArr() {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
    }
}