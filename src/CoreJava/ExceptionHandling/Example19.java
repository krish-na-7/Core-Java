package CoreJava.ExceptionHandling;

/*
      FullyChecked Vs Partially Checked Exception:
      ============================================
      A checked Exception is said to be fully checked exception if and only if all it's child classes also Checked
      Exception.Examples are IO Exception, Interrupted Exception.

      A Checked Exception is also said to be partially checked if and only if some of it's child classes
      are Unchecked Exception.Examples are Exception, Throwable.

      The only possible Partial Checked Exception In Java are Exception and Throwable.

      -> Within try block if there is no chance of raising an exception then we can't write catch block for that exception
      otherwise we will get compile time error saying "Exception XXXXXXXX is never thrown in body of corresponding try
      statement". but this rule is applicable for only full checked exception.

 */

import java.io.IOException;

public class Example19 {

    public static void main(String[] args){
        try{
            System.out.println("Hello");
            System.exit(1);
        }
        catch (IOException e){

            // Here IOException is an example of Fully Checked Exception.
        }
    }

}
/*
Output:
=======
        java: exception java.io.IOException is never thrown in body of corresponding try statement*/
