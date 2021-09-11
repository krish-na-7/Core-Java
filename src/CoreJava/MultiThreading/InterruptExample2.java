package CoreJava.MultiThreading;

public class InterruptExample2
{
    public static void main(String[] args)
    {
        InterruptDemo2 interruptDemo2 = new InterruptDemo2();
        interruptDemo2.start();
        interruptDemo2.interrupt();
        System.out.println("End of Main");
    }
}
class InterruptDemo2 extends Thread
{
    public void run()
    {
        for(int i=0;i<10;i++)
        {
            System.out.println("I am Lazy Thread "+ i);
        }
        System.out.println("I Want to Sleep");
        try
        {
            Thread.sleep(5000);
        }
        catch (InterruptedException e)
        {
            System.out.println("I Got Interrupted");
        }
    }
}
/*
Output:
=======
End of Main
I am Lazy Thread 0
I am Lazy Thread 1
I am Lazy Thread 2
I am Lazy Thread 3
I am Lazy Thread 4
I am Lazy Thread 5
I am Lazy Thread 6
I am Lazy Thread 7
I am Lazy Thread 8
I am Lazy Thread 9
I Want to Sleep
I Got Interrupted

 */