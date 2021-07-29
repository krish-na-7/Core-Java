package CoreJava.ExceptionHandling;

public class Example18 {
    public static void main(String[] args){
        throw new Error();
        //Error is of type Unchecked Exception. throw keyword is only used for Unchecked Exception
    }
}
/*
Output:
=======
        Exception in thread "main" java.lang.Error
        at CoreJava.ExceptionHandling.Example18.main(Example18.java:5)
*/
