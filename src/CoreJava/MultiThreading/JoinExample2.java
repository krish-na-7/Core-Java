package CoreJava.MultiThreading;

/*
   Case 2:
   =======
   Waiting of Child Thread Until Completion of Main Thread

   I  this example child Thread called join() method on Main Thread object hence Child Thread has to wait
   until completion of Main Thread.

   Case 3:
   =======
   If Main Thread calls join() method on Child Thread and Child Thread calls join() method on Main Thread
   object then both Threads will wait forever and program will be paused, and it is something like DeadLock.

   Case 4:
   =======
   If a Thread calls join() method on the same Thread itself then program will get struck, and it is DeadLock situation.

   Thread.currentThread().join();

 */
public class JoinExample2
{
    public static void main(String[] args)throws InterruptedException
    {
        JoinDemo.mainThread = Thread.currentThread();
        JoinDemo joinDemo = new JoinDemo();
        joinDemo.start();
        for(int i=0;i<10;i++)
        {
            System.out.println("In Main Thread !!");
            Thread.sleep(2000);
        }

    }
}
class JoinDemo extends Thread
{
    static Thread mainThread;
    public void run()
    {
        try
        {
            mainThread.join();
        }
        catch (InterruptedException e)
        {

        }
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