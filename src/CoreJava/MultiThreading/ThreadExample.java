package CoreJava.MultiThreading;

/*
       Multi Threading:
       ================
       Executing several tasks simultaneously where each task is a separate independent part of the
       same program is called Thread based Multi Tasking and each independent part is called Thread, and
       it is the best suitable at programming level.
       A thread is flow of execution and for every thread there is a separate job.

       We can define a thread in following 2 ways.
       1. By extending Thread class.
       2. By implementing Runnable interface.
 */
public class ThreadExample
{
    public static void main(String[] args)
    {
        MyThread1 myThread1 = new MyThread1();
        myThread1.start();
        for (int i = 0;i<10;i++)
        {
            System.out.println("In Main Thread !!");
        }
    }
}
class MyThread1 extends Thread
{
    public void run()
    {
        for (int i=0;i<10;i++)
        {
            System.out.println("In Child Thread !!");
        }
    }
}
/*
Output:
=======
In Main Thread !!
In Child Thread !!
In Child Thread !!
In Child Thread !!
In Child Thread !!
In Child Thread !!
In Child Thread !!
In Child Thread !!
In Child Thread !!
In Child Thread !!
In Child Thread !!
In Main Thread !!
In Main Thread !!
In Main Thread !!
In Main Thread !!
In Main Thread !!
In Main Thread !!
In Main Thread !!
In Main Thread !!
In Main Thread !!

 */