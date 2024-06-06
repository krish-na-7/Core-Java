package CoreJava.CompletableFuture;

import java.util.concurrent.*;

/*
*   Introduced in Java 8.
*   To help in Async Programming.
*   We can consider it as an advanced version of Future provides additional capability like chaining.
*
*
*   1. CompletableFuture.supply and CompletableFuture.supplyAsync:
*      ===========================================================
*       public static <T> CompletableFuture<T> supplyAsync(Supplier<T> supplier)
*       public static <T> CompletableFuture<T> supplyAsync(Supplier<T> supplier, Executor executor)
*       supplyAsync initiates an Async operation.
*       'supplier' is executed asynchronously in a separate Thread.
*       If we want more control on Threads,we can pass Executor in the method.
*       By default it uses, shared Fork-Join Pool executor. It dynamically adjust its pool size based on processors.
*
* */

public class SupplyAsync {
    public static void main(String[] args) {

        try {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1,
                    1, TimeUnit.HOURS, new ArrayBlockingQueue<>(10),
                    Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy()
                    //new ThreadPoolExecutor.DiscardPolicy()
            );

            CompletableFuture<String> asyncTask1 = CompletableFuture.supplyAsync(() -> {
                // This is the Task which needs to be completed by Thread
                System.out.println(Thread.currentThread().getName());
                return "task completed.";
            }, threadPoolExecutor);
            System.out.println(asyncTask1.get());
        } catch (Exception e) {

        }
    }
}
