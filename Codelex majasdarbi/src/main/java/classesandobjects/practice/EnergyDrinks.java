package classesandobjects.practice;

public class EnergyDrinks {
    final static int NUMBER_OF_SURVEYED = 12467;
    final static double PURCHASED_ENERGY_DRINKS = 0.14;
    final static double PREFER_CITRUS_DRINKS = 0.64;


    public static double calculateEnergyDrinkers(int numberSurveyed) {
        return numberSurveyed * PURCHASED_ENERGY_DRINKS;
    }

    public static double calculatePreferCitrus(int numberSurveyed) {
        return calculateEnergyDrinkers(NUMBER_OF_SURVEYED) * PREFER_CITRUS_DRINKS;
    }

    public static void main(String[] args) {

        System.out.println("Total number of people surveyed " + NUMBER_OF_SURVEYED);
        System.out.printf("Approximately %.0f bought at least one energy drink per week.\n", calculateEnergyDrinkers(NUMBER_OF_SURVEYED));
        System.out.printf("%.0f of those " + "prefer citrus flavored energy drinks.", calculatePreferCitrus(NUMBER_OF_SURVEYED));
    }
}
