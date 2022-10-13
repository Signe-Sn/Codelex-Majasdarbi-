package test.java.generics.practice.Exercise1;

import java.util.ArrayList;
import java.util.List;

public class IntegerImplementation extends ListWithAbstract<Integer> {

    private List<Integer> list = new ArrayList<>();

    @Override
    public void add(int i, Integer el) {
        list.add(i, el);
    }

    @Override
    public Integer get(int i) {
        return list.get(i);
    }
}
