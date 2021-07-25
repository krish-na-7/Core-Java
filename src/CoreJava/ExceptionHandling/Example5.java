package CoreJava.ExceptionHandling;
/*
    In try catch finally blocks Order is Important.
    Whenever we are writing catch block compulsory try block must be required.
    Compiler Error Message : Catch without Try Block is Invalid
    Inside Try,Catch and Finally blocks we can declare Try,Catch and Finally blocks i.e,
    Nesting of try,catch and finally is possible.
    For try,catch and finally {} curly braces are mandatory.
 */
public class Example5 {
    public static void main(String[] args){

        catch (ArithmeticException e)
        {
            e.printStackTrace();
            System.out.println("In Catch Block");
        }

    }
}
/*
Output:
=======
        java: 'catch' without 'try'
 */
