package queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class QueuePractice {
    public static void main(String[] args) {
        // linked list can be used as queue

        Queue<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);
        list.remove();
        System.out.println(list);
        System.out.println(list.poll());
        System.out.println(list);

        // add(), remove(), element() throws exception if the operation is not successful
        // offer(), poll(), peek() returns null/boolean if the operation is not successful

        Queue<Integer> queue = new ArrayBlockingQueue<>(2); // creates a fixed size queue
        System.out.println(queue.offer(3));
        System.out.println(queue.offer(4));
        System.out.println(queue.offer(5));

    }
}
