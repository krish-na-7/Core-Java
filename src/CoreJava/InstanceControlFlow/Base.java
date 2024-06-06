package CoreJava.InstanceControlFlow;

/*
   Instance Control Flow:
   ======================
   Whenever we are creating a Child object the following sequence of events will be performed automatically,
   as part of Instance control flow.

   1. Identification of Instance variables and Instance Blocks from Parent to Child top to bottom.
   2. Execution of Instance variable assignment and Instance blocks of Parent from top to bottom.
   3. Execution of Parent constructor.
   4. Execution of Instance variable assignment and Instance blocks of Child from top to bottom.
   5. Execution of Child constructor.

* */

public class Base {
    int i = 10;

    {
        method1();
        System.out.println("In base class Instance block");
    }

    Base() {
        System.out.println("In Base Constructor");
    }

    public static void main(String[] args) {
        Base b = new Base();
        b.method1();
        System.out.println("In base main");
    }

    public void method1() {
        System.out.println(j);
    }

    int j = 20;
}


class Derived extends Base {
    int x = 100;

    {
        method2();
        System.out.println("In derived first Instance block");
    }

    Derived() {
        System.out.println("In Derived Constructor");
    }

    public static void main(String[] args) {
        Derived d = new Derived();
        d.method2();
        System.out.println("In derived main method");
    }

    public void method2() {
        System.out.println(y);
    }

    {
        System.out.println("In derived second Instance block");
    }

    int y = 200;

}
/*

Output:
=======
1. If we run Base class(Parent class)
  Output:
  =======
  0
  In base class Instance block
  In Base Constructor
  20
In base main
2. If we run Derived class(Child class)
  Output:
  =======
  0
  In base class Instance block
  In Base Constructor
  0
  In derived first Instance block
  In derived second Instance block
  In Derived Constructor
  200
  In derived main method

 */
