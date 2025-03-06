package streams;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectorsPractice {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3,3, 4, 5);

        //to List
        List<Integer> list1 = list.stream().filter(x -> x % 2 == 0).toList();
        System.out.println(list1);

        //to Set
        Set<Integer> collect = list.stream().collect(Collectors.toSet());
        System.out.println(collect);

        //to a specified collection
        List<Integer> collect1 = list.stream().collect(Collectors.toCollection(LinkedList::new)); // can use anything instead of a linkedList, to any collection

        // joining strings

        List<String> names = Arrays.asList("Shaun", "John", "Jane", "Doe");
        String collect2 = names.stream().collect(Collectors.joining(", ")); // joining strings with a delimiter
        System.out.println(collect2);

        //summarizing data, average, sum, count, min, max are present

        //grouping collectors available, we can group, process the groups, collect them into a certain collectoion, etc

        //partitioningBy - partitions the elements of the stream into two groups according to a Predicate(to be given in collect method)
    }
}
