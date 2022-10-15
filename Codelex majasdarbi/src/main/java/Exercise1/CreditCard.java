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
        try {

            if (this.balance < 100) {
                System.out.println("Warning: Low funds!");
            }
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
