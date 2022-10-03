package dateandtime.practice;

import java.time.LocalDate;

public class DatePeriodMain {

    public static void main(String[] args) {

        LocalDate firstStart = LocalDate.of(2022, 1, 1);
        LocalDate firstEnd = LocalDate.of(2022, 1, 15);
        DatePeriod firstPeriod = new DatePeriod(firstStart, firstEnd);

        LocalDate secondStart = LocalDate.of(2021, 12, 31);
        LocalDate secondEnd = LocalDate.of(2022, 1, 12);
        DatePeriod secondPeriod = new DatePeriod(secondStart, secondEnd);

        DatePeriod overlap = firstPeriod.intersection(secondPeriod);

        System.out.println(overlap);
    }
}
