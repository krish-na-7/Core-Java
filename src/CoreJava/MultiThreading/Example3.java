package CoreJava.MultiThreading;

/*
     Scenario 3:
     ===========
     If we are not overriding Thread class run() method the Thread class run() method will be executed which has
     empty implementation. Hence, we won't get any output.
     It is highly recommended overriding Thread class run() method otherwise don't go for Multi Threading concept.
 */

public class Example3
{
    public static void main(String[] args)
    {
        MyThread4 t = new MyThread4();
        t.start();
    }
}
class MyThread4 extends Thread
{

}

/*
Output:
=======


 */