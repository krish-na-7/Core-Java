package CoreJava.MethodOverloading;

/*
   Two methods are said to be overloaded if both methods have same name and different
   argument types.
   Method overloading reduces the complexity of programming in java.
   In overloading method resolution taken by compiler based reference hence it is called as
   Compile time polymorphism or early binding or static polymorphism.

   abs(int i)
   abs(long l)   ==> all are overloaded methods
   abs(float f)

 */
public class Example1 {

    public void m1()
    {
        System.out.println("No - arg ");
    }

    public void m1(int i)
    {
        System.out.println("int - arg");
    }
    public void m1(float i)
    {
        System.out.println("float - arg");
    }
    public static void main(String[] args)
    {
        Example1 c = new Example1();
        c.m1();
        c.m1(7);
        c.m1(7.9f);
        c.m1('A');
        c.m1('z');
        c.m1(10L);
    }

}
