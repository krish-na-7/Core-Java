package CoreJava.Callable;

import java.util.List;

public class CustomRunnable implements Runnable{

    List<Integer> list;

    public CustomRunnable(List<Integer> list) {
        this.list = list;
    }

    @Override
    public void run() {
        System.out.println("This is the Use Case 2 With Custom Runnable, through Runnable task, T result");
        list.add(200);
        // It has to do some work
    }
}
