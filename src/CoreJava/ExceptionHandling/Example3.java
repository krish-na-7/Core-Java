package CoreJava.ExceptionHandling;

/*
   Checked Exception:
   ==================
   The exceptions which are checked by compiler for smooth execution of program are checked exception.
   In our program if there is a chance of rising an exception then compulsory we should handle that checked exception
   either by try catch or throws keyword otherwise we get compile time error.

   Un-Checked Exception:
   =====================
   The exceptions which are not checked by compiler such type of exceptions are called Un-Checked Exception.
   Runtime Exceptions and it's child classes, Errors and it's child classes are Un-Checked Exception.
   Except these the remaining are Checked Exception.
   The Code which may raise an exception called risky code and we have to define that code inside try block
   and corresponding code we have to define inside catch block.

   Finally block:
   --------------
   Finally is a block always associated with try catch to maintain cleanup code. The speciality of finally block is it
   will be executed always irrespective of whether exception is raised or not and whether exception is handled or not handled.
     
 */

public class Example3 {

public static void main(String[] args){

    try
    {
        System.out.println(10/0);
        System.out.println("In Try Block");
    }
    catch (ArithmeticException e)
    {
        e.printStackTrace();
        System.out.println("In Catch Block");
    }
    catch (Exception e)
    {
        e.printStackTrace();
    }
    finally
    {
        System.out.println("Clean Up Code");
    }
 }
}
/*
Output:
========
java.lang.ArithmeticException: / by zero
	at CoreJava.ExceptionHandling.Example3.main(Example3.java:35)
In Catch Block
Clean Up Code

Note:
=====
   Within try block any where an exception raised then rest of the try block won't be executed even though we handled the
   exception.Within try block we have to take risky code and length of try block should be as less as possible.
   There may be a chance of raising exception in side catch and finally block.
 */
