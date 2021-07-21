package CoreJava.MethodOverriding;

import javafx.scene.Parent;

/*
     Rule 9: Overriding with respect to Var-arg parameter methods.
     We can Override methods having var-arg parameter  with another methods having var-arg parameter only.
     If we try to override with normal method parameter it will become overloading but not overriding.

 */
class Parent9{
    public void method9(int...x){
        System.out.println("Parent Class Int Var-Arg Parameter Method");
    }
}
class Child9 extends Parent9{
    public void method9(int...y){
        System.out.println("Child Class Int Var-Arg Parameter Method");
    }
}
public class Example9 {
    public static void main(String[] args){
        Parent9 parent9 = new Parent9();
        parent9.method9(1,2,3);

        Child9 child9 = new Child9();
        child9.method9(5,6,7,8,9);

        Parent9 p = new Child9();
        p.method9(1,2,3,4,5,6,7);

        /*Output:
        =========================================
        Parent Class Int Var-Arg Parameter Method
        Child Class Int Var-Arg Parameter Method
        Child Class Int Var-Arg Parameter Method*/
    }
}
