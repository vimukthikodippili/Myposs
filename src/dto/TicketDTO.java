package dto;

import java.util.Date;

public class TicketDTO {
    private String date;
    private String tid;
    private String sid;
    private String moid;
    private String showId;

    public TicketDTO() {
    }

    public TicketDTO(String date, String moid, String showId) {
        this.date = date;
        this.moid = moid;
        this.showId = showId;
    }

    public TicketDTO(String date, String tid, String sid, String moid, String showId) {
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

    public void setTid(String tid) {
        this.tid = tid;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
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
}
