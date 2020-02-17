/**
 * (Create a directory) Write a program that prompts the user to enter a
 * directory name and creates a directory using the File’s mkdirs method. The
 * program displays the message “Directory created successfully” if a directory
 * is created or “Directory already exists” if the directory already exists.
 */

package exceptions;

/**
 * CreateFile
 */

import java.util.*;

public class CreateFile {

    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter a directory name: ");

            String directoryName = input.next();
            java.io.File file = new java.io.File(directoryName);

            if (file.mkdir()) {
                System.out.println("Directory created successfully");
            } else {
                System.out.println("Directory already exits");
            }

        } catch (InputMismatchException e) {
            System.out.println("Input must be a valid string");
        }

    }

}