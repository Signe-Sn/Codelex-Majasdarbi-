package dateandtime.practice;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class DateTimeExercise {
    public static final long DAYS_BETWEEN = 5;

    public static void main(String[] args) {
        System.out.println(findNextFriday13th(LocalDate.of(2022, 10, 1)));
    }

    public static LocalDate createNewYearsEve2017() {
        return LocalDate.of(2017, 12, 31);
    }

    public static LocalDate[] getTwoLocalDates() {
        LocalDate[] dates = new LocalDate[2];
        dates[0] = LocalDate.now();
        dates[1] = dates[0].plusDays(DAYS_BETWEEN);
        return dates;
    }

    public static LocalDate findNextFriday13th(LocalDate from) {
        LocalDate friday = from.with(TemporalAdjusters.nextOrSame(DayOfWeek.FRIDAY));
        while (friday.getDayOfMonth() != 13) {
            friday = friday.plusDays(1);
        }
        while (!friday.getDayOfWeek().equals(DayOfWeek.FRIDAY)){
            friday = friday.plusMonths(1);
        }
        return friday;
    }

}
