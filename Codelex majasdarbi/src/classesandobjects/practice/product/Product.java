package classesandobjects.practice.product;

public class Product {
        String name;
        double price;
        int amount;

        public Product(String name, double priceAtStart, int amountAtStart) {
            this.name = name;
            this.price = priceAtStart;
            this.amount = amountAtStart;
        }

        public void printProduct(){
            System.out.println(name + ", " + "price " + price + " amount " + amount);
        }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}

