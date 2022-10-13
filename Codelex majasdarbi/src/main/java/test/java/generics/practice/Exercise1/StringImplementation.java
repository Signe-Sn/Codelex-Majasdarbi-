package test.java.generics.practice.Exercise1;

import java.util.ArrayList;
import java.util.List;

public class StringImplementation extends ListWithAbstract<String> {

    private List<String> stringList = new ArrayList<>();

    @Override
    public void add(int i, String el) {
        stringList.add(i, el);
    }

    @Override
    public String get(int i) {
        return stringList.get(i);
    }
}
