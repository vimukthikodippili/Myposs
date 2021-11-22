package entity;

public class Movie {
    private String moid;
    private String movieName;
    private String genre;
    private Double moviePrice;
    private int rating;

    public Movie() {
    }

    public Movie(String moid, String movieName, String genre, Double moviePrice, int rating) {
        this.moid = moid;
        this.movieName = movieName;
        this.genre = genre;
        this.moviePrice = moviePrice;
        this.rating = rating;
    }

    public void setMoid(String moid) {
        this.moid = moid;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setMoviePrice(Double moviePrice) {
        this.moviePrice = moviePrice;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getMoid() {
        return moid;
    }

    public String getMovieName() {
        return movieName;
    }

    public String getGenre() {
        return genre;
    }

    public Double getMoviePrice() {
        return moviePrice;
    }

    public int getRating() {
        return rating;
    }
}
