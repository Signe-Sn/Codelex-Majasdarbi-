package loops.practice;

import java.util.Scanner;

public class MultiplyByItself {

    public static void main(String[] args) {
        int i = 6;
        int n;
        int result = i;

        System.out.print("Input number of terms: ");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();

        //todo - complete loop to multiply i with itself n times, it is NOT allowed to use Math.pow()
        for (int j = 1; j < n; j++){
            result = result*i;
            System.out.println(result);
        }
    }
}
