
class Singleton
{
    private static Singleton single_instance = null;

    public String s;

    private Singleton()
    {
        s = "abdc";
    }

    public static Singleton getInstance()
    {
        if(single_instance==null)
        {
            single_instance =  new Singleton();
        }

        return single_instance;

    }
}

public class SingletonPractice
{
    public static void main(String[] args)
    {
        Singleton s1 = Singleton.getInstance();

        Singleton s2 = Singleton.getInstance();


        System.out.println(s1.hashCode());

        System.out.println(s2.hashCode());
    }
}
