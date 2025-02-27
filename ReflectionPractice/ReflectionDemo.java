package ReflectionPractice;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionDemo
{
    public static void main(String[] args) throws IllegalAccessException {

        Cat cat = new Cat("abc",10);

        System.out.println(cat.getName());

        Field[] catFields = cat.getClass().getDeclaredFields();

        for(Field field:catFields)
        {
            if(field.getName().equals("name"))
            {
                field.setAccessible(true);

                field.set(cat,"shaunak");
            }
        }

        System.out.println(cat.getName());

        Method[] catMethods = cat.getClass().getDeclaredMethods();

        for(Method method: catMethods)
        {
            System.out.println(method.getName());
        }


    }
}
