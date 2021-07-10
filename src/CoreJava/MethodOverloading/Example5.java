package CoreJava.MethodOverloading;

public class Example5 {

    public void m1(int i,float j)
    {
        System.out.println("int - float");
    }
    public void m1(float i,int j)
    {
        System.out.println("float - int");
    }
    public static void main(String[] args)
    {
        Example5 c = new Example5();
        c.m1(3,3.7f);
        c.m1(7.6f,7);

        /*
        c.m1(10,10); if we pass both int values we will get ambiguous error
        java: reference to m1 is ambiguous
        both method m1(int,float) in CoreJava.MethodOverloading.Example5 and method m1(float,int)
        in CoreJava.MethodOverloading.Example5 match
         */

        /*
        c.m1(3.3f,3.5f);  if we pass both params as float values we get below error
        java: no suitable method found for m1(float,float)
    method CoreJava.MethodOverloading.Example5.m1(int,float) is not applicable
      (argument mismatch; possible lossy conversion from float to int)
    method CoreJava.MethodOverloading.Example5.m1(float,int) is not applicable
      (argument mismatch; possible lossy conversion from float to int)
      */

    }

}
