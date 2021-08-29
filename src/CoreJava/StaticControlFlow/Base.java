package CoreJava.StaticControlFlow;

/*
   Whenever we are loading Child class automatically Parent class will be loaded.
   But when we load Parent class Child class won't be loaded.
   Parent class members by default available to Child class whereas Child class members by default won't be
   available to Parent class.
 */
public class Base {
    static int i=10;
    static {
        method1();
        System.out.println("base class static block");
    }
    public static void main(String[] args){
        method1();
        System.out.println("base main");
    }
    public static void method1(){
        System.out.println(j);
    }
    static int j=20;
}
class Derived extends Base{
    static int x=100;
    static {
        method2();
        System.out.println("derived first static block");
    }
    public static void main(String[] args){
        method2();
        System.out.println("derived main");
    }
    public static void method2()
    {
        System.out.println(y);
    }
    static {
        System.out.println("derived second static block");
    }
    static int y=200;
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
