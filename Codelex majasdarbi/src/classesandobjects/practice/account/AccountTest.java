package classesandobjects.practice.account;

public class AccountTest {
    public static void main(String[] args) {
        Account a = new Account("A", 100.0);
        Account b = new Account("B", 0.0);
        Account c = new Account("C", 0.0);

        Account.transfer(a,b,50.0);
        Account.transfer(b,c,25.0);

        System.out.println(a.balance());
        System.out.println(b.balance());
        System.out.println(c.balance());
    }
}
