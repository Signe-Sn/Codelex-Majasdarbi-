package classesandobjects.practice;

public class Movie {
    String title;
    String studio;
    String rating;

    public Movie(String title, String studio, String rating) {
        this.title = title;
        this.studio = studio;
        this.rating = rating;
    }

    public Movie(String title, String studio) {
        this.title = title;
        this.studio = studio;
        this.rating = "PG";
    }

    public Movie[] getPG(Movie[] movie) {
        Movie[] pgMovies = new Movie[movie.length];
        int pgMoviesIndex = 0;
        for (Movie titles : movie) {
            if (titles.rating.equals("PG")) {
                pgMovies[pgMoviesIndex] = titles;
                pgMoviesIndex++;
            }
        }
        return pgMovies;
    }

    public static void main(String[] args) {
        Movie casinoRoyale = new Movie("Casino Royale", "Eon Productions", "PG13");
        Movie glass = new Movie("Glass", "Buena Vista International", "PG13");
        Movie spiderMan = new Movie("Spider-Man: Into the Spider-Verse", "Columbia Pictures", "PG");
    }
}
