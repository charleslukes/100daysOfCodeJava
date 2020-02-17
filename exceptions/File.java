
package exceptions;

/**
 * File
 */
public class File {

    public static void main(String[] args) {
        java.io.File file = new java.io.File("scores.txt");

        if (file.exists()) {
            System.out.println("File already exits");
            System.exit(1);
        }

        try {
            java.io.PrintWriter output = new java.io.PrintWriter(file);
            output.print("Hello Charles ");
            output.print("\nThis is a printer app ");
            output.print("I'm here for you!");

            output.close();

        } catch (Exception e) {
            e.printStackTrace();
            e.getMessage();
        }
    }
}