package CoreJava.CompletableFuture;

/*
 *   Introduced in Java 8.
 *   To help in Async Programming.
 *   We can consider it as an advanced version of Future provides additional capability like chaining.
 *
 *
 *   1. CompletableFuture.thenCombine and CompletableFuture.thenCombineAsync:
 *      =====================================================================
 *      public <U,V> CompletableFuture<V> thenCombine(CompletionStage<? extends U> other,BiFunction<? super T,? super U,? extends V> fn)
 *      public <U,V> CompletableFuture<V> thenCombineAsync(CompletionStage<? extends U> other,BiFunction<? super T,? super U,? extends V> fn)
 *      public <U,V> CompletableFuture<V> thenCombineAsync(CompletionStage<? extends U> other,BiFunction<? super T,? super U,? extends V> fn, Executor executor)
 *
 *      Used to combine the results of two Comparable Future.
 * */

import java.util.concurrent.*;

public class ThenCombineAsync {
    public static void main(String[] args) {

        try {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1,
                    1, TimeUnit.HOURS, new ArrayBlockingQueue<>(10),
                    Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy()
                    //new ThreadPoolExecutor.DiscardPolicy()
            );

            CompletableFuture<Integer> asyncTask1 = CompletableFuture.supplyAsync(() -> {
                // This is the Task which needs to be completed by Thread
                System.out.println("Name of Thread that executes asyncTask1: " + Thread.currentThread().getName());
                return 10;
            }, threadPoolExecutor);

            CompletableFuture<String> asyncTask2 = CompletableFuture.supplyAsync(() -> {
                // This is the Task which needs to be completed by Thread
                System.out.println("Name of Thread that executes asyncTask2: " + Thread.currentThread().getName());
                return "by Thread.";
            });

            CompletableFuture<String> result = asyncTask1.thenCombineAsync(asyncTask2, (Integer v1, String v2) -> v1 + v2);
            System.out.println(result.get());
        } catch (Exception e) {

        }
    }
}
