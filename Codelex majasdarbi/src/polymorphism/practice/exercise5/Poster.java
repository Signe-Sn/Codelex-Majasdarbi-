package polymorphism.practice.exercise5;

public class Poster extends Advert {

    private int copies;
    private int costPerCopy;
    private int dimensions;

    public Poster(int fee, int copies, int dimensions) {
        super(fee);
        this.copies = copies;
        this.dimensions = dimensions;
    }

    public int cost() {
        if (dimensions > 0 && dimensions <= 15) {
            costPerCopy = 5;
            return fee + (copies * costPerCopy);
        } else if (dimensions > 15 && dimensions <= 30) {
            costPerCopy = 10;
            return fee + (copies * costPerCopy);
        } else if (dimensions > 30 && dimensions <= 50) {
            costPerCopy = 15;
            return fee + (copies * costPerCopy);
        } else {
            costPerCopy = 40;
            return fee + (copies * costPerCopy);
        }
    }

    public String toString() {
        return "\nAdvert: Fee: " + fee + ", number of copies: " + copies + ", dimensions: " + dimensions;
    }
}
