package Exercise1;

public class CreditCard extends Card {


    public CreditCard(int cardNumber, String ownersFullName, int ccvCode, double balance) {
        super(cardNumber, ownersFullName, ccvCode, balance);
    }

    @Override
    public void addMoney(double money) {
        this.balance += money;
    }

    @Override
    public void withdrawMoney(double money) {

        if (this.balance <= 0) {
            throw new NotEnoughFundsException("No money left!");
        } else {
            this.balance -= money;
        }
        if (this.balance < 100) {
            System.out.println("Warning: Low funds!");
        }
    }
}
