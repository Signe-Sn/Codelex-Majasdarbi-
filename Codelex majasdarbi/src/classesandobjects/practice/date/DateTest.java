package classesandobjects.practice.date;

public class DateTest {
    public static void main(String[] args) {
        Date test1 = new Date(4, 19, 1998);
        test1.setDay(18);
        test1.setYear(2022);
        test1.setMonth(9);
        test1.displayDate();

        int getDay = test1.getDay();
        System.out.println(getDay);
    }
}
