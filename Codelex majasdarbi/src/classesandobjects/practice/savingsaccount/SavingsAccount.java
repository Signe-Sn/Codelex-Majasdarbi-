package classesandobjects.practice.savingsaccount;

public class SavingsAccount {
    private double annualInterestRate;
    private double balance;

    public SavingsAccount(double startingBalance) {
        this.balance = startingBalance;

    }

    public void withdraw(double draw) {
        balance = balance - draw;
    }

    public void deposit(double add) {
        balance = balance + add;
    }

    double interestEarned = 0;
    public void addMonthlyInterest() {
        double yearInterest = (annualInterestRate / 100) * balance;
        double monthlyInterest = yearInterest / 12;
        balance = balance + monthlyInterest;
        interestEarned += monthlyInterest;
    }

    public double getBalance() {
        return balance;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

}
