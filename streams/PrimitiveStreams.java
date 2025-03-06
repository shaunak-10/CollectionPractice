package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrimitiveStreams {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        IntStream stream = Arrays.stream(nums);// IntStream, this is for primitive type streams, we can also use LongStream, DoubleStream, etc
        Stream<Integer> boxed = stream.boxed(); // converts to wrapper class

        IntStream range = IntStream.range(1, 10); // 1 to 9
        range.forEach(System.out::print);
        System.out.println();

        List<Integer> list = new Random().ints(10).boxed().toList();
        System.out.println(list); // 10 random ints

    }
}
