package dao.custom;

import dao.CrudDAO;
import entity.Seat;

import java.sql.SQLException;
import java.util.ArrayList;

public interface SeatDAO extends CrudDAO<Seat,String> {

     ArrayList<String> getStatus() throws SQLException, ClassNotFoundException;
}
