package CoreJava.MultiThreading;

public class RunnableExample
{
    public static void main(String[] args)
    {
          MyRunnable myRunnable = new MyRunnable();
          Thread thread = new Thread(myRunnable);
          thread.start();
        for(int i=0;i<10;i++)
        {
            System.out.println("In Main Thread !!!");
        }
    }
}
class MyRunnable implements Runnable
{
    @Override
    public void run()
    {
        for(int i=0;i<10;i++)
        {
            System.out.println("In Child Thread !!!");
        }
    }
}
/*
Output:
=======
In Main Thread !!!
In Main Thread !!!
In Main Thread !!!
In Main Thread !!!
In Child Thread !!!
In Child Thread !!!
In Child Thread !!!
In Child Thread !!!
In Child Thread !!!
In Child Thread !!!
In Child Thread !!!
In Child Thread !!!
In Child Thread !!!
In Child Thread !!!
In Main Thread !!!
In Main Thread !!!
In Main Thread !!!
In Main Thread !!!
In Main Thread !!!
In Main Thread !!!

 */