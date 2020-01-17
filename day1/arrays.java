package day1;

/**
 * Print distinct numbers) Write a program that reads in ten numbers 
 * and displays the number of distinct numbers and the distinct numbers 
 * separated by exactly one space (i.e., if a number appears multiple 
 * times, it is displayed only once). (Hint: Read a number and store it 
 * to an array if it is new. If the number is already in the array, ignore it.) 
 * After the input, the array contains the distinct numbers. Here is the 
 * sample run of the program
 */

import java.util.*;

public class arrays {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of items you want to check");

        int number = input.nextInt();

        int[] numberArray = new int[number];
        int counter = 0;

        System.out.println("Enter the number your want to check: ");

        for (int i = 0; i < number; i++) {
            int item = input.nextInt();
            // check the number array if item is there already

            if (isDistinct(numberArray, item)) {
                numberArray[i] = item;
                counter++;
            }

        }
        System.out.println("The number of distinct number is " + counter);
        System.out.print("The distinct numbers are: ");
        for (int i : numberArray) {
            if (i > 0) {
                System.out.print(i);
            }
        }

        input.close();

    }

    public static boolean isDistinct(int[] number, int item) {
        // if number is present
        for (int i : number) {
            if (i == item) {
                return false;
            }
        }

        return true;
    }
}