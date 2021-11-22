package dao.custom.Impl;

import com.sun.xml.internal.bind.v2.model.core.ID;
import dao.CrudUtil;
import dao.custom.TicketDAO;
import entity.Ticket;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class TicketDAOImpl implements TicketDAO {
    @Override
    public boolean add(Ticket enty) throws ClassNotFoundException, SQLException {
    String SQL="insert into Ticket values(?,?,?,?)";
        return CrudUtil.executeUpdate(SQL,enty.getTid(),enty.getSid(),enty.getMoid(),enty.getShowId());
    }

    @Override
    public boolean delete(String s) throws ClassNotFoundException, SQLException {
        String SQL="delete *from Ticket where Tid=?";
        return CrudUtil.executeUpdate(SQL,s);

    }

    @Override
    public boolean update(Ticket enty) throws ClassNotFoundException, SQLException {
        String SQL="update Ticket set sid=?, moid=?,showId=?  where tid=?";
        return false;
    }

    @Override
    public Ticket search(String s) throws ClassNotFoundException, SQLException {
//        String SQL="select *from Ticket where tid=?";
//        ResultSet rst = CrudUtil.executeQuery(SQL, s);
//        if (rst.next())
//            return new Ticket(rst.getString(1),rst.getString(2),rst.getString(3),rst.getString(4));
        return null;

    }



    @Override
    public ArrayList<Ticket> getAll() throws ClassNotFoundException, SQLException {
//        String SQL="select *from Ticket";
//        ResultSet rst = CrudUtil.executeQuery(SQL);
//        ArrayList<Ticket> allTicket=new ArrayList<>();
//        while (rst.next())
//            allTicket.add(new Ticket(rst.getString(1),rst.getString(2),rst.getString(3),rst.getString(4)));
//        return allTicket;
        return null;
    }

    @Override
    public ObservableList<String> getBookedSeats(Ticket ticket) throws ClassNotFoundException, SQLException {
        String SQL = "select sid from ticket where date=? AND moid=? AND showid=?;";
        ResultSet rst = CrudUtil.executeQuery(SQL, ticket.getDate(), ticket.getMoid(), ticket.getShowId());
        ObservableList<String> list = FXCollections.observableArrayList();
        while (rst.next()){
            list.add(rst.getString(1));
        }
        return list;
    }
}
