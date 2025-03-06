package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class LazyEvaluationPractice {

    public static void main(String[] args)
    {
        // Lazy operations (or lazy evaluation) delay computing a value until it’s actually needed. This “just-in-time” approach can offer several significant benefits

        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        Stream<String> stream = names.stream()
                .filter(name -> {
                    System.out.println("Filtering: " + name);
                    return name.length() > 3;
                });

        System.out.println("Before terminal operation");

        List<String> result = stream.toList();

        System.out.println("After terminal operation");
        System.out.println(result);

    }
}
