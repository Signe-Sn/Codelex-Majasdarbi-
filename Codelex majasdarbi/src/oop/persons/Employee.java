package oop.persons;

import java.time.LocalDate;
import java.time.Period;

public class Employee extends Person {

    private String position;
    private LocalDate startedWorkingDate;

    public Employee(String firstName, String lastName, String id, int age, String position, LocalDate startedWorkingDate) {
        super(firstName, lastName, id, age);
        this.position = position;
        this.startedWorkingDate = startedWorkingDate;
    }

    public int getWorkExperience() {
        LocalDate start = startedWorkingDate;
        LocalDate end = LocalDate.of(2022, 9, 27);
        Period period = Period.between(start, end);
        return period.getYears();
    }

    @Override
    public String getInfo() {
        return firstName + " " + lastName + ", " + position + ", has been working in the company for " + getWorkExperience() + " years.";
    }
}
