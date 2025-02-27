package recordClasses;

public record EmployeeRecord(String name, int employeeNumber) {
    public void nameInUpperCase(){
        System.out.println(name.toUpperCase());
    }
}

    /*
    fields will be private and final by default
    public getter methods declared by default
    creates parameterized constructor by default
    automatically generates toString, equals and hashcode method
    two objects are equal if all instance variables in them equal

    we can override these equals, hashcode, etc
    also we can override the default implicit parameterized constructor provided

    NO SETTERS
    record classes are immutable by default

    static fields allowed
    non-static fields not allowed

    both static and non-static instance methods allowed

    records cannot extend any other class, and cannot be extended by any other class either as they are implicitely final
    however a record can implement interfaces
     */