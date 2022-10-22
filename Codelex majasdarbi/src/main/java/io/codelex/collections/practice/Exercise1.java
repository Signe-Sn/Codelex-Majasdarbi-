package main.java.io.codelex.collections.practice;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Origination:
 * Audi -> Germany
 * BMW -> Germany
 * Honda -> Japan
 * Mercedes -> Germany
 * VolksWagen -> Germany
 * Tesla -> USA
 */

public class Exercise1 {
    public static void main(String[] args) {
        String[] array = {"Audi", "BMW", "Honda", "Mercedes", "VolksWagen", "Tesla"};
        String[] origination = {"Germany", "Germany", "Japan", "Germany", "Germany", "USA"};

        ArrayList<String> toArrayList = new ArrayList<>(Arrays.stream(array).toList());
        System.out.println(toArrayList);

        Set<String> toHashSet = Arrays.stream(array).collect(Collectors.toSet());
        System.out.println(toHashSet);

        Map<String, String> toHashMap = IntStream.range(0, array.length).boxed()
                                        .collect(Collectors.toMap(i -> array[i], i -> origination[i]));

        System.out.println(toHashMap.get("Mercedes"));


    }
}
