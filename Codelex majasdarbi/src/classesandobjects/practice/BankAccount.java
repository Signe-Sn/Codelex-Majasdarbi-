package classesandobjects.practice;

public class BankAccount {

    private String name;
    private double balance;

    public BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public final void deposit(double amount) {
        balance += amount;
    }

    public final void withdraw(double amount) {
        balance -= amount;
    }

    String sign = "";

    public String toString() {
        if (balance < 0) {
            balance = -balance;
            sign = "-";
        }
        return name + ", " + sign + "$" + balance;
    }

    public static void main(String[] args) {
        BankAccount benben = new BankAccount("Benson", -17.25);

        String accountInfo = benben.toString();

        System.out.println(accountInfo);
    }
}
