package CoreJava.MultiThreading;

/*
     We can prevent the Thread execution by using following methods.
    1. yield()
    2. join()
    3. sleep()

    join() method :
    ===============
    If a Thread want to wait until completion of other Thread then we should go for join() method.
    for example if a Thread t1 wants to wait until completion of t2 Thread then t1 Thread has to call t2.join()
    if t1 Thread executes t2.join() then immediately t1 Thread will enter into waiting state until t2 Thread
    completion. Once t2 Thread completes then t1 Thread can continue execution.

    public final void join() throws InterruptedException

    public final void join(long ml) throws InterruptedException

    public final void join(long ml, int ns) throws InterruptedException

    Every join method throws InterruptedException hence we have to handle this exception either by using try catch
    or throws keyword otherwise we will get compile time error.

    Case 1:
    Waiting of Main Thread until completion of Child Thread Example
 */
public class JoinExample1
{
    public static void main(String[] args) throws InterruptedException {

        ThreadJoinDemo threadJoinDemo = new ThreadJoinDemo();
        threadJoinDemo.start();
        threadJoinDemo.join(2000);
        for(int i=0;i<10;i++)
        {
            System.out.println("In Main Thread !!");
        }
    }

}
class ThreadJoinDemo extends Thread
{
    public void run()
    {
        for(int i=0;i<10;i++)
        {
            System.out.println("In Child Thread !!");
            try
            {
                Thread.sleep(2000);
            }
            catch (InterruptedException e)
            {

            }
        }
    }
}
/*
Output:
=======
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
In Main Thread !!
In Child Thread !!
In Child Thread !!
In Child Thread !!
In Child Thread !!
In Child Thread !!
In Child Thread !!
In Child Thread !!
In Child Thread !!

 */