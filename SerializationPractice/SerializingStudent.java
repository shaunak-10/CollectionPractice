package SerializationPractice;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

interface A{

}

public class SerializingStudent
{
    public static void main(String[] args) throws IOException
    {
        Student s = new Student();

        s.rollNo=1;

        String file = "student.txt";

        FileOutputStream fos = new FileOutputStream(file);

        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(s);

        oos.close();

        fos.close();

        System.out.println("Object saved");
    }
}
