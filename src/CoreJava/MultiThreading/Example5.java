package CoreJava.MultiThreading;

/*
        Scenario 5:
        ===========
        Calling Thread class start() method with super keyword.

 */

public class Example5
{
    public static void main(String[] args)
    {
        MyThread6 t = new MyThread6();
        t.start();
        System.out.println("Main Method");
        for(int i=0;i<10;i++)
        {
            System.out.println("Main Thread");
        }
    }
}
class MyThread6 extends Thread
{
    public void start()
    {
        super.start();      // => this statement will call Thread class start() method
        System.out.println("start method");
    }
    public void run()
    {
        System.out.println("run method");
        for(int i=0;i<10;i++)
        {
            System.out.println("Child Thread");
        }
    }
}

/*
Output:
=======
start method
run method
Child Thread
Child Thread
Child Thread
Child Thread
Main Method
Main Thread
Main Thread
Main Thread
Main Thread
Main Thread
Main Thread
Main Thread
Main Thread
Main Thread
Main Thread
Child Thread
Child Thread
Child Thread
Child Thread
Child Thread
Child Thread

 */