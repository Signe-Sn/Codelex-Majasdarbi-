package dateandtime.practice;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DatePeriod {

    LocalDate startOfPeriod;
    LocalDate endOfPeriod;

    public DatePeriod(LocalDate start, LocalDate end) {
        this.startOfPeriod = start;
        this.endOfPeriod = end;
    }

    public DatePeriod intersection(DatePeriod datePeriod) {

        if (this.startOfPeriod.isAfter(datePeriod.endOfPeriod) || this.endOfPeriod.isBefore(datePeriod.startOfPeriod)) {
            return null;
        }

        if (this.startOfPeriod.isBefore(datePeriod.startOfPeriod) && this.endOfPeriod.isAfter(datePeriod.endOfPeriod)) {
            return datePeriod;
        }

        if (this.startOfPeriod.isAfter(datePeriod.startOfPeriod) && this.endOfPeriod.isBefore(datePeriod.endOfPeriod)) {
            return this;
        }

        if (this.startOfPeriod.isBefore(datePeriod.startOfPeriod) && this.endOfPeriod.isBefore(datePeriod.endOfPeriod)) {
            this.startOfPeriod = datePeriod.startOfPeriod;

        }
        if (this.startOfPeriod.isAfter(datePeriod.startOfPeriod) && this.endOfPeriod.isAfter(datePeriod.endOfPeriod)) {
            this.endOfPeriod = datePeriod.endOfPeriod;
        }

        return new DatePeriod(this.startOfPeriod, this.endOfPeriod);
    }


    public static String format(LocalDate period) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        return formatter.format(period);
    }

    @Override
    public String toString() {
        return "The intersecting period is: " + format(startOfPeriod) + " to " + format(endOfPeriod);
    }

}
