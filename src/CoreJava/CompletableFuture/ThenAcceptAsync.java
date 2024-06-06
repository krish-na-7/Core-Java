package CoreJava.CompletableFuture;

/*
 *   Introduced in Java 8.
 *   To help in Async Programming.
 *   We can consider it as an advanced version of Future provides additional capability like chaining.
 *
 *
 *   1. CompletableFuture.thenCompose and CompletableFuture.thenComposeAsync:
 *      =====================================================================
 *      public <U> CompletableFuture<U> thenCompose(Function<? super T, ? extends CompletionStage<U>> fn)
 *      public <U> CompletableFuture<U> thenComposeAsync(Function<? super T, ? extends CompletionStage<U>> fn)
 *      public <U> CompletableFuture<U> thenComposeAsync(Function<? super T, ? extends CompletionStage<U>> fn,Executor executor)
 *      Generally end stage,in the chain of Async operations.
 *      To does not return anything.
 * */

import java.util.concurrent.*;

public class ThenAcceptAsync {
    public static void main(String[] args) {

        try {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1,
                    1, TimeUnit.HOURS, new ArrayBlockingQueue<>(10),
                    Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy()
                    //new ThreadPoolExecutor.DiscardPolicy()
            );

            CompletableFuture<Void> asyncTask1 = CompletableFuture.supplyAsync(() -> {
                        // This is the Task which needs to be completed by Thread
                        System.out.println("Name of Thread that executes supplyAsync: " + Thread.currentThread().getName());
                        return "task completed.";
                    }, threadPoolExecutor)
                    .thenAccept((String value) -> {
                        System.out.println("Name of Thread that executes thenAccept: " + Thread.currentThread().getName());
                        System.out.println(value + "All stages completed.");
                    });
        } catch (Exception e) {

        }
    }
}
