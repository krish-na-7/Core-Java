package CoreJava.ExceptionHandling;

/*
       throw keyword:
       ==============
       We can create exception object explicitly and we can handover to JVM manually for this we have to use throw keyword

       throw new ArithmeticException("/ by zero")
       -----  ----------------------------------
         |                 |->    Creation of Arithmetic Exception object explicitly
         -->  Handover our created exception object to JVM manually

        Hence the main objective of throw keyword is to handover our created exception object manually.
        The throw keyword is best for the use of customized exception (or) user defined exception.

 */

public class Example7 {
    public static void main(String[] args){
        throw new ArithmeticException("/ by zero");
    }
}
/*
    Output:
    =======
    Exception in thread "main" java.lang.ArithmeticException: / by zero
	at CoreJava.ExceptionHandling.Example7.main(Example7.java:20)
 */