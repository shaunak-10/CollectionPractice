package ListPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;



public class Employee implements Comparable<Employee> {
    String name;
    int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("abc",2000);
        Employee e2 = new Employee("def",3000);

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(e2);
        employees.add(e1);


    }

    @Override
    public int compareTo(Employee o) {
        return o.salary-this.salary;
    }
}
