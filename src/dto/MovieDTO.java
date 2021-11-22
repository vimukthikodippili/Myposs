package dto;

import java.util.Date;

public class MovieDTO {
    private String moid;
    private String movieName;
    private String genre;
    private Double moviePrice;
    private int rating;

    public MovieDTO(String moid) {
    }

    public MovieDTO(String moid, String movieName, String genre, Double moviePrice, int rating) {
        this.moid = moid;
        this.movieName = movieName;
        this.genre = genre;
        this.moviePrice = moviePrice;
        this.rating = rating;
    }




    public String getMoid() {
        return moid;
    }

    public void setMoid(String moid) {
        this.moid = moid;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Double getMoviePrice() {
        return moviePrice;
    }

    public void setMoviePrice(Double moviePrice) {
        this.moviePrice = moviePrice;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
