package enumPractice;

public class EnumDemo {

    public static void main(String[] args) {
        DayOfWeek day = DayOfWeek.SUNDAY;

        if(day == DayOfWeek.SUNDAY)
        {
            System.out.println("hii");
        }

        for(DayOfWeek dayOfWeek : DayOfWeek.values())
        {
            System.out.println(dayOfWeek);
        }

        System.out.println(DayOfWeek.TUESDAY.i);
    }

}
