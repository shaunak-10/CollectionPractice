import java.util.Random;

class Animal
{
    private static final Animal [] animalss = new Animal[5];

    private static final Random randomIndex = new Random();

    private static int indexesFilled = 0;

    private Animal()
    {
        System.out.println("New instance created");
    }

    public static Animal makeAnimal()
    {
        if(indexesFilled< animalss.length)
        {
            animalss[indexesFilled] = new Animal();

            return animalss[indexesFilled++];
        }

        int index = randomIndex.nextInt(animalss.length);

        return animalss[index];
    }
}

public class LimitedInstances
{
    public static void main(String[] args)
    {
        Animal[] a = new Animal[10];

        for(int i = 0; i<a.length; i++)
        {
            a[i] = Animal.makeAnimal();
        }

        for (int i = 0; i < a.length; i++)
        {
            System.out.println("a["+i+"] -> "+a[i].hashCode());
        }
    }

}
