package CoreJava.StaticControlFlow;

/*
   Whenever we are loading Child class automatically Parent class will be loaded.
   But when we load Parent class Child class won't be loaded.
   Parent class members by default available to Child class whereas Child class members by default won't be
   available to Parent class.

   Static Control Flow in case If we Run Parent Class:
   ===================================================
   1. Identification of static members(Static Variables and Static Blocks) of Parent from top to bottom.
   2. Execution of Static variables assignment and static blocks execution of Parent from top to bottom.
   3. Execution of Parent class main method.

   Static Control Flow in case If we Run Child Class:
   ==================================================
   1. Identification of static members(Static Variables and Static Blocks) from Parent to Child from top to bottom.
   2. Execution of Static variables assignment and static blocks execution from Parent to Child from top to bottom.
   3. Execution of Child class main method.
 */
public class Base {
    static int i = 10;

    static {
        method1();
        System.out.println("Base class static block");
    }

    public static void main(String[] args) {
        method1();
        System.out.println("Base main");
    }

    public static void method1() {
        System.out.println(j);
    }

    static int j = 20;
}

class Derived extends Base {
    static int x = 100;

    static {
        method2();
        System.out.println("Derived first static block");
    }

    public static void main(String[] args) {
        method2();
        System.out.println("Derived main");
    }

    public static void method2() {
        System.out.println(y);
    }

    static {
        System.out.println("Derived second static block");
    }

    static int y = 200;
}
/*

Output:
=======
1. If we run Base class(Parent class)
  Output:
  =======
  0
  base class static block
  20
  base main
2. If we run Derived class(Child class)
  Output:
  =======
  0
  base class static block
  0
  derived first static block
  derived second static block
  200
  derived main

 */
