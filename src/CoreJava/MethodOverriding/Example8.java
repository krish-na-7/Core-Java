package CoreJava.MethodOverriding;

/*
   Overriding Concept with respect to static methods:
   ==================================================
   Rule 8: We can't override static methods as non-static methods otherwise we will get compile time error.

   If Both Parent and child class methods are static then we won't get any compile time error.It seems overriding
   concept applicable for static methods but it is not overriding it is called Method Hiding.
   Compiler is responsible to take care of method resolution based on reference type in method hiding.

 */
class Parent8{
    public static void method8(){
        System.out.println("Parent Class Static Method");
    }
}
class Child8 extends Parent8{
    public static void method8(){
        System.out.println("Child Class Static Method");
    }
}
public class Example8 {
    public static void main(String[] args){
        Parent8 parent8 = new Parent8();
        parent8.method8();

        Child8 child8 = new Child8();
        child8.method8();

        Parent8 p = new Child8();
        p.method8();

    }
}
