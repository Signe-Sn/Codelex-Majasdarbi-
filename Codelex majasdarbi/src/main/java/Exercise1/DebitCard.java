package Exercise1;

public class DebitCard extends Card {


    public DebitCard(int cardNumber, String ownersFullName, int ccvCode, double balance) {
        super(cardNumber, ownersFullName, ccvCode, balance);
    }

    @Override
    public void addMoney(double money) {
        if (this.balance > 10000) {
            System.out.println("Warning: Too much money!");
        }
        this.balance += money;
    }

    @Override
    public void withdrawMoney(double money) {
        try {
            if (this.balance <= 0) {
                throw new NotEnoughFundsException("");
            } else {
                this.balance -= money;
            }
        } catch (NotEnoughFundsException e) {
            System.out.println("Cannot withdraw money!");
        }
    }
}
