package CoreJava.MultiThreading.ProducerConsumer;

import java.util.LinkedList;
import java.util.Queue;

public class SharedResource {
    private Queue<Integer> sharedBuffer;
    private int bufferSize;

    public SharedResource(int bufferSize) {
        sharedBuffer = new LinkedList<>();
        this.bufferSize = bufferSize;
    }

    public synchronized void produce(int item) throws Exception {
        // If buffer size is full, then wait for the consumer to consume items.
        while (sharedBuffer.size() == bufferSize) {
            System.out.println("Buffer is full, Producer is waiting for Consumer.");
            wait();
        }
        sharedBuffer.add(item);
        System.out.println("Produced: " + item);
        // Notify the Consumer that items are available to consume.
        notify();
    }

    public synchronized int consume() throws Exception {
        // If Buffer is empty, then wait for the Producer to produce items.
        while (sharedBuffer.isEmpty()) {
            System.out.println("Buffer is empty, Consumer is waiting for Producer.");
            wait();
        }
        int item = sharedBuffer.poll();
        System.out.println("Consumed: " + item);
        // Notify the Producer that there is space in the buffer now.
        notify();
        return item;
    }
}
