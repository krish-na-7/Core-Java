package CoreJava.ExceptionHandling;
/*
   Exception:
   ==========
   An unexpected unwanted event that disturbs the normal flow of the program is called Exception.
   It is recommended to handle exception.Exception Handling is providing an alternate way to continue rest
   of program normally.

   Runtime stack mechanism:
   ========================
   For every threadJvm will create a runtime stack.every method call performed by that thread will be stored in corresponding
   stack.Each entry in stack is called stack frame or activation record.After completing every method call the corresponding
   entry from the stack will be removed.After completing all method calls the stack become empty and that empty stack will
   be destroyed by JVM. Just before terminating the thread.

   Default Exception Handler in Java:
   ==================================
   Inside a method if any exception occurs then method in which it is raised is responsible to create exception object by
   including the following information.
   1. Name of Exception
   2. Description of Exception.
   3. Location at which exception occurs (Stack trace)
   After creating exception object method hand overs that object to the JVM. JVM will check whether the method contains any
   exception handling code or not. If the method that doesn't contain exception handling code then JVM terminates that
   method abnormally and removes corresponding stack frame from runtime stack.
   Then JVM identifies caller method and checks whether caller method contains any exception handling code.If caller
   method doesn't contain exception handling code then JVM terminates that caller method abnormally and removes
   corresponding entry from stack.This process will be continued until main() method.If main() method also doesn't contain
   exception handling code then JVM terminates main() method abnormally and removes corresponding entry from stack.
   Then JVM handover responsibility of exception handling to default exception handler which is part of JVM.
   Default exception handler prints Exception in following format and terminates program abnormally.

   Exception in Thread "XXXXXXXXXX" Name of Exception : Description of Stack Trace.

   Throwable Class defines the following methods to print Exception Information.

          METHOD                          PRINTABLE FORMAT
       1. printStackTrace()     -  Name of Exception : Description of Exception
                                   Stack Trace
       2. toString()            -  Name of Exception : Description of Exception
       3. getMessage()          -  Description of Exception

       Internally Default Exception Handler uses printStackTrace() method to print exception information to console.
 */
public class Example1 {
    public static void main(String[] args){

        try {
            System.out.println(10/0);
        }
        catch (ArithmeticException e){
            e.printStackTrace();
            /*
            java.lang.ArithmeticException: / by zero
	at CoreJava.ExceptionHandling.Example1.main(ThreadExample.java:41)
             */

            System.out.println(e);
            // or  another way for above one is
            System.out.println(e.toString());

            //java.lang.ArithmeticException: / by zero

            System.out.println(e.getMessage());
            /// by zero
        }

    }
}
