package oop.parcels;


public class ParcelTest {

    public static void main(String[] args) {
        Parcel parcel = new Parcel(45, 45, 50, 13F, true);
        System.out.println("Is the parcel valid: " + parcel.validate());
    }
}
