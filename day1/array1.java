
package day1;

/**
 * (Sort students) Write a program that prompts the user to enter the number of
 * students, the students’ names, and their scores, and prints student names in
 * decreasing order of their scores.
 */

import java.util.*;

public class array1 {
    public static void main(String[] args) {
        String studentName;
        int numberOfStudents, studentScore;
        int[] copiedArray;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the number of students: ");
        numberOfStudents = input.nextInt();

        // name array
        String[] studentsNameArray = new String[numberOfStudents];
        int[] studentScoreArray = new int[numberOfStudents];

        System.out.println("Please enter the " + numberOfStudents + " students name and score");
        for (int i = 0; i < numberOfStudents; i++) {

            int num = 1 + i;
            System.out.println("Enter student " + num + " name");
            studentName = input.next();
            populateArray(studentsNameArray, studentName, i);

            System.out.println("Enter student " + num + " number");
            studentScore = input.nextInt();
            populateArray(studentScoreArray, studentScore, i);

        }

        copiedArray = copyArray(studentScoreArray);
        sortArray(studentScoreArray);

        int[] decreasingOrder = descendingOrder(studentScoreArray);

        String[] values = studentsNameByScores(copiedArray, decreasingOrder, studentsNameArray);
        System.out.println("Students scores in decresing order " + Arrays.toString(values));

        input.close();

    }

    // a method to populate the score array
    public static void populateArray(int[] students, int score, int index) {
        students[index] = score;
    }

    // method overloading, populates the names array
    public static void populateArray(String[] students, String name, int index) {
        students[index] = name;
    }

    // this method copies the values of the original array
    public static int[] copyArray(int[] studentsScores) {
        int[] copyArr = new int[studentsScores.length];

        for (int i = 0; i < studentsScores.length; i++) {
            copyArr[i] = studentsScores[i];
        }

        return copyArr;
    }

    // sorts the array ascending order by default
    public static void sortArray(int[] studentsScores) {
        Arrays.sort(studentsScores);
    }

    // sorts the array descending order
    public static int[] descendingOrder(int[] studentsScores) {
        int[] descendingArr = new int[studentsScores.length];
        for (int i = studentsScores.length - 1, j = 0; i >= 0; i--, j++) {
            descendingArr[j] = studentsScores[i];
        }

        return descendingArr;
    }

    // gets the students names
    public static String[] studentsNameByScores(int[] copiedScores, int[] sortedScores, String[] studentsNames) {

        String[] students = new String[copiedScores.length];

        for (int i = 0; i < sortedScores.length; i++) {

            for (int j = 0; j < copiedScores.length; j++) {
                if (sortedScores[i] == copiedScores[j]) {
                    // get the name at that index
                    String name = studentsNames[j];
                    students[i] = name;
                }
            }

        }

        return students;
    }

}
