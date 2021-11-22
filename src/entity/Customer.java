package entity;

public class Customer {
    private String cid;
    private String custName;
    private String custNic;

    public Customer() {
    }


    public void setCid(String cid) {
        this.cid = cid;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public void setCustNic(String custNic) {
        this.custNic = custNic;
    }

    public String getCid() {
        return cid;
    }

    public String getCustName() {
        return custName;
    }

    public String getCustNic() {
        return custNic;
    }

    public Customer(String cid, String custName, String custNic) {
        this.cid = cid;
        this.custName = custName;
        this.custNic = custNic;
    }

    public Customer(String cid) {
        this.cid = cid;
    }
}
