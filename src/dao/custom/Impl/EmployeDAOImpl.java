package dao.custom.Impl;

import com.sun.xml.internal.bind.v2.model.core.ID;
import dao.CrudDAO;
import dao.CrudUtil;
import dao.custom.EmployeDAO;
import entity.Customer;
import entity.Employe;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class EmployeDAOImpl implements EmployeDAO {


    @Override
    public boolean add(Employe enty) throws ClassNotFoundException, SQLException {
        String SQL="insert into Employe values(?,?,?,?)";
        return CrudUtil.executeUpdate(SQL,enty.getEid(),enty.geteName(),enty.getUseName(),enty.getPassword());
    }

    @Override
    public boolean delete(String s) throws ClassNotFoundException, SQLException {
        String SQL="delete from Employe  where eid=?";
        return CrudUtil.executeUpdate(SQL,s);

    }
    @Override
    public boolean update(Employe enty) throws ClassNotFoundException, SQLException {
        String SQl="update Customer set eName=?, password=?,useName=? where eid=?";
        return CrudUtil.executeUpdate(SQl,enty.getEid(),enty.geteName(),enty.getUseName(),enty.getPassword());
    }

    @Override
    public Employe search(String s) throws ClassNotFoundException, SQLException {
        String SQL="select *from customer where eid=?";
        ResultSet rst = CrudUtil.executeQuery(SQL, s);
        if (rst.next()){
            return new Employe(rst.getString(1),rst.getString(2),rst.getString(3),rst.getString(4));
        }
        return null;

    }


    @Override
    public ArrayList<Employe> getAll() throws ClassNotFoundException, SQLException {
        String SQL="select *from Employe";
        ResultSet rst = CrudUtil.executeQuery(SQL);
        ArrayList<Employe> allEmploye=new ArrayList<>();
        while (rst.next())
            allEmploye.add(new Employe(rst.getString(1),rst.getString(2),rst.getString(3),rst.getString(4)));
        return allEmploye;
    }
}
