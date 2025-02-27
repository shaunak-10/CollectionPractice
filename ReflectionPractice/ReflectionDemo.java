package ReflectionPractice;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionDemo
{
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException {

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

        for (Method method: catMethods)
        {
            if(method.getName().equals("heyThisIsPrivate"))
            {
                method.setAccessible(true);

                method.invoke(cat);
            }

            if(method.getName().equals("thisIsAPublicStaticMethod"))
            {
                method.invoke(null);
            }

            if(method.getName().equals("thisIsAPrivateStaticMethod"))
            {
                method.setAccessible(true);
                method.invoke(null);
            }
        }


    }
}
