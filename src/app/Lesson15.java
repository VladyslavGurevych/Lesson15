package app;

import app.enumBase.Day;

public class Lesson15 {
    public static void main(String[] args) {

        WeeklyAdvisor day = new WeeklyAdvisor();
        day.advise(Day.MONDAY);
        day.advise(Day.TUESDAY);
        day.advise(Day.WEDNESDAY);
        day.advise(Day.THURSDAY);
        day.advise(Day.FRIDAY);
        day.advise(Day.SATURDAY);
        day.advise(Day.SUNDAY);
    }
}
