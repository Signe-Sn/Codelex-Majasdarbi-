package polymorphism.practice.exercise3;

public class PersonMain {
    public static void main(String[] args) {
        Student student = new Student("Jack", "Sparrow", "The Sea", 11,  4.5);
        Employee employee = new Employee("Hector", "Barbossa", "The Sea", 12, "Captain");

        student.display();
        employee.display();
    }
}
