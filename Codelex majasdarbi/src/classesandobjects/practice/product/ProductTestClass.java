package classesandobjects.practice.product;

public class ProductTestClass {
    public static void main(String[] args) {
        Product logitechMouse = new Product("Logitech mouse", 70.00, 14);
        logitechMouse.setPrice(69.99);
        logitechMouse.setAmount(20);
        System.out.println(logitechMouse.name + ", " + logitechMouse.price + " EUR, " + logitechMouse.amount + " units");
        Product iPhone = new Product("iPhone5s",999.99, 3);
        iPhone.setPrice(750.99);
        iPhone.setAmount(4);
        System.out.println(iPhone.name + ", " + iPhone.price + " EUR, " + iPhone.amount + " units");
        Product epson = new Product("Epson EB-U05", 440.46, 1);
        epson.setPrice(399.99);
        epson.setAmount(2);
        System.out.println(epson.name + ", " + epson.price + " EUR, " + epson.amount + " units");
    }
}
