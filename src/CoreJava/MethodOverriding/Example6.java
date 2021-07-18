package CoreJava.MethodOverriding;

/*
    Rule 6 : If any Child class method throws any Checked exception then Parent class overridden method should
    throw the same Checked exception or it's Parent type exception.Otherwise we will get Compile time error.
    But there no restrictions for un-checked exceptions.

    Examples:
    ---------
    1.  parent : public void m1() throws Exception
        child  : public void m1()
        correct approach
    2.  parent : public void m1()
        child  : public void m1() throws Exception
        in-correct approach
    3.  parent : public void m1() throws Exception
        child  : public void m1() throws IOException
        correct approach
    4.  parent : public void m1() throws IOException
        child  : public void m1() throws Exception
        in-correct approach
    5.  parent : public void m1() throws IOException
        child  : public void m1() throws FileNotFoundException
        correct approach
    6.  parent : public void m1() throws Exception
        child  : public void m1() throws EOFException,InterruptedException
        in-correct approach
    7.  parent : public void m1() throws Exception
        child  : public void m1() ArithmeticException,NullPointerException,ClassCastException
        correct approach
 */



import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Example6 {
    public static void main(String[] args){

    }
}
class Parent6{
    public void method6() throws IOException{

    }
}
class Child6 extends Parent6{
    public void method6() throws Exception{
         //Compile Time Error ==> java: method6() in CoreJava.MethodOverriding.Child6 cannot override method6()
        // in CoreJava.MethodOverriding.Parent6 overridden method does not throw java.lang.Exception
    }
}
