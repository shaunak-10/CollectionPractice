package MapPractice;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ImmutableMapPractice {
    public static void main(String[] args) {

        /*
        ImmutableMap is a special implementation of the Map interface that does not allow modification of the map once it has been created.
        This means that once the map is created, we cannot add, remove, or update any key-value pairs in the map.
        ImmutableMap is useful when we need to ensure that the map does not change after it has been created.
        */

        Map<String, Integer> map1 = new HashMap<>();
        map1.put("A",1);
        map1.put("B",2);
        Map<String, Integer> map2 = Collections.unmodifiableMap(map1);
        // map1 - normal map
        // map2 - unmodifiable map

        Map<String, Integer> map3 = Map.of("A", 1, "B", 2);// returns an immutable map
        System.out.println(map3);

        //map.of is limited to only 10 key-value pairs, if we want to add more than 10 key-value pairs, we can use map.ofEntries

        Map<String, Integer> map4 = Map.ofEntries(Map.entry("A", 1), Map.entry("B", 2), Map.entry("C", 3));
        System.out.println(map4);
    }
}
