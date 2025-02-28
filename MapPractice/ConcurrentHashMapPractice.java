package MapPractice;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapPractice
{
    public static void main(String[] args)
    {

        /*
        ConcurrentHashMap is a special implementation of the Map interface that allows multiple threads to access the map concurrently.
        This means that multiple threads can read and write to the map at the same time without causing any problems.
        ConcurrentHashMap achieves this by dividing the map into segments, each of which can be locked independently.
        This allows multiple threads to access different segments of the map concurrently without blocking each other.
        */

        ConcurrentHashMap<String,Integer> concurrentHashMap = new ConcurrentHashMap<>();

        // Java 7 --> segment based locking --> 16 segments --> smaller hashmaps --> lock on each segment --> 16 locks
        // Only the segment being written to or read from is locked
        // read doesn't require lock unless write is happening on the same segment
        // write operation will lock the segment

        // Java 8 --> no segmentation
        //        --> Compare and Swap (CAS) operation --> No locking except resizing or collision
        // e.g. Thread A last saw x = 42
        // Thread A work --> x to 50
        // when updating if x is still 42, then update to 50, otherwise retry


    }
}
