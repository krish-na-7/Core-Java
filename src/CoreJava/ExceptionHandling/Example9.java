package CoreJava.ExceptionHandling;

/*
    After throw statement we are not allowed to write any statement directly otherwise
    we get compile time error saying "unreachable statement".
 */
public class Example9 {
    public static void main(String[] args){
        throw new ArithmeticException("/ by zero");
       /* System.out.println("UnReachable Statement");*/
    }
}
/*
    Output:
    =======
    java: unreachable statement
 */