package app;

import app.Services.Advise;
import app.enumBase.Day;

public class WeeklyAdvisor implements Advise {

    @Override
    public void advise(Day day) {
            switch (day) {
                case MONDAY:
                    System.out.println("Monday is the perfect day to plan your week!");
                    break;
                case TUESDAY:
                    System.out.println("Tuesday is the time to focus on the most important tasks!");
                    break;
                case WEDNESDAY:
                    System.out.println("Wednesday marks the midweek! It's a great moment to review your progress.");
                    break;
                case THURSDAY:
                    System.out.println("Stay focused and keep your productivity high!");
                    break;
                case FRIDAY:
                    System.out.println("Happy Friday!");
                    break;
                case SATURDAY:
                    System.out.println("It's Saturday! Consider visiting a park, or museum, or spending time with friends.");
                    break;
                case SUNDAY:
                    System.out.println("It's the last day off!!!! I recommend you visit a sauna or spa with friends.");
                    break;
            }
        }
    }

