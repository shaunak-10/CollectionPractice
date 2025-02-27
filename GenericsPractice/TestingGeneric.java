package GenericsPractice;

public class TestingGeneric
{
    public static void main(String[] args)
    {
        PrintIt<Integer> integer = new PrintIt<>();

        integer.value = 1;

        integer.printValue();


        PrintIt<Cat> cat = new PrintIt<>();

        cat.value = new Cat(5,"tom");

        cat.printValue();
    }
}
