
class Animal
{
    private static final Animal [] animals = new Animal[5];

    private static int indexesFilled = 0;

    private Animal()
    {
        System.out.println("New instance created");
    }

    public static Animal makeAnimal()
    {
        if(indexesFilled < animals.length)
        {
            animals[indexesFilled] = new Animal();

            return animals[indexesFilled++];
        }
        else
        {
            return animals[indexesFilled++ % animals.length];
        }

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
