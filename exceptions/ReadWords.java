
package exceptions;


/**
 * The program reads the words stored in a text file named hangman.txt. Words
 * are delimited by spaces
 */

import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

class ReadWords {

    public static void main(String[] args) {
        int count = 0;
        File file = new File("hangman.txt");

        try (Scanner input = new Scanner(file)) {

            while (input.hasNext()) {
                count++;
                System.out.println(count);
                input.next();
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}