package CoreJava.ExceptionHandling;
/*
    Example for using throw keyword
 */
public class Example12 {
    static ArithmeticException e = new ArithmeticException();
    public static void main(String[] args){
        throw e;
    }
}
/*
    Output :
    ========
    Exception in thread "main" java.lang.ArithmeticException
	at CoreJava.ExceptionHandling.Example12.<clinit>(Example12.java:6)
 */
