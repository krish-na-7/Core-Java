package CoreJava.MethodOverriding;

/*
      Overriding: Whatever methods present in parent class by default available to child through inheritance.
      If child class not satisfied with parent class implementation,then child is allowed to
      redefine that method it is called Method Overriding.
      In Overriding method resolution is always taken care by JVM based on run time object.
      hence it is called Runtime Polymorphism or Late biding
 */

import javafx.scene.Parent;

public class Example1 {

    public static void main(String[] args){
        Parent1 p = new Parent1();
        p.property();
        p.car();    // -> Parent Method

        Child1 c = new Child1();
        c.property();
        c.car();    // -> Child Method

        Parent1 pc = new Child1();
        pc.car();   // -> Child Method
    }

}
class Parent1{
    public void property(){
        System.out.println("Money+Land");
    }
    public void car(){
        System.out.println("Hyundai");
    }
}
class Child1 extends Parent1{
    public void car(){
        System.out.println("Lamborghini");
    }
}