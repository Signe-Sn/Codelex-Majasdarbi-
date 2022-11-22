package dateandtime.practice;


import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.*;


public class Exercise1 {

    public static void main(String[] args) {

        System.out.println("In this period of time, office worker Jim will work "
                + hoursWorked(LocalDate.of(2022, 1, 1),
                LocalDate.of(2022, 7, 1)) + " hours.");
    }

    public static long hoursWorked(LocalDate startDate, LocalDate endDate) {
        int maxHoursPerDay = 8;


        List<LocalDate> latvianHolidays = new ArrayList<>();   //Gribēju iekļaut brīvdienas

        latvianHolidays.add(LocalDate.of(2022, 1, 1));
        latvianHolidays.add(LocalDate.of(2022, 4, 15));
        latvianHolidays.add(LocalDate.of(2022, 4, 17));
        latvianHolidays.add(LocalDate.of(2022, 4, 18));
        latvianHolidays.add(LocalDate.of(2022, 5, 1));
        latvianHolidays.add(LocalDate.of(2022, 5, 4));
        latvianHolidays.add(LocalDate.of(2022, 6, 23));
        latvianHolidays.add(LocalDate.of(2022, 6, 24));
        latvianHolidays.add(LocalDate.of(2022, 11, 18));
        latvianHolidays.add(LocalDate.of(2022, 12, 24));
        latvianHolidays.add(LocalDate.of(2022, 12, 25));
        latvianHolidays.add(LocalDate.of(2022, 12, 26));
        latvianHolidays.add(LocalDate.of(2022, 12, 31));


        Set<DayOfWeek> weekend = EnumSet.of(DayOfWeek.SATURDAY, DayOfWeek.SUNDAY);
        long weekdays = startDate.datesUntil(endDate)
                .filter(day -> !weekend.contains(day.getDayOfWeek()) && !latvianHolidays.contains(day))
                .count();

        return weekdays * maxHoursPerDay;

    }
}


