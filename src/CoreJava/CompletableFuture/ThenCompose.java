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
 *      Chain together dependent Async operations.
 *      Means when next Async operation depends on the result of the previous Async one.
 *      We can tie them together.
 *      For async tasks, we can bring some ordering using this.
 * */

import java.util.concurrent.*;

public class ThenCompose {
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
                        return "task completed.";
                    }, threadPoolExecutor)
                    .thenCompose((String value) -> {
                        return CompletableFuture.supplyAsync(() -> {
                            System.out.println("Name of Thread that executes thenCompose: " + Thread.currentThread().getName());
                            return value + "by Thread.";
                        });
                    });

            asyncTask1.thenComposeAsync((String value) -> {
                System.out.println("Name of Thread that executes thenComposeAsync: " + Thread.currentThread().getName());
                return CompletableFuture.supplyAsync(() -> "by Thread.");
            }).thenComposeAsync((String value) -> {
                System.out.println("Name of Thread that executes thenComposeAsync with ThreadPoolExecutor: " + Thread.currentThread().getName());
                return CompletableFuture.supplyAsync(() -> "by Thread.");
            }, threadPoolExecutor);
            System.out.println(asyncTask1.get());
        } catch (Exception e) {

        }
    }
}
