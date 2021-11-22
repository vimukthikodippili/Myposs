package dao.custom.Impl;

import com.sun.xml.internal.bind.v2.model.core.ID;
import dao.CrudUtil;
import dao.custom.SeatDAO;
import entity.Seat;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class SeatDAOImpl implements SeatDAO {

    @Override
    public boolean add(Seat enty) throws ClassNotFoundException, SQLException {
        String SQL="insert into seat values(?)";
        return CrudUtil.executeUpdate(SQL,enty.getSid());
    }

    @Override
    public boolean delete(String s) throws ClassNotFoundException, SQLException {
        String SQL="select *from Seat where sid=?";
        return CrudUtil.executeUpdate(SQL,s);

    }
    @Override
    public boolean update(Seat enty) throws ClassNotFoundException, SQLException {
        String SQL="update MovieShow set Seat  where ShowId=?";
        return CrudUtil.executeUpdate(SQL,enty.getSid());
    }

    @Override
    public Seat search(String s) throws ClassNotFoundException, SQLException {
        String SQL="select *from Seat where sid=?";
        ResultSet rst = CrudUtil.executeQuery(SQL, s);
        if (rst.next())
            return new Seat();
        return null;

    }


    @Override
    public ArrayList<Seat> getAll() throws ClassNotFoundException, SQLException {
        String SQL="select *from seat";
        ResultSet rst = CrudUtil.executeQuery(SQL);
        ArrayList<Seat> allSeat=new ArrayList<>();
        while (rst.next())
            allSeat.add(new Seat(rst.getString(1)));
        return allSeat;
    }

    @Override
    public ArrayList<String> getStatus() throws SQLException, ClassNotFoundException {

        String SQL="select sid from seat where status = 'not avalable'";
        ResultSet rst = CrudUtil.executeQuery(SQL);
        ArrayList<String> recordList = new ArrayList<>();

        while (rst.next())
            recordList.add(rst.getString(1));

        return recordList;
    }
}
