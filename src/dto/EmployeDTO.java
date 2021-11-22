package dto;

public class EmployeDTO {
    private String eid;
    private String eName;
    private String password;
    private String useName;

    public EmployeDTO() {
    }

    public EmployeDTO(String eid, String eName, String password, String useName) {
        this.eid = eid;
        this.eName = eName;
        this.password = password;
        this.useName = useName;
    }

    public String getEid() {
        return eid;
    }

    public void setEid(String eid) {
        this.eid = eid;
    }

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUseName() {
        return useName;
    }

    public void setUseName(String useName) {
        this.useName = useName;
    }
}
