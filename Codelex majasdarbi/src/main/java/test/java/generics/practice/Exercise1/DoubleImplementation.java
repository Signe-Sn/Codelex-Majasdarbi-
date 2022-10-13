package test.java.generics.practice.Exercise1;

import java.util.ArrayList;
import java.util.List;

public class DoubleImplementation extends ListWithAbstract<Double> {

    private List<Double> doubleList = new ArrayList<>();

    @Override
    public void add(int i, Double el) {
        doubleList.add(i, el);
    }

    @Override
    public Double get(int i) {
        return doubleList.get(i);
    }
}
