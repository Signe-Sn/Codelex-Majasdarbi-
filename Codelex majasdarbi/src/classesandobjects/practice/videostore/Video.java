package classesandobjects.practice.videostore;

public class Video {

    private String title;
    private boolean isCheckedIn;
    private int averageRating;

    int numberOfRatings = 0;
    int totalRatings = 0;

    public Video(String title, int averageRating) {
        this.title = title;
        this.averageRating = averageRating;
    }

    public String getTitle() {
        return title;
    }

    public void checkIn() {
        this.isCheckedIn = true;
    }

    public boolean isCheckedIn(){
        if (this.isCheckedIn) {
            return true;
        } else {
            return false;
        }
    }

    public void checkOut() {
        this.isCheckedIn = false;
    }

    public void addRating(int rating) {
        this.totalRatings += rating;
        numberOfRatings++;
        this.averageRating = this.totalRatings / this.numberOfRatings;
    }

    public int getAverageRating(){
        return averageRating;
    }

}
