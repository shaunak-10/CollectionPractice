package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class IntermediateOps
{
    public static void main(String[] args)
    {

        // intermediate operations - return a stream so we can chain multiple intermediate operations
        // they don't execute until a terminal operation is invoked i.e lazy evaluation


        // 1. filter - returns a stream consisting of the elements of this stream that match the given predicate
        List<String> list = Arrays.asList("a", "b", "c","a","aa");
        Stream<String> stream = list.stream().filter(x->x.startsWith("a"));
        long count = stream.count();// terminal operation
        System.out.println(count);

        // 2.map - returns a stream consisting of the results of applying the given function to the elements of this stream
        Stream<String> stream1 = list.stream().map(String::toUpperCase);
        List<String> list1 = stream1.toList();
        System.out.println(list1);

        // 3.sorted - returns a stream consisting of the elements of this stream, sorted according to natural order
        list.stream().sorted(); // sorts the elements in natural order
        list.stream().sorted((a,b)->b.compareTo(a)); // sorts the elements in reverse order i.e. we can pass a comparator

        // 4.distinct - returns a stream consisting of the distinct elements of this stream

        System.out.println(list.stream().filter(x->x.startsWith("a")).distinct().count());

        // 5.limit - returns a stream consisting of the elements of this stream, truncated to be no longer than maxSize in length

        // 6.skip - returns a stream consisting of the remaining elements of this stream after discarding the first n elements

        // 7. peek - returns a stream consisting of the elements of this stream, additionally performing the provided action on each element as elements are consumed from the resulting stream
        // intermediate version of forEach

        long count1 = Stream.iterate(1, x -> x + 1).skip(10).limit(100).peek(System.out::println).count();
        System.out.println(count1);

        //8. flatMap - handles stream of collections, lists, or arrays where each element is itself a collection
        // does transform and flattening at the same time
        // eg

        List<List<String>> listList = Arrays.asList(Arrays.asList("a", "b"), Arrays.asList("c", "d"));

        System.out.println(listList.stream().flatMap(x->x.stream()).map(String::toUpperCase).toList());





    }
}
