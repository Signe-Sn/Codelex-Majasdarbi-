package classesandobjects.practice.savingsaccount;

import java.util.Scanner;

public class SavingsAccountTest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the amount of money in the account: ");
        int inputStartingBalance = input.nextInt();
        System.out.print("Enter the annual interest rate: ");
        double inputInterestRate = input.nextDouble();
        System.out.print("Enter how long the account has been open: ");
        int inputMonths = input.nextInt();

        SavingsAccount myAccount = new SavingsAccount(inputStartingBalance);
        myAccount.setAnnualInterestRate(inputInterestRate);
        double totalDeposited = 0;
        double totalWithdrawn = 0;

        for (int i = 1; i <= inputMonths; i++) {
            System.out.print("Enter amount deposited for month: " + i + ": ");
            double amountEveryMonth = input.nextDouble();
            totalDeposited += amountEveryMonth;
            myAccount.deposit(amountEveryMonth);
            System.out.print("Enter amount withdrawn for month: " + i + ": ");
            double amountDrawPerMonth = input.nextDouble();
            totalWithdrawn += amountDrawPerMonth;
            myAccount.withdraw(amountDrawPerMonth);
            myAccount.addMonthlyInterest();
        }

        double totalBalance = myAccount.getBalance();
        System.out.println("Total deposited: $" + totalDeposited);
        System.out.println("Total withdrawn: $" + totalWithdrawn);
        System.out.printf("Total interest earned: $%.2f\n", + myAccount.interestEarned);
        System.out.printf("Ending balance: $%.2f", + totalBalance);


    }
}
