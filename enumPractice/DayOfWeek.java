package enumPractice;

public enum DayOfWeek {
    SUNDAY(4),
    MONDAY(4),
    TUESDAY(4),
    WEDNESDAY(5),
    THURSDAY(4),
    FRIDAY(4),
    SATURDAY(4);

    final int i;

    DayOfWeek(int i)
    {
        this.i = i;
    }
}