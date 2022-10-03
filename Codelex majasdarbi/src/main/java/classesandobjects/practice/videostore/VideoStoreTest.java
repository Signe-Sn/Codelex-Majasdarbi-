package classesandobjects.practice.videostore;

import java.util.Scanner;

public class VideoStoreTest {
    private static final int COUNT_OF_MOVIES = 3;
    static VideoStore videoStore = new VideoStore();

    public static void main(String[] args) {

        final Scanner keyboard = new Scanner(System.in);

        while (true) {
            System.out.println("Choose the operation you want to perform ");
            System.out.println("Choose 0 for EXIT");
            System.out.println("Choose 1 to fill video store");
            System.out.println("Choose 2 to rent video (as user)");
            System.out.println("Choose 3 to return video (as user)");
            System.out.println("Choose 4 to rate video (as user)");
            System.out.println("Choose 5 to list the inventory of movies");

            int n = keyboard.nextInt();

            switch (n) {
                case 0:
                    System.exit(0);
                case 1:
                    fillVideoStore(keyboard);
                    break;
                case 2:
                    rentVideo(keyboard);
                    break;
                case 3:
                    returnVideo(keyboard);
                    break;
                case 4:
                    rateVideo(keyboard);
                    break;
                case 5:
                    listInventory(keyboard);
                    break;
                default:
                    break;
            }
        }
    }

    private static void fillVideoStore(Scanner scanner) {
        for (int i = 0; i < COUNT_OF_MOVIES; i++) {
            System.out.println("Enter movie name");
            String movieName = scanner.next();
            videoStore.addVideoToInventory(movieName);
        }
    }

    private static void rentVideo(Scanner scanner) {
        System.out.println("Enter movie name");
        String movieName = scanner.next();
        videoStore.checkOutVideo(movieName);
    }

    private static void returnVideo(Scanner scanner) {
        System.out.println("Enter movie name");
        String movieName = scanner.next();
        videoStore.checkInVideo(movieName);
    }

    private static void rateVideo(Scanner scanner) {
        System.out.println("Enter movie name");
        String movieName = scanner.next();
        System.out.println("Enter movie rating");
        int movieRating = scanner.nextInt();
        videoStore.giveRating(movieName, movieRating);
        }


    private static void listInventory(Scanner scanner) {
        videoStore.printInventory();
    }
}
