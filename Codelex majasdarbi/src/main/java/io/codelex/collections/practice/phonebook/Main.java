package main.java.io.codelex.collections.practice.phonebook;

public class Main {
    public static void main(String[] args) {

        PhoneDirectory phoneDirectory = new PhoneDirectory();
        phoneDirectory.putNumber("Josephine", "363248973");
        System.out.println(phoneDirectory.getNumber("Josephine"));
        phoneDirectory.putNumber("Zack", "612738345");
        System.out.println(phoneDirectory.getNumber("Zack"));
    }
}
