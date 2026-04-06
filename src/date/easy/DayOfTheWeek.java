package date.easy;

import java.time.LocalDate;

// 1185
public class DayOfTheWeek {
    public static void main(String[] args) {
        System.out.println(new DayOfTheWeek().dayOfTheWeek(5, 4, 2026));
    }

    public String dayOfTheWeek(int day, int month, int year) {
        LocalDate date = LocalDate.of(year, month, day);
        return date.getDayOfWeek().name().charAt(0) + date.getDayOfWeek().name().substring(1).toLowerCase();
    }

    public String dayOfTheWeek1(int day, int month, int year) {
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        LocalDate date = LocalDate.of(year, month, day);

        return days[date.getDayOfWeek().getValue() - 1];
    }

    // Zeller's Congruence

}
