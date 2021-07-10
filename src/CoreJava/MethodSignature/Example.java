package CoreJava.MethodSignature;

/* Method Signature consist of method name followed by argument types
   and method return type is not part of method Signature
     example : method name(arg1 , arg2)
                add(int a,int b)

     public static int add(int i,float f)  ==>  add(int,float)

     For every class compiler will maintain a method table.
     Compiler will use that method signature to resolve the method calls.

     class Example
     --------------
     |  m1(int)   |
     --------------
     | m2(String) |
     --------------
     Method Table


  */

public class Example {

    public void m1(int i)
    {
        System.out.println(i);
    }
    /*public void m1(int a)      Error:(13, 17) java: method m1(int) is already defined in class MethodSignature.Class1
    {
        System.out.println(a);
    }*/

    public void m2(String s){
        System.out.println(s);
    }

    public static void main(String[] args){
        Example c = new Example();
        c.m1(7);
        c.m2("ram");
        // c.m3(10.4);     Error:(25, 10) java: cannot find symbol
        //  symbol:   method m3(double)
        //  location: variable c of type MethodSignature.Class1

    }
}
