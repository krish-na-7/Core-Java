package CoreJava.MethodOverriding;

/*
    Rule 4 : We can't override parent class final methods in child class, If we override we
    will get compile time error.
 */

public class Example4{

    public static void main(String[] args){

    }

}
class Parent4{
    public final void print(){
        System.out.println("Good Morning");
    }
}
class Child4 extends Parent4{
    public final void print(){
        // Compile time error ==> java: print() in CoreJava.MethodOverriding.Child4 cannot override print() in
        // CoreJava.MethodOverriding.Parent4 overridden method is final
        System.out.println("Good Afternoon");
    }
}
