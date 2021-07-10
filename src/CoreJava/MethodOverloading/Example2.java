package CoreJava.MethodOverloading;

/*
      Automatic Promotion
      ====================
      While resolving overloaded methods if exact match method not available,then it will promote
      the argument to next level & checks whether method available or not.If matched method available
      it will consider it and if not available then compiler will promote it to next level and
      the process will continues all possible promotion. If not matched we will get compile time error

 */

public class Example2 {

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
        Example2 c = new Example2();
        c.m1();
        c.m1(7);
        c.m1(7.9f);
        c.m1('A');
        c.m1('z');
        c.m1(10l);

        /*  c.m1(1.7);
        java: no suitable method found for m1(double)
    method CoreJava.MethodOverloading.Example2.m1(int) is not applicable
      (argument mismatch; possible lossy conversion from double to int)
    method CoreJava.MethodOverloading.Example2.m1(float) is not applicable
      (argument mismatch; possible lossy conversion from double to float)
      */
    }
}
