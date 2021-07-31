package CoreJava.ExceptionHandling;

/*
TryWithResource:
================
   -> Until 1.6v it is highly recommended closing resources which are opened as a part of finally block.
   -> The Problem in 1.6v approach are compulsory programmer is required to close resources inside finally block, and it
   increases complexity of programming.
   -> We have to write finally block compulsory and hence it increases length of code and reduces readability.
   -> In 1.7v the try with resources the advantage is whatever resources we opened as a part of try block will be closed
   automatically once control reaches end of the try block either normally or abnormally. We are not required to close
   explicitly and reduces complexity and no need to write finally block.
   -> We can declare multiple resources but these resources should be separated with semi-colon (;).
        try(Resource1; Resource2; Resource3){

        }
   -> All resources should be auto closable resources.A resource is said to be auto closable if and only if corresponding
   Class implements AutoCloseable Interface.
   -> All IO related, Database related and network related resources are already implemented AutoCloseable Interface.
   -> In 1.7v AutoCloseable interface came, and it contains only one method
      close ()  ->  public void close()
   -> All resource reference variables are implicitly final, within try block. We can't perform reassignment otherwise
   we will get compile time error.
   -> Until 1.6v try block should be associated with either catch or finally block from 1.7v onwards we can take only
   try with resource without taking catch or finally.
 */

import java.io.FileWriter;
import java.io.IOException;

public class TryWithResource {

    public static void main(String[] args){
        try(FileWriter fw1 = new FileWriter("A.txt");FileWriter fw2 = new FileWriter("A.txt")){

        }
        catch (IOException e){

        }
    }

}
