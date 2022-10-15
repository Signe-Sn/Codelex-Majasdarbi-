package Exercise1;

public class Main {
    public static void main(String[] args) {
        CreditCard creditCard = new CreditCard(1345,"Bob", 678, 0);
        creditCard.withdrawMoney(100);
        System.out.println(creditCard.getBalance());

        DebitCard debitCard = new DebitCard(1345,"Bob", 678, 0);
        debitCard.withdrawMoney(100);
        System.out.println(debitCard.getBalance());
    }
}
