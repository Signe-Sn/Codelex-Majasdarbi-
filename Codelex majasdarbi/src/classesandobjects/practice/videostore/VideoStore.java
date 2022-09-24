package classesandobjects.practice.videostore;

import java.util.ArrayList;

public class VideoStore {

    ArrayList<Video> videoInventory = new ArrayList<>();


    public void addVideoToInventory(String title) {
        videoInventory.add(new Video(title));
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

    public void giveRating(String title, int rating) {
        for (Video video : videoInventory){
            if (video.getTitle().equals(title)){
                video.addRating(rating);
            }
        }
    }


    public void printInventory() {
        for (Video video : videoInventory) {
            System.out.println();
            System.out.println("Title: " + video.getTitle());
            System.out.println("Available to rent: " + video.isCheckedIn());
            System.out.println("Average rating: " + video.getAverageUserRating());
            System.out.println();
        }
    }
}
