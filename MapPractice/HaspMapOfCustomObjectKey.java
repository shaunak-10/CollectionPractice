package MapPractice;

import java.util.HashMap;
import java.util.Objects;

public class HaspMapOfCustomObjectKey
{
    public static void main(String[] args)
    {

        HashMap<Person,String> map = new HashMap<>();

        Person p1 = new Person("abc",1);

        Person p2 = new Person("def",2);

        Person p3 = new Person("abc",1);

        map.put(p1,"Engineering");

        map.put(p2,"sales");

        map.put(p3,"QA  ");


        System.out.println(map);

    }
}

class Person
{
    private String name;

    private int id;

    public Person(String name, int id)
    {
        this.name = name;

        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    @Override
    public String toString()
    {
        return "Person{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object o)
    {
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        return id == person.id;
    }

    @Override
    public int hashCode()
    {
        return Objects.hashCode(id);
    }
}