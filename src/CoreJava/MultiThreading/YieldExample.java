package CoreJava.MultiThreading;

/*
    We can prevent the Thread execution by using following methods.
    1. yield()
    2. join()
    3. sleep()

    yield() method :
    ================
    It causes to pause current executing Thread to give chance for waiting Thread of same priority.
    If there is no waiting Thread (or) all waiting Threads having low priority then same Thread can continue its execution
    If multiple Threads are waiting with same priority then which waiting Thread will get chance we can;t expect it
    depends on Thread Scheduler.
    The Thread which is yielded when it will get chance once again it depends on Thread Scheduler, and we can't
    expect exactly.

    public static void native yield();

    In the program if we are commenting line - 1 then both Threads will be executed simultaneously, and we can't expect
    which Thread completed 1st.
    If we are not commenting line - 1 child Thread calls yield method because of that main Thread will get more chances
    of completing main Thread is high.
    The Thread which requires more processing time is recommended to call yield() method frequently.

 */
public class YieldExample
{
    public static void main(String[] args)
    {
        ThreadYieldDemo threadYieldDemo = new ThreadYieldDemo();
        threadYieldDemo.start();

        for(int i = 0 ;i<10;i++)
        {
            System.out.println("In Main Thread !!");
            //Thread.yield();
        }
    }
}
class ThreadYieldDemo extends Thread
{
    @Override
    public void run()
    {
        for(int i=0;i<10;i++)
        {
            System.out.println("In Child Thread !!");
            //Thread.yield();  //  line - 1
        }
    }
}
/*
Output:
=======
In Main Thread !!
In Main Thread !!
In Main Thread !!
In Main Thread !!
In Main Thread !!
In Main Thread !!
In Main Thread !!
In Main Thread !!
In Main Thread !!
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

 */