package CoreJava.ExceptionHandling;

/*
      throws keyword:
      ===============
      In our program if there is a chance of raising checked exception then compulsory we should handle that
      checked exception otherwise we will get compile time error saying "UnReported Exception XXXXXXXXXX; must be
      caught or declared to be thrown".
      We can handle this type of exception either by using try catch block or throws keyword.
      We can use throws keyword to delegate the responsibility of exception handling to the caller method(it may be another
      method or JVM) then caller method is responsible to handle that exception.


 */
public class Example13 {
    public static void main(String[] args){
       Thread.sleep(10000);
    }
}

/*
    Output:
    =======
            java: unreported exception java.lang.InterruptedException; must be caught or declared to be thrown
*/


