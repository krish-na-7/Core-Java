package CoreJava.MultiThreading;
/*
     A Thread can interrupt a sleeping Thread or waiting Thread by using interrupt() method of Thread class.

     Whenever we are calling interrupt() method if target Thread not in sleeping state then there is no
     impact of interrupt call immediately.Interrupt call will be waited until target Thread entered into waiting
     (or) sleeping state.
     If target Thread eneter into sleeping or waiting state then immediately interrupt call will interrupt the
     target Thread.
     If target Thread never entered into sleeping or waiting state int it's lifetime then there is no impact of
     interrupt call.This is only case where interrupt call will get wasted.
 */
public class InterruptExample1
{
    public static void main(String[] args)
    {
        InterruptDemo1 interruptDemo1 = new InterruptDemo1();
        interruptDemo1.start();
        interruptDemo1.interrupt();
        System.out.println("End of Main");
    }
}
class InterruptDemo1 extends Thread
{
    public void run() {
            for(int i=0;i<10;i++)
            {
                System.out.println("I am Lazy Thread !!");
                try
                {
                    Thread.sleep(4000);
                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
            System.out.println("I got Interrupted !!");
    }
}
/*
Output:
=======
End of Main
I am Lazy Thread !!
I am Lazy Thread !!
java.lang.InterruptedException: sleep interrupted
	at java.lang.Thread.sleep(Native Method)
	at CoreJava.MultiThreading.InterruptDemo1.run(InterruptExample1.java:31)
I am Lazy Thread !!
I am Lazy Thread !!
I am Lazy Thread !!
I am Lazy Thread !!
I am Lazy Thread !!
I am Lazy Thread !!
I am Lazy Thread !!
I am Lazy Thread !!
I got Interrupted !!

 */