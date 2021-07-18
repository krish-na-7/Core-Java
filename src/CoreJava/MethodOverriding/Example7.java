package CoreJava.MethodOverriding;

/*
   Rule 7 : Parent class abstract methods we should override in child class to provide implementation.
   we can override non-abstract method in parent class as abstract.The main advantage of this approach is
   we can stop the availability of parent method implementation to the next level child class.
   In Overriding the following access modifiers won't keep any restrictions are synchronized,native strictfp.
 */

public class Example7 {
    public static void main(String[] args){

    }
}
abstract class Parent7{
    public void m1(){

    }
    public abstract void m2();
}
abstract class Child7 extends Parent7{
    public abstract void m1();
    public void m2(){

    }
}