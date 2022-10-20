package arrays.practice;

import java.util.Arrays;

public class Exercise6 {
    public static void main(String[] args) {


        int[] myArr = new int[10];
        int[] myArr2 = new int[10];

        for (int i = 0; i < myArr.length; i++) {
            myArr[i] = 1 + (int) (Math.random() * 100);
        }

        for (int i = 0; i < myArr2.length; i++) {
            myArr2[i] = myArr[i];
        }

        myArr[9] = -7;

        System.out.println(Arrays.toString(myArr));
        System.out.println(Arrays.toString(myArr2));

    }
}
