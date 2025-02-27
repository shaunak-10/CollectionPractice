package MapPractice;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

class LRUCache<K,V> extends LinkedHashMap<K,V>
{
    private int capacity;

    public LRUCache(int capacity) {
        this.capacity = capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size()>capacity;
    }
}

public class LinkedHashMapPractice
{
    public static void main(String[] args)
    {
        /*
        doubly linked list present internally
        overhead little higher beacuse of linked list, still all the operations are O(1)
        memory consumption also a little higher than regular HashMap
        access order true means the thread which was accessed latest is placed in the end, so the least recently used
         element will be on the top i.e. the oldest used object
         */
        LinkedHashMap<String,Integer> linkedHashMap = new LinkedHashMap<>(10,0.8f,true);

        linkedHashMap.put("abc",123);
        linkedHashMap.put("def",456);
        linkedHashMap.put("ghi",789);

        linkedHashMap.get("abc");
        linkedHashMap.get("def");

        for (Map.Entry<String, Integer> i: linkedHashMap.entrySet())
        {
            System.out.println(i.getKey() + ": " + i.getValue());
        }

        HashMap<String,Integer> hashMap = new HashMap<>();

        LinkedHashMap<String,Integer> linkedHashMap1 = new LinkedHashMap<>(hashMap);

        hashMap.put("abc",123);

        System.out.println(hashMap.getOrDefault("xyz",100));

        hashMap.putIfAbsent("def",150);

        System.out.println(hashMap);

        LRUCache<String, Integer> lruCache = new LRUCache<>(3);
        lruCache.put("abc",123);
        lruCache.put("def",456);
        lruCache.put("ghi",789);
        lruCache.put("jkl",101);

        System.out.println(lruCache.get("abc"));

        System.out.println(lruCache);
    }
}
