package CoreJava.ExceptionHandling;

/*
    In try catch finally blocks Order is Important.
    Whenever we are writing try compulsory we should write either catch or finally block otherwise we will get
    compile time error i.e,
    Compiler Error Message : Try without Catch or Finally is Invalid

    Inside Try,Catch and Finally blocks we can declare Try,Catch and Finally blocks i.e,
    Nesting of try,catch and finally is possible.
    For try,catch and finally {} curly braces are mandatory.
 */

public class Example4 {

    public static void main(String[] args){

        try
        {
            System.out.println(10/0);
            System.out.println("In Try Block");
        }

    }
}
/*
    Output:
    =======
    java: 'try' without 'catch', 'finally' or resource declarations
 */
