package entity;

public class Employe {
    private String eid;
    private String eName;
    private String password;
    private String useName;

    public Employe() {
    }

    public Employe(String eid, String eName, String password, String useName) {
        this.eid = eid;
        this.eName = eName;
        this.password = password;
        this.useName = useName;
    }

    public void setEid(String eid) {
        this.eid = eid;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUseName(String useName) {
        this.useName = useName;
    }

    public String getEid() {
        return eid;
    }

    public String geteName() {
        return eName;
    }

    public String getPassword() {
        return password;
    }

    public String getUseName() {
        return useName;
    }
}
