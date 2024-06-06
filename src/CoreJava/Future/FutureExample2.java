package CoreJava.Future;

import java.util.concurrent.*;

public class FutureExample2 {
    public static void main(String[] args) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1,
                1, TimeUnit.HOURS, new ArrayBlockingQueue<>(10),
                Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy()
                //new ThreadPoolExecutor.DiscardPolicy()
        );

        Future<?> futureObj1 = threadPoolExecutor.submit(() -> {
            System.out.println("This is the task, which Thread will be executed");
        });

        Future<Integer> futureObj2 = threadPoolExecutor.submit(() -> {
            System.out.println("This is the task, which Thread will be executed");
            return 50;
        });
    }
}
