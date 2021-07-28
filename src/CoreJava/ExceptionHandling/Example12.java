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
