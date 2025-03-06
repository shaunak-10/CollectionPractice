package queue;

import java.util.Queue;
import java.util.PriorityQueue;

public class PriorityQueuePractice {
    public static void main(String[] args) {
        // orders elements based on their natural ordering or by a Comparator provided at the time of creation

        // this is not sorted, only at any given point of time, the highest priority element will be at the head
        // rest will be in random order
        // does not allow null elements

        Queue<Integer> queue = new PriorityQueue<>();
        queue.add(5);
        queue.add(15);
        queue.add(10);

        System.out.println(queue);

        while(!queue.isEmpty())
        {
            System.out.println(queue.poll());
        }

        // priorityqueue is implemented as min-heap by default(natural ordering) --> min-heap means the smallest element
        // will be at the head and its child will be greater then or equal to it
        // remove - O(logn)
        // add - O(logn)
        // peek - O(1)

        



    }
}
