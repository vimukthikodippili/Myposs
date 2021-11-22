package dto;

public class SeatDTO {
    private String sid;
    private String status;
    private String book;

    public SeatDTO() {
    }

    public SeatDTO(String sid, String status, String book) {
        this.sid = sid;
        this.status = status;
        this.book = book;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getBook() {
        return book;
    }

    public void setBook(String book) {
        this.book = book;
    }
}
