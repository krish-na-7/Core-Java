package CoreJava.MultiThreading.ProducerConsumer;

public class ProducerConsumerClient {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource(3);
        //Producer Thread
        Thread producerThread = new Thread(() -> {
            try {
                for (int i = 0; i < 6; i++) {
                    sharedResource.produce(i);
                }
            } catch (Exception e) {
                //Handle Expression here
            }
        });

        //Consumer Thread
        Thread consumerThread = new Thread(() -> {
            try {
                for (int i = 0; i < 6; i++) {
                    sharedResource.consume();
                }
            } catch (Exception e) {
                //Handle Expression here
            }
        });

        producerThread.start();
        consumerThread.start();
    }
}
