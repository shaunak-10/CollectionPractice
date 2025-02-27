package ListPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListPractice
{
    public static void main(String[] args)
    {

        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.add(2);

        linkedList.add(4);

        System.out.println(linkedList.get(1)); // O(n)

        linkedList.addFirst(3);

        System.out.println(linkedList);// O(1)

        linkedList.removeIf(x -> x%2!=0);// removes if condition true

        System.out.println(linkedList);

        LinkedList<String> animals = new LinkedList<>(Arrays.asList("elephant","lion","dog")); // create linked list from ArrayList

        LinkedList<String> animalsToRemove = new LinkedList<>(Arrays.asList("lion"));

        animals.removeAll(animalsToRemove);

        System.out.println(animals);

    }
}

