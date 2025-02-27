package MapPractice;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapPractice
{
    public static void main(String[] args)
    {
        HashMap<Integer,String> hashMap = new HashMap<>();

        hashMap.put(1,"abc");

        hashMap.put(2,"def");

        hashMap.put(3,"ghi");

        System.out.println(hashMap);

        System.out.println(hashMap.get(2));

        System.out.println(hashMap.get(10)); // null

        System.out.println(hashMap.containsKey(2));

        System.out.println(hashMap.containsValue("abc"));

         // .keySet() gives set of keys for out hashMap
        //order of elements in hashmap is not guaranteed, it can have any order

        for(int i: hashMap.keySet())
        {
            System.out.print(hashMap.get(i) + " ");
        }

        System.out.println();

        Set<Map.Entry<Integer, String>> entries = hashMap.entrySet(); // entries of all the elements in the hashMap

        for(Map.Entry<Integer, String> entry: entries)
        {
            entry.setValue(entry.getValue().toUpperCase());
        }

        System.out.println(hashMap);

        hashMap.remove(4); // will remove key, if that key exists

        hashMap.remove(2,"sdfsad"); //will remove if this combination exists in the the hashmap

        System.out.println(hashMap);


        //all the operations are in O(1) time

    }
}
