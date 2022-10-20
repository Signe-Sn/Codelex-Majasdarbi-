package oop.persons;

import java.time.LocalDate;

public class PersonFunctionality {
    public static void main(String[] args) {
        Employee barbara = new Employee("Barbara", "Banana", "23456", 45, "Manager", LocalDate.of(2015, 8, 16));
        System.out.println(barbara.getInfo());

        Customer karen = new Customer("Karen", "Smith", "1234", 34, "56789c", 12);
        karen.setPurchaseCount(23);
        System.out.println(karen.getInfo());
    }
}
