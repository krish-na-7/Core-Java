package CoreJava.MethodOverriding;

/*
      Rule 3 : Parent class private methods not available to the child class and hence overriding concept
      is not applicable for private methods.Based on our requirement we can have exactly same private
      method in child class it is valid but not overriding.
 */

public class Example3 {
    public static void main(String[] args)
    {
        Parent3 p = new Parent3();

        p.show();    // -> Parent Method

        Child3 c = new Child3();

        c.show();    // -> Child Method

        Parent3 pc = new Child3();
        pc.show();   // -> Child Method
    }
}
class Parent3{

     void show(){
        System.out.println("Parent Class Private Method");
    }
}
class Child3 extends Parent3{
     void show(){
        System.out.println("Child Class Private Method");
    }
}