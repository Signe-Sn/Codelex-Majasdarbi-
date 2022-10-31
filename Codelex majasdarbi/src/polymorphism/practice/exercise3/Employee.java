package polymorphism.practice.exercise3;

public class Employee extends Person{

    String jobTitle;

    public Employee(String firstName, String lastName, String address, int id, String jobTitle) {
        super(firstName, lastName, address, id);
        this.jobTitle = jobTitle;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public void display(){
        System.out.println("Name: " + firstName + " " + lastName + ", ID: " + id + ", Job title: " + jobTitle + ", Address: " + address);
    }
}
