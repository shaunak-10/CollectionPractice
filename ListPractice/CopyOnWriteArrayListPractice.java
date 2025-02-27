package ListPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListPractice
{
    public static void main(String[] args)
    {
        CopyOnWriteArrayList<Integer> copyOnWriteArrayList = new CopyOnWriteArrayList<>(Arrays.asList(1,2,3));

        // this is memory heavy list, use only when the task is read intensive, as when write occurs
        // we have to create a new structure

        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3));

//        for(Integer i: list)
//        {
//            if(i==2)
//            {
//                list.add(100);
//            }
//        } -> this will result in ConcurrentModificationException as write was performed while reading, to make this work use CopyOnWriteArrayList
//        System.out.println(list);

        for(Integer i: copyOnWriteArrayList)
        {
            if(i==2)
            {
                copyOnWriteArrayList.add(200);
            }
            if(i==3)
            {
                copyOnWriteArrayList.add(300);
            }
        }

        // loop is on the original list, the added value is in the new copied list, and when the loop ends, the reference is changed

        System.out.println(copyOnWriteArrayList);
    }
}
