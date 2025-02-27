package SerializationPractice;

import java.io.Serializable;

public class Student implements Serializable
{
    public int rollNo;

    transient public String name = "Shaunak"; // if given final, will always be able to access as final will be put directly to te bytecode

    static int j = 2; // not serialized, directly accessed from class
}
