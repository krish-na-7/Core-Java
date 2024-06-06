package CoreJava.ExceptionHandling;
/*
    In try catch finally blocks Order is Important.
    Whenever we are writing finally block compulsory try block must be required.
    Compiler Error Message : Finally without Try Block is Invalid

    Inside Try,Catch and Finally blocks we can declare Try,Catch and Finally blocks i.e,
    Nesting of try,catch and finally is possible.
    For try,catch and finally {} curly braces are mandatory.
 */
public class Example6 {
    public static void main(String[] args){
        /*finally
        {
            System.out.println("Clean Up Code");
        }*/
    }
}
/*
Output:
=======
        java: 'finally' without 'try'
*/
