package optionalPractice;

import java.util.Optional;

public class Demo {
    public static void main(String[] args)
    {
        Optional<Cat> cat = findMyCat("abc");

        if(cat.isPresent())
        {
            System.out.println(cat.get().getAge());
        }
        else
        {
            System.out.println(0);
        }

        Cat x = cat.orElse(new Cat("unknown", 0)); // give default object if the original optional is null

        System.out.println(x.getName());
    }

    public static Optional<Cat> findMyCat(String name)
    {
        Cat cat = new Cat("abc",10);
        return Optional.ofNullable(null);
    }


}
