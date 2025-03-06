package SetPractice;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArraySet;

public class HashSetPractice {
    public static void main(String[] args) {

        // Set is a collection that does not allow duplicates
        // O(1) operations

        //Set -> HashSet, LinkedHashSet, TreeSet, EnumSet

        Set<Integer> set = new HashSet<>(); // order not defined
        // internal working same as HashMap, but in the place of value, a dummy object is used
        set.add(12);
        set.add(1);
        set.add(67);
        System.out.println(set);

        Set<Integer> set1 = new LinkedHashSet<>(); // insertion order is maintained
        set1.add(12);
        set1.add(1);
        set1.add(67);
        System.out.println(set1);

        //TreeSet for sorted set

        //all the methods of HashMap, LinkedHashmap, TreeMap are available in HashSet, LinkedHashSet, TreeSet, only
        //difference is there is add in place of put in set

        Set<Integer> integers = Collections.synchronizedSet(set1);// to make the any kind of set synchronized
        // all operations are blocking, hence performance is very low
//        Collections.synchronizedMap(); to make the any kind of map synchronized

        // for optimised performance in multithreaded environment

        Set<Integer> set2 = new ConcurrentSkipListSet<>(); // recommended for multithreaded environment, sorted

        Set.of(1,2,3,4,5,6,7,8); // immutable set, can give more than 10 elements unlike Map.of
//        Collections.unmodifiableSet(set) to make set immutable

        Set<Integer> set3 = new ConcurrentSkipListSet<>();
        // thread safe
        // not sorted
        // copy is created if modifications are made while traversing, so no concurrent modification exception and then
        // at the end the reference is updated

        // in the concurrentSkipList, the modifications made are reflected while traversing itself, it is also called weakly consistent

        Set<Integer> x = new CopyOnWriteArraySet<>();
        Set<Integer> y = new ConcurrentSkipListSet<>();
        x.add(2);
        x.add(4);
        y.add(2);
        y.add(4);

        for(Integer num: x)
        {
            System.out.print(num);
            x.add(6); // 6 will not be printed
        }
        System.out.println();
        for (Integer num: y)
        {
            System.out.print(num);
            y.add(6); // 6 may or may not be printed
        }



    }
}
