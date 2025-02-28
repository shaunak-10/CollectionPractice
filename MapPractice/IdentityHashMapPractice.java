package MapPractice;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMapPractice
{
    public static void main(String[] args)
    {
        /*
        IdentityHashMap is a special implementation of the Map interface that uses reference equality when comparing keys
        (instead of the equals method). This means that two keys k1 and k2 are considered equal if and only if k1 == k2.
        This is useful when we need to maintain a map with keys that are not comparable using the equals method.

        For example, we can use IdentityHashMap to store objects of the same class that are equal if they are the same object.
        */

        String key1 = new String("key");
        String key2 = new String("key");

        Map<String, Integer> map = new HashMap<>();

        map.put(key1,1);
        map.put(key2,2);

        System.out.println(map); // Output: {key=2} as the keys are compared using the equals method, and key1.equals(key2) is true.

        IdentityHashMap<String,Integer> identityHashMap = new IdentityHashMap<>();

        identityHashMap.put(key1,1);
        identityHashMap.put(key2,2);

        System.out.println(identityHashMap); // Output: {key=1, key=2} as the keys are compared using reference equality.


    }
}
