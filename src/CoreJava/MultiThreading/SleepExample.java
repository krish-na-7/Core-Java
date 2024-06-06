package CoreJava.MultiThreading;
/*
    We can prevent the Thread execution by using following methods.
    1. yield()
    2. join()
    3. sleep()

    sleep() method :
    ================
    If a Thread don't want to perform any operation for a particular amount of time then we should go for sleep()
    method.

    public static native void sleep(long ms)throws InterruptedException

    public static native void sleep(long ms,int ns)throws InterruptedException

    Every sleep() method throws InterruptedException,which is checked exception hence whenever we are using sleep()
    method compulsory we should handle InterruptedException either by try catch or throws otherwise we will
    get compile time error.

 */
public class SleepExample
{
    public static void main(String[] args) throws InterruptedException
    {
        SleepDemo sleepDemo = new SleepDemo();
        sleepDemo.start();
        for(int i=0;i<10;i++)
        {
            System.out.println("In Main Thread !!");
            Thread.sleep(2000);
        }
    }
}
class SleepDemo extends Thread
{
    @Override
    public void run()
    {
        for(int i=0;i<10;i++)
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