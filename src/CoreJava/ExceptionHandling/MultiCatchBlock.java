package CoreJava.ExceptionHandling;

/*
     MultiCatchBlock:
     ================
     Until 1.6v even though multiple different exceptions having same handling code.For exception, we have to write
     a separate catch block it increases length of code and reduces readability.
     To Overcome this problem in 17.v MultiCatchBlock got introduced with this we can write single catch block that
     can handle multiple different types of exception.

 */

public class MultiCatchBlock {
    public static void main(String[] args){

        try {
            System.out.println(10/0);
            String s= null;
            System.out.println(s.length());

        }
        catch (ArithmeticException | NullPointerException e){
            e.printStackTrace();

        }
    }
}
/*
Output:
=======
        java.lang.ArithmeticException: / by zero
        at CoreJava.ExceptionHandling.MultiCatchBlock.main(MultiCatchBlock.java:20)*/
