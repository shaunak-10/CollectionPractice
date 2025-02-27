package GenericsPractice;

public class Cat {
    public int age;
    public String name;

    public Cat(int age, String name){
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
