package ListPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListPractice
{
    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1); //O(1)

        list.add(3);

        list.add(4);

        list.add(6);

        System.out.println(list.get(1));

        for (int x:list)
        {
            System.out.print(x+" ");
        }
        System.out.println();

        System.out.println(list.contains(3));

        System.out.println(list.contains(2));

        list.remove(3); // removes index 3

        list.remove(Integer.valueOf(3)); // removes object 3

        System.out.println(list);

        list.add(2,100); // adds 100 to specified index and shifts rest of the elements

        System.out.println(list);

        list.set(2,50);// directly replaces at specified index

        System.out.println(list);

        //if we know that more elements are going to be inserted, we can give the initial size, so that unnecessary resizing doesn't happen

        //this will save some overhead

        ArrayList<Integer> list1 = new ArrayList<>(1000); // like this

        System.out.println(list1.size());

        list.trimToSize(); // capacity will be same as size, this can be used to save memory

        List<Integer> list2 = Arrays.asList(1, 2, 3, 4); // create list on the go

        String [] s = {"hi","bye"};

        List<String> list3 = Arrays.asList(s);

        //arrays created with asList are fixed size, we cannot add or remove from them, we can only replace

        System.out.println(list.getClass().getName()); // can add, remove, set, etc ----- class -> java.util.ArrayList

        System.out.println(list2.getClass().getName());// can only set(replace) ----- class -> java.util.Arrays$ArrayList

        List<Integer> list4 = List.of(1,2, 3,4,5,6,7,8,9,10); // we cannot even replace when we create using List.of

        System.out.println(list4);


        list.addAll(list4);

        System.out.println(list);

        Integer[] array = list.toArray(new Integer[0]); // convert list to array, Integer[0] is convention to specify the Type

        list.sort(null); // here argument is the comparator

        System.out.println(list);

//        Time complexities
//        get by index - O(1)
//        Adding element - O(n) - worst case when resizing occurs
//        remove - O(n)
    }
}
