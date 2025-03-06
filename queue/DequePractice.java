package queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class DequePractice {
    public static void main(String[] args) {
        //insertion and removal at both ends

        //deque is implemented as a doubly linked list

        // insertion methods
        // addFirst(), addLast(), offerFirst(), offerLast()
        // removal methods
        // removeFirst(), removeLast(), pollFirst(), pollLast()
        // examination methods
        // peekFirst(), peekLast(), getFirst(), getLast()
        // deque is faster than linkedlist for adding and removing elements from both ends

        // deque is not thread safe

        Deque<Integer> deque = new ArrayDeque<>(); // faster iteration, low memory, no null allowed,
        // no need to shift when adding or removing elements, head and tail index are played with
        Deque<Integer> deque1 = new LinkedList<>(); // only use when insertion deletion needed in middle
    }
}
