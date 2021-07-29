package CoreJava.ExceptionHandling;

public class Example17 {
    public static void main(String[] args) {
        throw new Exception();
        // Exception is checked Exception. we cannot use throw for Checked Exceptions
    }
}
/*
Output:
=======
        java: unreported exception java.lang.Exception; must be caught or declared to be thrown
*/
