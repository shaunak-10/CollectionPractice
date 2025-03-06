package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class TerminalOps {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(4,3,1,2);

        // 1. collect - performs a mutable reduction operation on the elements of this stream using a Collector
        List<Integer> list1 = list.stream().skip(1).toList();// skips the first element and collects the rest in a list
        System.out.println(list1);

        // 2.forEach - performs an action for each element of this stream
        list.stream().forEach(x-> System.out.println(x));

        // 3. reduce - performs a reduction on the elements of this stream, using an associative accumulation function, and returns an Optional describing the reduced value, if any
        // reduce method takes two arguments, first is the initial value and second is the accumulator function

        Optional<Integer> reduce = list.stream().reduce(Integer::sum);// 0 is the initial value, a is the accumulator and b is the current element
        System.out.println(reduce.get());

        // 4. count - returns the count of elements in the stream

        // 5. anyMatch - returns true if any elements of the stream match the given predicate, otherwise false
        // 6. allMatch - returns true if all elements of the stream match the given predicate, otherwise false
        // 7. noneMatch - returns true if no elements of the stream match the given predicate, otherwise false

        boolean b = list.stream().anyMatch(x -> x % 2 == 0);
        System.out.println(b)  ;

        // 8. findFirst - returns an Optional describing the first element of this stream, or an empty Optional if the stream is empty
        // 9. findAny - returns an Optional describing some element of the stream, or an empty Optional if the stream is empty

        Optional<Integer> any = list.stream().findAny();
        System.out.println(any.get());

        List<Integer> list2 = Arrays.asList(1, 2, 3, 4, 5);
        Integer reduce1 = list2.stream().reduce(0, Integer::sum);
        System.out.println(reduce1);

        //counting occurences of character

        String sentence = "Hello world";
        long count = sentence.chars().filter(x -> x == 'l').count(); // .chars() converts the string to an IntStream
        System.out.println(count);

        // stateless and stateful operatins
        // stateless operations - operations that do not depend on any state of the stream, eg, map,etc
        // stateful operations - operations that depend on the state of the stream, eg, sorted, distinct,etc

        // toArray - returns an array containing the elements of this stream

        // min/max

        // forEachOrdered - performs an action for each element of this stream, in the encounter order of the stream if the stream has a defined encounter order
        // can be used to execute stream in order in parallel streams, foreach will not guarantee order

        System.out.println("max: "+ list.stream().max(Comparator.naturalOrder())); // if i put custom comparator, then according
        // to that comparing, the last element will be returned, may not always be logical max, it is last element, same for min

    }
}
