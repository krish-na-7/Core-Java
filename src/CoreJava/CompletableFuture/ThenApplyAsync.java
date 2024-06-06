package CoreJava.CompletableFuture;

import java.util.concurrent.*;

/*
 *   Introduced in Java 8.
 *   To help in Async Programming.
 *   We can consider it as an advanced version of Future provides additional capability like chaining.
 *
 *
 *   1. CompletableFuture.thenApply and CompletableFuture.thenApplyAsync:
 *      =================================================================
 *       public <U> CompletableFuture<U> thenApply(Function<? super T,? extends U> fn)
 *       public <U> CompletableFuture<U> thenApplyAsync(Function<? super T,? extends U> fn)
 *       public <U> CompletableFuture<U> thenApplyAsync(Function<? super T,? extends U> fn, Executor executor)
 *       Apply a function to the result of previous Async computation.
 *       Return a new CompletableFuture Object.
 *
 * */


public class ThenApplyAsync {
    public static void main(String[] args) {

        try {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1,
                    1, TimeUnit.HOURS, new ArrayBlockingQueue<>(10),
                    Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy()
                    //new ThreadPoolExecutor.DiscardPolicy()
            );

            CompletableFuture<String> asyncTask1 = CompletableFuture.supplyAsync(() -> {
                        // This is the Task which needs to be completed by Thread
                        System.out.println("Name of Thread that executes supplyAsync: " + Thread.currentThread().getName());
                        return "task completed ";
                    }, threadPoolExecutor)
                    .thenApply((String value) -> {
                        System.out.println("Name of Thread that executes thenApply: " + Thread.currentThread().getName());
                        //Functionality which can work on the result of previous async task.
                        return value + "by Thread.";
                    });

            CompletableFuture<String> asyncTask2 = asyncTask1.thenApply((String value) -> {
                try {
                    //Functionality which can work on the result of previous async task.
                    System.out.println("Name of Thread that executes thenApply: " + Thread.currentThread().getName());
                    Thread.sleep(5000);
                } catch (Exception e) {

                }
                return value + "by Thread.";
            }).thenApplyAsync((String value) -> {
                        try {
                            //Functionality which can work on the result of previous async task.
                            System.out.println("Name of Thread that executes thenApplyAsync: " + Thread.currentThread().getName());
                            Thread.sleep(5000);
                        } catch (Exception e) {

                        }
                        return value + "by Thread.";
                    }
                    //threadPoolExecutor
            );

            System.out.println(asyncTask1.get());
            System.out.println(asyncTask2.get());
        } catch (Exception e) {

        }
    }
}
