package main.java.io.codelex.collections.practice;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class FlightPlanner {
    private static final Charset charset = Charset.defaultCharset();
    private static final String file = "flights.txt";

    public static void main(String[] args) throws IOException, URISyntaxException {
        Scanner input = new Scanner(System.in);
        String userChoice;
        String userChoice2 = "";
        String departure;
        String destination;

        while (true) {

            System.out.println("What would you like to do:");
            System.out.println("To display list of the cities press 1");
            System.out.println("To exit the program press #");
            userChoice = input.nextLine();


            if (userChoice.equals("1")) {
                displayCities();
                System.out.println("\nTo select a city from which you would like to start press 1");
                userChoice2 = input.nextLine();
            }

            if (userChoice.equals("#")) {
                break;
            }
            if (userChoice2.equals("1")) {
                System.out.println("Please select the city of departure");
                departure = input.nextLine();
                System.out.println("Possible destinations from " + departure + ": ");
                displayDestinations(departure);
                System.out.println("\nPlease select destination city");
                destination = input.nextLine();
                if (isThereAReturn(departure, destination)) {
                    System.out.println("Departure flight: " + departure + " to " + destination);
                    System.out.println("Return flight: " + destination + " to " + departure);
                    break;
                } else {
                    System.out.println("Unfortunately, there is no return flight from " + destination + ", choose another route.\n");
                }
            }
        }
    }


    public static void displayCities() throws IOException, URISyntaxException {
        System.out.println("Flights available from: " + flightData().keySet());
    }

    public static void displayDestinations(String city) throws IOException, URISyntaxException {
        try {
            System.out.println(flightData().get(city));
        } catch (NullPointerException e) {
            System.out.println("Invalid data");
        }
    }

    public static boolean isThereAReturn(String departure, String destination) throws IOException, URISyntaxException {
        try {
            return flightData().get(destination).contains(departure);
        } catch (NullPointerException ignored) {
        }
        return false;
    }

    private static Map<String, List<String>> flightData() throws IOException, URISyntaxException {
        final Path path = Paths.get(FlightPlanner.class.getResource(file).toURI());
        List<String> listOfFlights = Files.readAllLines(path, charset);
        Map<String, List<String>> mappedFlights = new HashMap<>();

        for (String flight : listOfFlights) {
            List<String> destination = new ArrayList<>();
            String[] split = flight.split("->");

            for (int i = 0; i < split.length; i++) {
                split[i] = split[i].trim();
            }

            if (mappedFlights.containsKey(split[0])) {
                destination.addAll(mappedFlights.get(split[0]));
                destination.add(split[1]);
                mappedFlights.put(split[0], destination);

            } else {
                mappedFlights.put(split[0], destination);
                destination.add(split[1]);
            }
        }
        return mappedFlights;
    }
}
