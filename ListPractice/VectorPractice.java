package ListPractice;

import java.util.Vector;

public class VectorPractice
{
    public static void main(String[] args)
    {

        Vector<Integer> vector = new Vector<>(5,4);

        vector.add(2);
        vector.add(2);
        vector.add(2);
        vector.add(2);
        vector.add(2);
        vector.add(2);

        System.out.println(vector.size());

        System.out.println(vector.capacity());
    }
}
