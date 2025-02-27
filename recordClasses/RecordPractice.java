package recordClasses;

public class RecordPractice {
    public static void main(String[] args) {
        EmployeeRecord employeeRecord = new EmployeeRecord("abc",123);
        System.out.println(employeeRecord);
        employeeRecord.nameInUpperCase();
    }
}
