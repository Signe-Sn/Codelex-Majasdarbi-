package main.java.io.codelex.collections.practice.lists;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayListExercise11 {

    public static void main(String[] args) {

        ArrayList<String> array = new ArrayList<>();

        array.add("Tree");
        array.add("Plant");
        array.add("Lichen");
        array.add("Rock");
        array.add("Cloud");
        array.add("Puddle");
        array.add("RainDrop");
        array.add("Leaf");
        array.add("Moss");
        array.add("Grass");

        System.out.println(array);

        array.add(4, "Shrub");

        System.out.println(array);

        array.remove(array.size()-1);
        array.add(array.size(), "Tree Bark");

        System.out.println(array);

        Collections.sort(array);

        System.out.println(array);

        if (array.contains("Foobar")){
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        for (String value : array){
            System.out.print(value + " ");
        }
    }

}
