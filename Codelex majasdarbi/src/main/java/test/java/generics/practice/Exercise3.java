package test.java.generics.practice;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Exercise3 {

    public static void main(String[] args) {

        //The method add(capture#1-of ?) in the type List<capture#1-of ?> is not applicable for the arguments (Object)
        //You can't put any element (except null) into Collection<?> as it cannot guarantee type safety. Can replace ? with Object or generic type variable.

        List<Integer> list1 = new ArrayList<>();
        list1.add(1);

        List<Number> list2 = new ArrayList<>();
        list2.add(4.5);
        list2.add(2);

        addAllX(list1, list2); //Number is superclass of Integer, list l can be Integer, Number, etc.
        //addAllY(list1, list2); //Cannot do this because addAllY list l does not refer to super class of V, only same type.
    }

//    public <T> void add(T value, List<T> list) {
//        list.add(value);
//    }

    public <T> void add(T value, List<? super T> list) {
        list.add(value);
    }

    public static <V> void addAllX(List<V> v, List<? super V> l) {
        for(V el : v) l.add(el);
    }

    public static <V> void addAllY(List<V> v, List<V> l) {
        for(V el : v) l.add(el);
    }
}
