package dateandtime.practice;

import java.time.LocalDate;
import java.util.Scanner;

public class Exercise2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter launch day: ");
        int launchDay = input.nextInt();
        System.out.println("Enter launch month: ");
        int launchMonth = input.nextInt();
        System.out.println("Enter launch year: ");
        int launchYear = input.nextInt();

        System.out.println("Enter month for update schedule: ");
        int monthOfUpdate = input.nextInt();
        System.out.println("Enter year for update schedule: ");
        int yearOfUpdate = input.nextInt();

        LocalDate launchDate = LocalDate.of(launchYear, launchMonth, launchDay);
        LocalDate updateSchedule = LocalDate.of(yearOfUpdate, monthOfUpdate, 1);

        returnUpdates(launchDate,updateSchedule);
    }

    private static void returnUpdates(LocalDate launchDate, LocalDate updateSchedule) {
        LocalDate nextUpdates = launchDate;
        while (nextUpdates.isBefore(updateSchedule.plusMonths(1))) {
            nextUpdates = nextUpdates.plusDays(14);
            if(nextUpdates.isAfter(launchDate) && nextUpdates.getMonthValue() == updateSchedule.getMonthValue() && nextUpdates.getYear() == launchDate.getYear()){
                System.out.println(nextUpdates);
            }
        }
    }
}

