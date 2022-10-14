package Exercise1;

public abstract class Card {

    int cardNumber;
    String ownersFullName;
    int ccvCode;
    double balance;

    public Card(int cardNumber, String ownersFullName, int ccvCode, double balance) {
        this.cardNumber = cardNumber;
        this.ownersFullName = ownersFullName;
        this.ccvCode = ccvCode;
        this.balance = balance;
    }

    public abstract void addMoney(double money);

    public abstract void withdrawMoney(double money);

    public double getBalance() {
        return balance;
    }
}
