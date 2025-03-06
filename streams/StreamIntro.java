package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class StreamIntro
{
    public static void main(String[] args)
    {

        // lambda expression

        MathOperation addition = (a,b) -> a+b;

        MathOperation subtraction = (a,b) -> a-b;

        System.out.println(addition.operate(3,4));

        System.out.println(subtraction.operate(3,4));

        //Predicate - takes one argument and returns a boolean

        Predicate<Integer> isEven = (n) -> n%2 == 0;

        System.out.println(isEven.test(5));

        Predicate<String> startsWithS = (s) -> s.toUpperCase().startsWith("S");

        Predicate<String> endsWithK = (s) -> s.toUpperCase().endsWith("K");

        Predicate<String> and = startsWithS.and(endsWithK);

        System.out.println(and.test("apple"));

        System.out.println(and.test("shaunk"));

        // Function - takes one argument and returns a result

        Function<Integer,Integer> doubleIt = (n) -> n*2;
        Function<Integer,Integer> tripleIt = (n) -> n*3;

        System.out.println(doubleIt.andThen(tripleIt).apply(4)); // first double then triple
        System.out.println(doubleIt.compose(tripleIt).apply(4)); // first triple then double

        Function<Integer,Integer> identity = Function.identity(); // returns the same value

        System.out.println(identity.apply(5));

        //consumer - takes one argument and returns nothing

        List<Integer> list = Arrays.asList(1,2,3,4,5);
        Consumer<List<Integer>> printList = (l) -> {
            for(Integer i : l)
            {
                System.out.println(i);
            }
        };

        printList.accept(list);

        //supplier - takes no argument and returns a result

        Supplier<String> giveHello = () -> "Hello";

        System.out.println(giveHello.get());

        // BiPredicate, BiFunction, BiConsumer.... there is no BuSupplier as only one thing can be returned

        BiPredicate<Integer,String> biPredicate = (i,s) -> i == s.length();

        System.out.println(biPredicate.test(4,"abc"));

        BiConsumer<Integer,Integer> biConsumer = (a,b) -> System.out.println(a+b);

        biConsumer.accept(3,5);

        BiFunction<String,String,Integer> biFunction = (s1,s2) -> s1.length() + s2.length();

        System.out.println(biFunction.apply("hello","world"));

        UnaryOperator<Integer> a = (i) -> i*2; // when input and output are of the same type
        BinaryOperator<Integer> b = (i,j) -> i+j; // when input and output are of the same type, no need to provide type repetitevely, in angular brackets
        //these two are special cases of Function and BiFunction


        // Method reference --> used to refer method of functional interface

        List<String> names = Arrays.asList("apple","banana","orange","grapes");

        names.forEach(System.out::print);
        System.out.println();

        //constructor reference

        List<String> mobiles = Arrays.asList("Samsung","Apple","OnePlus","Nokia");
        List<MobilePhone> mobilePhones = mobiles.stream().map(MobilePhone::new).toList();
        System.out.println(mobilePhones);

    }
}

class MobilePhone{
    String name;

    public MobilePhone(String name)
    {
        this.name = name;
    }

    @Override
    public String toString() {
        return "MobilePhone{" +
                "name='" + name + '\'' +
                '}';
    }
}

interface MathOperation {
    int operate(int a, int b);
}
