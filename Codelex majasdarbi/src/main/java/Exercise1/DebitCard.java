package Exercise1;

public class DebitCard extends Card {


    public DebitCard(int cardNumber, String ownersFullName, int ccvCode, double balance) {
        super(cardNumber, ownersFullName, ccvCode, balance);
    }

    @Override
    public void addMoney(double money) {
        this.balance += money;
        if (this.balance >= 10000) {
            System.out.println("Warning: Too much money!");
        }
    }

    @Override
    public void withdrawMoney(double money) {
            if (this.balance <= 0) {
                throw new NotEnoughFundsException("No money left!");
            } else {
                this.balance -= money;
            }
    }
}
