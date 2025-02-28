package MapPractice;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

public class EnumMapPractice {
    public static void main(String[] args) {

        /*
        EnumMap is a special implementation of the Map interface that uses an enum type as the key.
        This means that the keys in an EnumMap are restricted to a specific set of enum values.
        EnumMap is useful when we need to associate values with enum constants.
        */

        //Main advantage - keys are already known, so the performance is better than the normal hashmap
        //order maintained as per the order of the enum constants

        Map<Day,String> map = new EnumMap<>(Day.class); // internal array size same as enum size by default, ordinal/index is used
        map.put(Day.MONDAY,"work");
        map.put(Day.SUNDAY, "chill");
        map.put(Day.TUESDAY,"gym");
        System.out.println(map);
        System.out.println(Day.THURSDAY.ordinal()); // this is kind of like the index of the enum constant

        //faster than hashmap, as there is no hashing the mapping is done at compile time as enums are constant
        // better memory as no need to store hashcodes
        // avoids autoboxing when using primitive types



//        Consider an EnumMap<Color, Integer>. Internally, EnumMap uses an array where:
//
//        The index corresponds to the ordinal value of the enum.
//        The value is stored directly in the array without extra wrapping.

//        In contrast, HashMap wraps primitives into objects, leading to autoboxing.

    }
}

enum Day{
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}
