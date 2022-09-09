package io.codelex.arithmetic.practice;


public class PayCalculator {
    public static void overtimeHours(double basePay, int hoursWorked) {

        double totalPay;

        if (basePay < 8.00 || hoursWorked > 60) {
            System.out.println("Error!");
        } else {
            if (hoursWorked > 40) {
                totalPay = (hoursWorked - 40) * (basePay * 1.5) + (basePay * 40);
            } else {
                totalPay = basePay * hoursWorked;
            }
            System.out.println("Your total pay is " + totalPay);
        }
    }

    public static void main(String[] args) {
        overtimeHours(7.50, 35);
        overtimeHours(8.20, 47);
        overtimeHours(10, 73);
    }
}
