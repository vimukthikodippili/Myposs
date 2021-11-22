package dao.custom.Impl;

import com.sun.xml.internal.bind.v2.model.core.ID;
import dao.CrudUtil;
import dao.custom.BookingDAO;
import entity.Booking;
import entity.Customer;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class BookingDAOImpl implements BookingDAO {


    @Override
    public boolean add(Booking enty) throws ClassNotFoundException, SQLException {
        String SQL="select *from Booking(?,?,?,?)";
        return CrudUtil.executeUpdate(SQL,enty.getTid(),enty.getCid(),enty.getDate(),enty.getSid());
    }

    @Override
    public boolean delete(String s) throws ClassNotFoundException, SQLException {
        String SQL="delete from Booking where cid=?";
        return CrudUtil.executeUpdate(SQL,s);
    }


    @Override
    public boolean update(Booking enty) throws ClassNotFoundException, SQLException {
        String SQL="update Booking set tid=?, date=?,sid=? where cid=?";
        return CrudUtil.executeUpdate(SQL,enty.getCid(),enty.getTid(),enty.getDate(),enty.getSid());
    }

    @Override
    public Booking search(String s) throws ClassNotFoundException, SQLException {
        String SQL="select *from customer where cid=?";
        ResultSet rst = CrudUtil.executeQuery(SQL, s);
        if (rst.next()){
            return new Booking(rst.getString(1),rst.getString(2),rst.getDate(3),rst.getString(4));

        }
        return null;

    }



    @Override
    public ArrayList<Booking> getAll() throws ClassNotFoundException, SQLException {
        String SQL="select *from Booking";
        ResultSet rst = CrudUtil.executeQuery(SQL);
        ArrayList<Booking>allBooking=new ArrayList<>();
        while (rst.next())
            allBooking.add(new Booking(rst.getString(1),rst.getString(2),rst.getDate(3),rst.getString(4)));

        return allBooking;
    }
}
