package CoreJava.ExceptionHandling;

/*
      Example of throws keyword:
      =========================
      throws keyword is used for only checked exception and usage of throws keyword for unchecked exception there is
      no use or impact.
      throws keyword is required only to convince the compiler.
      Usage of throws keyword doesn't prevent abnormal termination of program.
 */

public class Example14 {
    public static void main(String[] args) throws InterruptedException{
        Thread.sleep(10000);
    }
}
