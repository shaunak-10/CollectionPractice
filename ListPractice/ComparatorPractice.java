package ListPractice;

import java.io.PrintStream;
import java.util.*;

class StringLenthComparator implements Comparator<String>
{
    @Override
    public int compare(String o1, String o2)
    {
        //return 1 if you want to swap, -1 if you don't want to swap and 0 if they are same
        if(o1.length()>o2.length())
        {
            return 1;
        }
        else if(o1.length()<o2.length())
        {
            return -1;
        }
        else
        {
            return 0;
        }
    }
}

class Student
{
    private String name;

    private double cgpa;

    public Student(String name, double cgpa)
    {
        this.name = name;

        this.cgpa = cgpa;
    }

    public String getName()
    {
        return name;
    }

    public double getCgpa()
    {
        return cgpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", cgpa=" + cgpa +
                '}';
    }
}

public class ComparatorPractice
{
    public static void main(String[] args)
    {

        List<String> list = Arrays.asList("Shaunak", "Prerak", "Mehtaaaaaa");

        list.sort(new StringLenthComparator()); // -> using comparator class

        list.sort((a,b)->a.length()-b.length());// -> using lambda expression

        System.out.println(list);

        List<Student> students = new ArrayList<>();

        students.add(new Student("abc",7.9));

        students.add(new Student("def",9.4));

        students.add(new Student("ghi",8.9));

        students.add(new Student("jkl",8.8));

        students.sort((a,b)->(int)((b.getCgpa()-a.getCgpa())*10)); // sorted by cgpa descending order

        System.out.println(students);

        //to compare using method reference

        Comparator<Student> studentComparator = Comparator.comparing(Student::getCgpa).reversed().thenComparing(Student::getName);// comparing using method reference
        // this studentComparator will first sort based on the descending order of cgpa and if this value is same then will compare based on the alphabetical order of name

    }
}
