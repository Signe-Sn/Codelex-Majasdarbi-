package test.java.generics.practice;

import java.util.ArrayList;
import java.util.List;

public class Exercise2 {

    public static void main(String[] args) {

        List<String> word = new ArrayList<>();
        word.add("Word");
        System.out.println(concatenate(word));

        List<Integer> integer = new ArrayList<>();
        integer.add(1);
        System.out.println(concatenate(integer));

        List<Object> object = new ArrayList<>();
        object.add(new Object());
        System.out.println(concatenate(object));
    }

    static String concatenate(List<?> list) {
        String result = "";
        String separator = "";
        if (list.get(0) instanceof String) {
            result = "String:";
            separator = " ";
        } else if (list.get(0) instanceof Integer) {
            result = "Integers:";
            separator = "+";
        } else {
            result = "Object:";
            separator = " ";
        }
        for (Object el : list)
            result = result + separator + el.toString();
        return result;
    }

//    Cannot use multiple overloading methods because of similar names/parameters. Methods have same erasure.

//    static String concatenate(List<String> list2) {
//        StringBuilder newOne = new StringBuilder("String:");
//        String separator = " ";
//        for (Object el : list2) {
//            newOne.append(separator).append(el.toString());
//        }
//        return newOne.toString();
//    }

//    static String concatenate(List<Integer> list3) {
//        StringBuilder newOne = new StringBuilder("Integer:");
//        String separator = " ";
//        for (Object el : list3) {
//            newOne.append(separator).append(el.toString());
//        }
//        return newOne.toString();
//    }

//    static String concatenate(List<Object> list4) {
//        StringBuilder newOne = new StringBuilder("Object:");
//        String separator = " ";
//        for (Object el : list4) {
//            newOne.append(separator).append(el.toString());
//        }
//        return newOne.toString();
//    }

}
