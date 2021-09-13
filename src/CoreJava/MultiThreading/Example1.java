package CoreJava.MultiThreading;

/*
        Thread Scheduler:
        =================
        It is a part of JVM, and it is responsible to schedule Thread i.e, if multiple Threads are waiting to get
        a chance for execution then in which order Threads will be executed is decided by Thread Scheduler.
        We can't expect exact algorithm followed by Thread Scheduler it varied from JVM to JVM.

        Scenario 1:
        ===========
        In case of t.start() a new thread will be created which is responsible for the execution of run() method,
        but in case of t.run() a new thread won't be created and just run like a normal method call by main thread.
        Hence, if we replace t.start() with t.run() then it will follow normal execution.

        start() method is responsible to register the Thread with Scheduler and all mandatory activities.Hence, without
        executing Thread class start() method there is no chance of starting a new Thread in java.

        start()
        {
            1. Register Thread with Scheduler.
            2. Perform all other mandatory activities.
            3. Invoke run() method.
        }
 */
public class Example1
{
    public static void main(String[] args)
    {
        MyThread2 t = new MyThread2();
       // t.start();  => New Thread will be created.
        t.run(); // => New Thread won't be created and normal method call
        for(int i=0;i<10;i++)
        {
            System.out.println("Main Thread");
        }
    }
}
class MyThread2 extends Thread
{
    public void run()
    {
        for(int i=0;i<10;i++)
        {
            System.out.println("Child Thread");
        }
    }
}
/*
Output:
=======
Child Thread
Child Thread
Child Thread
Child Thread
Child Thread
Child Thread
Child Thread
Child Thread
Child Thread
Child Thread
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

 */