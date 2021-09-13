package CoreJava.MultiThreading;

/*
        Scenario 2:
        ===========
        Overloading of run() method is always possible but Thread class start() method can invoke only no-argument
        run() method, then the other overloaded method we have to call explicitly like a normal method call.

 */
public class Example2
{
    public static void main(String[] args)
    {
        MyThread3 t = new MyThread3();
        t.start();

        t.run(7); // =>  explicitly call to overloaded method
    }
}
class MyThread3 extends Thread
{
    public void run()
    {
        System.out.println("no arg run");
    }
    public void run(int i)
    {
        System.out.println("int arg run");
    }
}
/*
Output:
=======
int arg run
no arg run

 */