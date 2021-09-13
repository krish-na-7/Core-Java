package CoreJava.MultiThreading;

/*
        Scenario 4:
        ===========
        If we override Thread class start() method then our start() method will be executed like a normal method call
        and New Thread won't be created, and it won't call Thread class start() method.
        It is not recommended overriding Thread class start() method otherwise don't go for Multi Threading concept.
 */

public class Example4
{
    public static void main(String[] args)
    {
        MyThread5 t = new MyThread5();
        t.start();
        System.out.println("main method");
    }
}
class MyThread5 extends Thread
{
    public void run()
    {
        System.out.println("run method");
    }
    public void start()
    {
        System.out.println("start method");
    }
}

/*
both statements produced by main Thread

Output:
=======
start method
main method

 */
