package CoreJava.Future;

import java.util.concurrent.*;

public class FutureExample {
    public static void main(String[] args) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1,
                1, TimeUnit.HOURS, new ArrayBlockingQueue<>(10),
                Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy()
                //new ThreadPoolExecutor.DiscardPolicy()
        );

        //new Thread will be created, and it will perform the task.
        Future<?> futureObj = threadPoolExecutor.submit(() -> {
            try {
                Thread.sleep(7000);
                System.out.println("This is the task, which Thread will be executed");
            } catch (Exception e) {
                // Handle Exception here
            }
        });

        //Caller is checking the status of the Thread is created.
        System.out.println("is Done: " + futureObj.isDone());

        try {
            futureObj.get(2, TimeUnit.SECONDS);
        } catch (TimeoutException e) {
            System.out.println("TimeoutException happened.  ");
        } catch (Exception e) {
            // Handle Exception here
        }

        try {
            futureObj.get();
        } catch (Exception e) {
            System.out.println("Exception happened. ");
        }
        System.out.println("is Done: " + futureObj.isDone());
        System.out.println("is Cancelled: " + futureObj.isCancelled());
    }
}
