package CoreJava.ExceptionHandling;

/*
    In Multi Catch Block there should not be any relation between exception types.Either child to parent or parent to child
    or same type otherwise we will get compile time error.
 */

public class MultiCatchBlockError {
    public static void main(String[] args){

        try {
            System.out.println(10/0);
            String s= null;
            System.out.println(s.length());

        }
        catch (ArithmeticException | Exception e){
            e.printStackTrace();

        }
    }
}
/*
Output:
=======
        java: Alternatives in a multi-catch statement cannot be related by subclassing
        Alternative java.lang.ArithmeticException is a subclass of alternative java.lang.Exception
        */
