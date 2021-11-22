package dao.custom.Impl;

import com.sun.xml.internal.bind.v2.model.core.ID;
import dao.CrudUtil;
import dao.custom.CustomerDAO;
import entity.Customer;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CustomerDAOImpl implements CustomerDAO {

    @Override
    public boolean add(Customer enty) throws ClassNotFoundException, SQLException {
        String SQL = "insert into customer values(?,?,?)";
        return CrudUtil.executeUpdate(SQL, enty.getCid(), enty.getCustName(), enty.getCustNic());
    }

    @Override
    public boolean delete(String s) throws ClassNotFoundException, SQLException {
        String SQL = "select *from Movie where moid=?";
        return CrudUtil.executeUpdate(SQL, s);

    }

    @Override
    public boolean update(Customer enty) throws ClassNotFoundException, SQLException {
        String SQL = "update Customer set custName=?, custNic=? where cid=?";
        return CrudUtil.executeUpdate(SQL, enty.getCid(), enty.getCustName(), enty.getCustNic());
    }

    @Override
    public Customer search(String s) throws ClassNotFoundException, SQLException {
        String SQL = "select *from customer where cid=?";
        ResultSet rst = CrudUtil.executeQuery(SQL, s);
        if (rst.next()) {
            return new Customer(rst.getString(1), rst.getString(2), rst.getString(3));
        }
        return null;

    }


    @Override
    public ArrayList<Customer> getAll() throws ClassNotFoundException, SQLException {
        String SQL = "select *from customer";
        ResultSet rst = CrudUtil.executeQuery(SQL);
        ArrayList<Customer> allCustomer = new ArrayList<>();
        while (rst.next())
            allCustomer.add(new Customer(rst.getString(1), rst.getString(2), rst.getString(3)));
        return allCustomer;
    }

    @Override
    public String loadCusID() throws ClassNotFoundException, SQLException {
        String SQL = "SELECT cid FROM customer ORDER BY cid DESC limit 1";
        ResultSet rst = CrudUtil.executeQuery(SQL);
        if (rst.next()) {
            String id = rst.getString(1);
            String[] temparr = id.split("C");
            int temp = Integer.parseInt(temparr[1]);
            temp += 1;

            if (temp < 10) {
                return ("C00" + temp);
            } else if (temp < 100) {
                return ("C0" + temp);
            } else {
                return ("C" + temp);
            }
        }
        return "C001";
    }

}
