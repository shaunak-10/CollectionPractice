package MapPractice;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

class User{
    int id;

    public User(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}

public class HashMapTest {
    public static void main(String[] args) {

        HashMap<User,String> map = new HashMap<>();
        map.put(new User(1),"John");
        map.put(new User(1),"Doe");

        StringBuilder s = new StringBuilder(100);

        HashMap<Integer,String> map2 = new HashMap<>();
        map2.put(1,"shaunak");
        map2.put(1,"shaunak");
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.println(map);
        HashMapTest.test(map);
        System.out.println(map);

        int i = 10;
        System.out.println(i);
//        HashMapTest.test2(i);
        System.out.println(i);


        BigInteger bi = new BigInteger("12345678932");
        BigInteger bi2 = new BigInteger("1234567893232");
        System.out.println(bi.multiply(bi2));
        float f = 1.5324334934232421f;
        System.out.println(f);

        System.out.println(0.1+0.2);

        BigDecimal bigDecimal = new BigDecimal("442.32");
        System.out.println(bigDecimal);


        Integer ii = 10;
        Integer ji = 30;
        test2(ii,ji);
        System.out.println(ii);
    }

    public static void test(HashMap<User,String> h)
    {
        h.put(new User(1),"hello");
    }

    public static void test2(Integer i, Integer j)
    {
        
    }
}
