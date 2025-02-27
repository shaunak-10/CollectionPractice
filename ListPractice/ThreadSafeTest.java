package ListPractice;

import java.util.ArrayList;
import java.util.Vector;
import java.util.concurrent.CopyOnWriteArrayList;

public class ThreadSafeTest
{
    public static void main(String[] args) throws InterruptedException
    {
        ArrayList<Integer> a = new ArrayList<>();

        Vector<Integer> v = new Vector<>();

        CopyOnWriteArrayList<Integer> c = new CopyOnWriteArrayList<>();

        Thread t1 = new Thread(()->
        {
           for(int i = 1; i<=1000; i++)
           {
               a.add(i);

               v.add(i);

               c.add(i);
           }
        });

        Thread t2 = new Thread(()->
        {
            for(int i = 1; i<=1000; i++)
            {
                a.add(i);

                v.add(i);

                c.add(i);
            }
        });

        t1.start();

        t2.start();

        t1.join();

        t2.join();

        System.out.println(a.size()); // cannot guarantee

        System.out.println(v.size()); // will be always 2000

        System.out.println(c.size()); // 2000
    }
}
