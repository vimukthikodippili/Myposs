package entity;

import java.util.Date;

public class Ticket {
    private String date;
    private String tid;
    private String sid;
    private String moid;
    private String showId;

    public Ticket() {
    }

    public Ticket(String date, String moid, String showId) {
        this.date = date;
        this.moid = moid;
        this.showId = showId;
    }

    public Ticket(String date, String tid, String sid, String moid, String showId) {
        this.date = date;
        this.tid = tid;
        this.sid = sid;
        this.moid = moid;
        this.showId = showId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTid() {
        return tid;
    }

    public String getSid() {
        return sid;
    }

    public String getMoid() {
        return moid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public void setMoid(String moid) {
        this.moid = moid;
    }

    public void setShowId(String showId) {
        this.showId = showId;
    }

    public String getShowId() {
        return showId;
    }
}
