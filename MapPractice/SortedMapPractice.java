package MapPractice;

import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapPractice
{
    public static void main(String[] args)
    {
        /*
        SortedMap is an interface that extends the Map interface and provides a way to store key-value pairs in a sorted order.
        The keys are sorted based on their natural ordering or a custom Comparator provided at the time of creation.
        The SortedMap interface provides methods to get the first and last keys in the map, as well as keys that are less than or greater than a given key.
        The SortedMap interface is implemented by the TreeMap class, which stores the keys in a sorted order using a Red-Black tree.
        */

        //keys sorted in natural ordering(comparable must be implemented in key's class) can also give custom comparator

        //NavigableMap extends sortedMap and TreeMap implements NavigableMap so : SortedMap -> NavigableMap -> TreeMap

        SortedMap<String,Integer>  treeMap = new TreeMap<>(); // can give custom comparator here

        treeMap.put("def",123);
        treeMap.put("abc",456);
        treeMap.put("ghi",789);
        System.out.println(treeMap);

        //Treemap can also be used by Map class reference as Map is parent of SortedMap, but that will take out some functionalities shown below

        System.out.println(treeMap.firstKey());
        System.out.println(treeMap.lastKey());

        System.out.println(treeMap.headMap("d")); // prints all the elements less than the toKey
        System.out.println(treeMap.tailMap("d")); // prints all the elements greater than or equal to the fromKey

        System.out.println(treeMap.subMap("a","g")); // prints all the elements between fromKey and toKey [)


        // all complexities are O(logn) as we have to sort everything
        // operations having key to check things will be in O(logn) and operations involving values will be in O(n) as we have to iterate over all the values

        NavigableMap<Integer,String> navigableMap = new TreeMap<>();
        navigableMap.put(1,"One");
        navigableMap.put(5,"Five");
        navigableMap.put(3,"Three");

        System.out.println(navigableMap.lowerKey(5)); // returns greatest key strictly less than the given key
        System.out.println(navigableMap.ceilingKey(3)); // returns key greater than or equal to the given key

        System.out.println(navigableMap.descendingMap());


    }
}
