package CoreJava.ExceptionHandling;

/*
     Exception Hierarchy:
     ====================
     Throwable class acts as the root of Java exception hierarchy.Throwable class defines 2 child classes.
     1. Exception
     2. Error

     1. Exception :
     --------------
     Most of the times Exceptions are caused by our program and these are recoverable.For example if our program requirement
     is to read data from remote file location ad=t london.At runtime if remote file is not available then we will get
     runtime exception saying "File Not Found Exception".Then we can provide local file and continue rest of program
     execution normally.

     2. Error:
     ---------
     Errors are not caused by our program and these are due to lack of system resources.Errors are non recoverable.For example
     if out of memory occurs being a programmer we can't do anything and the program will be terminated abnormally.System admin
     or server admin is responsible to increase heap memory.

     The way of Handling an exception is varied from exception to exception hence every exception type it is highly
     recommended to take separate catch block i.e, try with multiple catch block is possible and recommended to use.
 */
public class Example2 {

    public static void main(String[] args){

        /* Example of try with multiple catch blocks
           Try with multiple catch blocks is possible and recommended to use.
           If try with multiple catch block present then the order of catch block is very important.
           we have to use to take child exception first and then parent exception next.Otherwise we get compile time error
           saying "Exception XXXXXXXXXXX" has already been caught.
        */
        try {
            System.out.println(10/0);
            String s= null;
            System.out.println(s.length());

        }
        catch (ArithmeticException | NullPointerException e)
        {
            e.printStackTrace();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
/*   output:
    java.lang.ArithmeticException: / by zero
    at CoreJava.ExceptionHandling.Example2.main(RunnableExample.java:34)*/
}

/*
     We can't Declare 2 catch blocks for the same Exception otherwise we get compile time error
     "Exception XXXXXXXXXXX" has already been caught.

     try {
            System.out.println(10/0);
            String s= null;
            System.out.println(s.length());

        }
        catch (ArithmeticException e)
        {
            e.printStackTrace();
        }
        catch (ArithmeticException e)
        {
            e.printStackTrace();
        }
 */
