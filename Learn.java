
/**
 * Learn
 */

// Palidrone

import java.util.*;

public class Learn {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your integers:");

        int value = input.nextInt();
        input.close();

        int number = reverse(value);
        boolean palidrone = isPalidron(value, number);

        System.out.println("This is the palidrone: " + number);
        System.out.println("Is it a palidrone true or false? " + palidrone);

    }

    public static int reverse(int input) {

        // convert the number to string
        String numbeString = String.valueOf(input);

        // buffer the number to string
        StringBuffer bufferedString = new StringBuffer(numbeString);

        // reversed string
        StringBuffer reversedString = bufferedString.reverse();

        // convert reverse string to number
        // parameter converts buffer to string
        int number = Integer.valueOf(reversedString.toString());

        return number;

    }

    public static boolean isPalidron(int input, int ans) {
        return input == ans ? true : false;
    }
}