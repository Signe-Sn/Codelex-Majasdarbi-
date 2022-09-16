package io.codelex.arithmetic.practice;

public class Product1ToN {
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 10;

        for (int i = num1; i <= num2; i++) {
            num1 *= i;
        }
        System.out.println(num1);
    }
}
