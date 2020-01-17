
/**
 * (Sort students) Write a program that prompts the user to enter the number of
 * students, the students’ names, and their scores, and prints student names in
 * decreas- ing order of their scores.
 */
import java.util.*;

public class arrays2 {

    public static void main(String[] args) {
        String studentName;
        int numberOfStudents, studentScore;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the number of students: ");
        numberOfStudents = input.nextInt();

        // name array
        String[] studentsNameArray = new String[numberOfStudents];

        System.out.println("Please enter the " + numberOfStudents + " students name and score");
        for (int i = 0; i < numberOfStudents; i++) {

            System.out.println(i++ + " Student name: ");
            studentName = input.nextLine();

            System.out.println(i++ + " Student score: ");
            studentScore = input.nextInt();

        }

    }
}