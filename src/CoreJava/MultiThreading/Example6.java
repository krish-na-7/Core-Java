package CoreJava.MultiThreading;

/*
        Scenario 6:
        ===========
        After starting a Thread if we try to restart the same Thread then we will get Runtime Exception saying
        IllegalThreadStateException .

 */

public class Example6
{
    public static void main(String[] args)
    {
        MyThread7 t = new MyThread7();
        t.start();
        System.out.println("Main Thread");
        t.start();
    }
}
class MyThread7 extends Thread
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
Main Thread
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
Exception in thread "main" java.lang.IllegalThreadStateException
	at java.lang.Thread.start(Thread.java:708)
	at CoreJava.MultiThreading.Example6.main(Example6.java:16)

Process finished with exit code 1

 */