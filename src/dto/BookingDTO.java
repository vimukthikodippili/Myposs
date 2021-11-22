package dto;

import java.sql.Date;

public class BookingDTO {
    private String  cid;
    private String tid;
    private Date date;
    private String sid;

    public BookingDTO() {
    }

    public BookingDTO(String cid, String tid, Date date, String sid) {
        this.cid = cid;
        this.tid = tid;
        this.date = date;
        this.sid = sid;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }
}
