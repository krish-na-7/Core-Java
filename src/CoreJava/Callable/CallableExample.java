package CoreJava.Callable;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class CallableExample {
    public static void main(String[] args) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(3, 3,
                1, TimeUnit.HOURS, new ArrayBlockingQueue<>(10),
                Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy()
                //new ThreadPoolExecutor.DiscardPolicy()
        );

        // Use Case 1 with public Future<?> submit(Runnable task)
        Future<?> futureObj1 = threadPoolExecutor.submit(() -> {
            System.out.println("This is the Use Case 1, through Runnable task");
        });

        try{
            Object object = futureObj1.get();
            System.out.println(object == null);
        } catch (ExecutionException | InterruptedException e) {
            throw new RuntimeException(e);
        }

        // Use Case 2 with public <T> Future<T> submit(Runnable task, T result)
        List<Integer> output = new ArrayList<>();
        Future<List<Integer>> futureObj2 = threadPoolExecutor.submit(() -> {
            System.out.println("This is the Use Case 2, through Runnable task, T result");
            output.add(100);
        }, output);
        try{
            List<Integer> outputFromFutureObject2 = futureObj2.get();
            System.out.println(outputFromFutureObject2.get(0));
        } catch (ExecutionException | InterruptedException e) {
            throw new RuntimeException(e);
        }

        List<Integer> output1 = new ArrayList<>();
        Future<List<Integer>> futureObj = threadPoolExecutor.submit(new CustomRunnable(output1), output1);
        try {
            futureObj.get();
            // 1 Way
            System.out.println(output1.get(0));

            // 2 Way
            List<Integer> result = futureObj.get();
            System.out.println(result.get(0));
        }catch (Exception e){
            // Handle Exception here
        }






        // Use Case 3 public <T> Future<T> submit(Callable<T> task)
        Future<List<Integer>> futureObj3 = threadPoolExecutor.submit(() -> {
            System.out.println("This is the Use Case 3, through Callable");
            List<Integer> list = new ArrayList<>();
            list.add(100);
            return list;
        });

        try{
            List<Integer> outputFromFutureObject3 = futureObj3.get();
            System.out.println(outputFromFutureObject3.get(0));
        } catch (ExecutionException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
