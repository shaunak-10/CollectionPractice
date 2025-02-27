package ListPractice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class StackPractice
{
    public static void main(String[] args)
    {
        Stack<Integer> stack = new Stack<>();

        stack.push(1);

        stack.push(2);

        stack.push(3);

        stack.push(4);

        stack.push(5);

        System.out.println(stack);

        stack.pop();

        System.out.println(stack);

        System.out.println(stack.peek());

        System.out.println(stack.isEmpty());

        System.out.println(stack.size());

        int search = stack.search(3); // i based indexing from the top of stack

        System.out.println(search);

        //stack can do everything vector can like add in between, etc, etc as it extends vector, but we use stack when we want stack behaviour

        // using linkedlist also we can implement stack behovious like this

        LinkedList<Integer> stack2 = new LinkedList<>();

        stack2.addLast(4);

        stack2.getLast(); //peek

        stack2.removeLast(); //pop

        // using arraylist as stack

        ArrayList<Integer> stack3 = new ArrayList<>();

        stack3.add(3);

        stack3.get(stack3.size()-1); //peek

        stack3.remove(stack3.size()-1); //pop
    }
}
