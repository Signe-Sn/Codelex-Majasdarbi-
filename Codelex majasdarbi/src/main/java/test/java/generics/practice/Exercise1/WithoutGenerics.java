package test.java.generics.practice.Exercise1;

import java.util.ArrayList;
import java.util.List;

public class WithoutGenerics {
    private List<String> list1;

    public void add(int i, String el) {
        list1 = new ArrayList<>();
        list1.add(i, el);
    }

    public String get(int i) {
        return list1.get(i);
    }
}
