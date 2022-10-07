package main.java.io.codelex.collections.practice.phonebook;

import java.util.TreeMap;

public class PhoneDirectory {
    private TreeMap<String, String> data = new TreeMap<>();

    public PhoneDirectory() {
    }

    private boolean find(String name) {
       return data.containsKey(name);
    }

    public String getNumber(String name) {
        if (find(name)) {
            return data.get(name);
        } else {
            return null;
        }
    }

    public void putNumber(String name, String number) {
        if (name == null || number == null) {
            throw new IllegalArgumentException("name and number cannot be null");
        }
        if (find(name)){
            data.put(name, number);
        } else {
            PhoneEntry newEntry = new PhoneEntry();
            newEntry.name = name;
            newEntry.number = number;
            data.put(newEntry.name, newEntry.number);
        }
    }
}
