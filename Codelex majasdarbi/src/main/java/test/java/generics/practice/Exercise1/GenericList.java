package test.java.generics.practice.Exercise1;

import java.util.ArrayList;
import java.util.List;

public class GenericList extends ListWithAbstract <Object>{
    List<Object> list = new ArrayList<>();

    @Override
    public void add(int i, Object el) {
        list.add(i, el);
    }

    @Override
    public Object get(int i) {
        return list.get(i);
    }

}
