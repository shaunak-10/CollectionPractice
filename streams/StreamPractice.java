package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamPractice {
    public static void main(String[] args) {

        //stream - sequence of elements supporting sequential and parallel aggregate operations

        //Lazy evaluation lets you represent and manipulate infinite data structures. You define a list or stream without
        // computing it all at once—only the portion required for a particular operation is computed. This is extremely
        // useful when dealing with large or unbounded data sources, as it keeps memory usage low.

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        System.out.println(list.stream().filter(x -> x%2==0).count()); // this is how to create stream from collections

        String[] names = {"Shaun", "John", "Jane", "Doe"};
        Stream<String> StringStream = Arrays.stream(names); // create stream from arrays

        Stream<Integer> stream = Stream.of(1,3,4,5); // create stream using Stream.of

        Stream.generate(()->1).limit(100); // infinite stream of 1, limit to 100, if limit is not provided, it will run forever

        List<Integer> list1 = Stream.iterate(1, x -> x + 1).limit(100).toList();// infinite stream of 1,2,3,4,5,6,7,8,9,10, limit to 100

        System.out.println(list1);

        // infinite streams can be created using iterate and generate methods, they are both static methods




    }
}
