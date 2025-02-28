package MapPractice;

import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.WeakHashMap;

public class WeakHashMapPractice {
    public static void main(String[] args) throws InterruptedException {

        /*
        WeakHashMap is a special implementation of the Map interface that allows the garbage collector to remove
        its keys when they are no longer in ordinary use. More precisely, the garbage collector removes the keys
        when they are no longer strongly reachable. This means that if the only reference to a key is the one
        stored in the WeakHashMap, the key can be removed from the map and reclaimed by the garbage collector.
        This is useful for implementing caches that need to be garbage collected when memory is low.

        usecases - in caches, where we want to remove the entries when the keys are no longer in use, dont use this with important data
        */

        WeakReference<Integer> i = new WeakReference<>(100); //weak-reference means the object can be garbage collected if no other strong reference is present to that object, it depends on the garbage collector
        System.out.println(i.get());



        WeakHashMap<String, Image> imageCache = new WeakHashMap<>();

        loadCache(imageCache);

        System.out.println(imageCache);

        System.gc();

        simulateApplicationRunning();

        System.out.println(imageCache);

        // thus, cleared the entries where keys have become weak references and are eligible for garbage collection, this will not happen in normal hashmap


    }

    private static void loadCache(Map<String,Image> imageCache)
    {
        imageCache.put("img1", new Image("Image 1")); //here the keys are strong referenced as they are in the SCP, hence they will not be garbage collected

        imageCache.put("img2", new Image("Image 2"));

        imageCache.put(new String("img3"), new Image("Image 3")); // here the key is weak reference

        imageCache.put(new String("img4"), new Image("Image 4"));
    }

    private static void simulateApplicationRunning() throws InterruptedException
    {
        System.out.println("Application running...");

        Thread.sleep(5000);
    }

}

class Image{
    private String name;

    public Image(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
