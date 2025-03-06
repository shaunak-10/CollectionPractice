package iterators;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Iterator;

public class IteratorPractice {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        for(int i:list)
        {
            System.out.println(i);
        }
        // internally this happens
        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext())
        {
            Integer number = iterator.next();
                if(number%2==0)
            {
                iterator.remove();
            }
        }

        System.out.println(list);

        //iterator gives methods like remove, hasNext, next

        //copyonwrite array list, modified list is referenced to at the end
        // arraylist - no modification allowed
        // iterator, modification is allowed and done in the middle of the operations, as shown above

        //iterator.set() - to set the value of the last element returned by next

    }
}
