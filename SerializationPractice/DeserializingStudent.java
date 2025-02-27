package SerializationPractice;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializingStudent
{
    public static void main(String[] args) throws IOException, ClassNotFoundException
    {
        String file = "student.txt";

        FileInputStream fis = new FileInputStream(file);

        ObjectInputStream ois = new ObjectInputStream(fis);

        Student s = (Student) ois.readObject();

        System.out.println(s.name);

        System.out.println(s.rollNo);

        System.out.println(s.j);

        ois.close();

        fis.close();
    }
}
