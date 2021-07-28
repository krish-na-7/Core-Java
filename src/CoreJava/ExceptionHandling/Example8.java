package CoreJava.ExceptionHandling;

/*
       Case 1:
       =======
        throw e
        if e refers to null then we will get Null Pointer Exception.

 */
public class Example8 {
    static ArithmeticException e;
    public static void main(String[] args){
        throw e;
    }
}
/*
 Output:
 =======
 Exception in thread "main" java.lang.NullPointerException
	at CoreJava.ExceptionHandling.Example8.main(Example8.java:13)
 */