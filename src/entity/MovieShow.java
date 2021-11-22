package entity;

import java.sql.Time;
import java.util.Date;

public class MovieShow {
    private String moid;
    private String  showId;
    private String movietime;


    public MovieShow() {
    }

    public MovieShow(String moid, String showId, String movietime) {
        this.moid = moid;
        this.showId = showId;
        this.movietime = movietime;
    }

    public String getMoid() {
        return moid;
    }

    public void setMoid(String moid) {
        this.moid = moid;
    }

    public String getShowId() {
        return showId;
    }

    public void setShowId(String showId) {
        this.showId = showId;
    }

    public String getMovietime() {
        return movietime;
    }

    public void setMovietime(String movietime) {
        this.movietime = movietime;
    }
}