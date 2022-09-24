package classesandobjects.practice.videostore;

public class Video {

    private String title;
    private boolean isCheckedIn = true;
    private int averageUserRating = 0;
    private int numOfRatings = 0;

    public Video(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void checkIn() {
        this.isCheckedIn = true;
    }

    public void checkOut() {
        this.isCheckedIn = false;
    }

    public boolean isCheckedIn() {
        if (this.isCheckedIn) {
            return true;
        } else {
            return false;
        }
    }

    public void addRating (int rating){
        averageUserRating = ((averageUserRating * numOfRatings) + rating) / (numOfRatings + 1);
        numOfRatings++;
    }

    public int getAverageUserRating() {
        return averageUserRating;
    }
}
