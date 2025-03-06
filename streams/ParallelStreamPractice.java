package streams;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class ParallelStreamPractice
{
    public static void main(String[] args)
    {
        long startTime = System.currentTimeMillis();
        List<Integer> list = Stream.iterate(1, x -> x + 1).limit(20000).toList();
        List<Long> factorilsList = list.stream().map(ParallelStreamPractice::factorial).toList();
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken for sequential stream: " + (endTime - startTime));

        startTime = System.currentTimeMillis();
        factorilsList = list.parallelStream().map(ParallelStreamPractice::factorial).toList();
        endTime = System.currentTimeMillis();
        System.out.println("Time taken for parallel stream: " + (endTime - startTime));

        //when using parallel stream, make sure that the list elements are independent i.e stateless

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        AtomicInteger sum = new AtomicInteger(0);
        List<Integer> list1 = numbers.stream().map(sum::addAndGet).toList();
        System.out.println(list1);

        // local variables in lambda functions should be final or effectively final, the reason is thread-safety
        // we use AtomicInteger to achieve thread safety for that variable

        // .sequentail is used to convert a parallel stream to a sequential stream
        // eg

        list.parallelStream().map(ParallelStreamPractice::factorial).sequential().toList();
        // this will calculate the factorials in parallel and then convert the stream to sequential.

    }

    private static long factorial(int x)
    {
        long result = 1;
        for(int i = 2; i <= x; i++)
        {
            result *= i;
        }

        return result;
    }
}
