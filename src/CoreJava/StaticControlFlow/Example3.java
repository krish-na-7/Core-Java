package CoreJava.StaticControlFlow;

/*
   Static Control Flow:
   --------------------
   Static Blocks are executed at time of class loading.At time of class loading if we want to perform any activity
   we have to define that in static block.
   At time of class loading the corresponding native libraries should be loaded, hence we have to define this
   activity inside static block.

   class Test
   {
      static
      {
          System.loadlibrary("native library path");
      }
   }
   Within a class we can declare any no of static blocks, but all these static blocks will be executed
   from top to bottom. Without writing main method we can print some statements to the console by using static blocks.
   But from 1.7 version without main method it is possible to print statements to the console,
   and we can't execute the program.

   Static Control Flow
   ===================
   1. Identification of static members(Static Variables and Static Blocks) from top to bottom.
   2. Execution of STATIC variable assignment and static block execution from top to bottom.
   3. Execution of main method.
 */
public class Example3 {
    static int i = 10;

    static {
        method1();
        System.out.println("First Static Block");
    }

    public static void main(String[] args) {
        method1();
        System.out.println("In Main Method");
    }

    public static void method1() {
        System.out.println(j);
    }

    static {
        System.out.println("Second Static Block");
    }

    static int j = 20;
}
/*
Output:
=======

0
First Static Block
Second Static Block
20
In Main Method

 */