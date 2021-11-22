package dto;

public class CustomerDTO {
    private String cid;
    private String custName;
    private String custNic;
    public CustomerDTO() {
    }

    public CustomerDTO(String cid, String custName, String custNic) {
        this.cid = cid;
        this.custName = custName;
        this.custNic = custNic;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getCustNic() {
        return custNic;
    }

    public void setCustNic(String custNic) {
        this.custNic = custNic;
    }
}
