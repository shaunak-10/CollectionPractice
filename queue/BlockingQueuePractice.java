package queue;

import java.util.concurrent.*;

class Producer implements Runnable
{
    private BlockingQueue<Integer> queue;
    private int value = 0;

    public Producer(BlockingQueue<Integer> queue) {
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

class Consumer implements Runnable
{
    private BlockingQueue<Integer> queue;

    public Consumer(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while(true)
        {
            try {
                Integer value = queue.take();
                System.out.println("Consumer consumed: " + value);
                Thread.sleep(2000);
            } catch (Exception e) {
                System.out.println("something went wrong");
            }
        }
    }
}

public class BlockingQueuePractice {
    public static void main(String[] args) {
        // thread safe
        // wait for queue to become non-empty when retrieving an element, and wait for space to become available in the
        // queue when storing an element, like producer consumer

        // put - waits for space to become available
        // take - waits for an element to become available
        // offer - waits for space to become available for a specified amount of time

        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(5);
        // A bounded blocking queue backed by an array. This queue orders elements FIFO (first-in-first-out).
        // uses a single lock for both insertion and deletion
        // more threads - problem
        Producer producer = new Producer(queue);
        Consumer consumer = new Consumer(queue);

        Thread t1 = new Thread(producer);
        Thread t2 = new  Thread(consumer);
        t1.start();
        t2.start();

        BlockingQueue<Integer> queue1 = new LinkedBlockingQueue<>();
        // An optionally-bounded blocking queue based on linked-list.
        // two seperate locks for enque and deque
        // higher concurrency between producer and consumer
        // used when more threads are there

        BlockingQueue<Integer> queue2 = new PriorityBlockingQueue<>();
        //unbounded
        //head element according to natural ordering or by a Comparator provided at queue construction time, same as
        // priority queue, apart from head, everything else will be random
        // put wont block as it is unbounded, space is available

        BlockingQueue<Integer> queue3 = new SynchronousQueue<>();
        // A blocking queue in which each insert operation must wait for a corresponding remove operation by another thread
        // it cannot store elements, capacity at most 1



    }
}
