package io.codelex.arithmetic.practice;

public class Exercise9 {

    public static void bmiCalculator(int weight, int height) {

        double weightInPounds = weight * 2.205;
        double heightInInches = height / 2.54;
        double bmi = (weightInPounds * 703) / (heightInInches * heightInInches);

        if (bmi < 18.5) {
            System.out.printf("Your bmi is: %.1f, which is considered underweight.", bmi);
        } else if (bmi > 25) {
            System.out.printf("\nYour bmi is: %.1f, which is considered overweight.", bmi);
        } else {
            System.out.printf("\nYour bmi is: %.1f, which is considered optimal.", bmi);
        }
    }

    public static void main(String[] args) {
        bmiCalculator(50, 180);
        bmiCalculator(65, 180);
        bmiCalculator(120, 180);
    }
}
