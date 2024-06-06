package CoreJava.InstanceControlFlow;

/*
   Instance Control Flow:
   ======================
   Whenever we are executing a java class first static members will be executed in Static Control Flow, if we're creating
   an object then the following sequence of events will be executed as a part of Instance Control Flow.

   1. Identification of Instance variables and Instance Blocks from top to bottom.
   2. Execution of Instance variable assignment and instance blocks from top to bottom.
   3. Execution of constructor.

   Static Control Flow is one time activity which will be performed at the time of class loading, but Instance Control
   Flow is not one time activity, and it will be performed for every object creation.
   So object creation is the most costly operation if there is no specific requirement then it is not
   recommended creating object.
 */
public class Example1 {
    int i = 10;

    {
        m1();
        System.out.println("In First Instance block");
    }

    Example1() {
        System.out.println("In Constructor");
    }

    public static void main(String[] args) {
//        new Example1();
        Example1 example1 = new Example1();
        example1.m1();
        System.out.println("In Main method");
    }

    public void m1() {
        System.out.println(j);
    }

    {
        System.out.println("In Second Instance block");
    }

    int j = 20;
}
/*
Output:
=======
0
In First Instance block
In Second Instance block
In Constructor
0
In First Instance block
In Second Instance block
In Constructor
20
In Main method

 */