
package day2;

/**
 * (Stopwatch) Design a class named StopWatch. The class contains: Private data
 * fields startTime and endTime with getter methods. A no-arg constructor that
 * initializes startTime with the current time. A method named start() that
 * resets the startTime to the current time. A method named stop() that sets the
 * endTime to the current time. A method named getElapsedTime() that returns the
 * elapsed time for the stopwatch in milliseconds.
 */

public class StopWatch {

   private double startTime, endTime;
   private double elapsed = 0;
   private static int testVariable = 0;

   public static void main(String[] args) {
      StopWatch spw = new StopWatch();
      spw.start();

      // create a delay like action
      while (testVariable < 100000) {
         testVariable++;
      }

      spw.stop();
      spw.getElapsedTime();

      System.out.println("The is the time elapsed " + spw.getTime() + " ms");
   }

   // no arg constructor
   StopWatch() {
      this.startTime = 0;
   }

   // start method
   private void start() {
      this.startTime = System.currentTimeMillis();
   }

   // end method
   private void stop() {
      this.endTime = System.currentTimeMillis();
   }

   // time elaspsed
   private void getElapsedTime() {
      elapsed = this.endTime - this.startTime;
   }

   // getter method
   public double getTime() {
      return elapsed;
   }
}