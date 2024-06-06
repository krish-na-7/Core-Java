package CoreJava.ThreadPoolExecutor;

import java.util.concurrent.*;

public class ThreadPoolExecutorExample1 {

    public static void main(String[] args) {

        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 4,
                4, TimeUnit.SECONDS, new ArrayBlockingQueue<>(2),
                new CustomThreadFactory(), new CustomRejectHandler()
                //new ThreadPoolExecutor.DiscardPolicy()
        );

        for (int i = 1; i < 10; i++) {
            threadPoolExecutor.submit(() -> {
                try {
                    Thread.sleep(5000);
                } catch (Exception e) {
                    // Handle Exception here
                }
                System.out.println("Task processed by : " + Thread.currentThread().getName());
            });
        }
    }
}

class CustomThreadFactory implements ThreadFactory {

    @Override
    public Thread newThread(Runnable r) {
        Thread thread = new Thread(r);
//        thread.setName("THREAD POOL EXECUTOR");
        thread.setPriority(Thread.NORM_PRIORITY);
        thread.setDaemon(false);
        return thread;
    }
}
class CustomRejectHandler implements RejectedExecutionHandler{

    @Override
    public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
        System.out.println("Task Rejected: " + r.toString());
    }
}