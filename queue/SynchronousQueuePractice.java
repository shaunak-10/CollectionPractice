package queue;

import java.util.concurrent.SynchronousQueue;

class Producer2 implements Runnable{
    private SynchronousQueue<Integer> queue;
    private int value = 0;

    public Producer2(SynchronousQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {

        while(true)
        {
            try {
                System.out.println("Producer produced: " + value);
                queue.put(value++);
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println("something went wrong");
            }
        }

    }
}

class Consumer2 implements Runnable{
    private SynchronousQueue<Integer> queue;

    public Consumer2(SynchronousQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {

        while(true)
        {
            try {
                Integer i = queue.take();
                System.out.println("Consumer consumed: " + i);
                Thread.sleep(2000);
            } catch (Exception e) {
                System.out.println("something went wrong");
            }
        }

    }
}

public class SynchronousQueuePractice {
    public static void main(String[] args) {

        SynchronousQueue<Integer> queue = new SynchronousQueue<>();

        Producer2 producer = new Producer2(queue);
        Consumer2 consumer = new Consumer2(queue);

        Thread t1 = new Thread(producer);
        Thread t2 = new Thread(consumer);

        t1.start();
        t2.start();



    }
}
