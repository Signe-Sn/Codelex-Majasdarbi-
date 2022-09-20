package arrays.practice;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a min number: ");
        int minNumber = input.nextInt();

        System.out.println("Please enter a max number: ");
        int maxNumber = input.nextInt();

        ArrayList<Integer> myArr = new ArrayList<>();
        int sum = 0;

        for (int i = minNumber; i <= maxNumber; i++) {
            myArr.add(i);
        }
        for(int num : myArr) {
            sum += num;
        }
        System.out.println("The sum is " + sum);
    }
}
