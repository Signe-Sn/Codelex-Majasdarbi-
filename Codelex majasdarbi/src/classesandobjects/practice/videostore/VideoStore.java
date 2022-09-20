package classesandobjects.practice.videostore;

import java.util.ArrayList;

public class VideoStore {

    static ArrayList<Video> videoInventory = new ArrayList<>();

    public static void addVideoToInventory(String title, int averageRating) {
        videoInventory.add(new Video(title, averageRating));
    }

    public void checkOutVideo(String title) {
        for (Video video : videoInventory) {
            if (video.getTitle().equals(title)) {
                video.checkOut();
            }
        }
    }

    public void checkInVideo(String title) {
        for (Video video : videoInventory) {
            if (video.getTitle().equals(title)) {
                video.checkIn();
            }
        }
    }

    public void printInventory() {
        for (int i = 0; i < videoInventory.size(); i++) {
            System.out.println(videoInventory.get(i).getTitle());
            System.out.println(videoInventory.get(i).isCheckedIn());
            System.out.println(videoInventory.get(i).getAverageRating());
        }
    }
}
