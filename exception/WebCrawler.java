package exception;

/**
 * WebCrawler
 */
import java.io.*;
import java.util.*;

public class WebCrawler {

    public static void main(String[] args) {

        System.out.println("Enter a Url");

        String urlString = new Scanner(System.in).next();

        try {
            java.net.URL url = new java.net.URL(urlString);

            // count the words in the web
            int count = 0;

            // create a scanner object
            Scanner input = new Scanner(url.openStream());

            while (input.hasNext()) {
                String line = input.nextLine();
                count += line.length();
            }

            System.out.println("The file size is " + count + " characters");
            input.close();

        } catch (java.net.MalformedURLException ex) {
            ex.printStackTrace();
            System.out.println("In valid url");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("An error occured");
        }
    }
}