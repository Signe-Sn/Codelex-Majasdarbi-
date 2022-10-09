package polymorphism.practice.exercise4;

public class Commission extends Hourly{

    double totalSales;
    double commissionRate;


    public Commission(String eName, String eAddress, String ePhone, String socSecNumber, double rate, double commissionRate) {
        super(eName, eAddress, ePhone, socSecNumber, rate);
        this.commissionRate = commissionRate;
    }

    public void addSales(double totalSales){
        this.totalSales = totalSales;
    }

    public double pay() {
        //totalSales = 0;
        return super.pay() + (commissionRate * totalSales);
    }

    public String toString() {
        String result = "Name: " + name + "\n";
        result += "Address: " + address + "\n";
        result += "Phone: " + phone+ "\n";
        result += "Total sales: " + totalSales;
        return result;
    }


}
