package dao.custom;

import dao.CrudDAO;
import entity.Ticket;
import javafx.collections.ObservableList;

import java.sql.SQLException;

public interface TicketDAO extends CrudDAO<Ticket,String> {
    ObservableList<String> getBookedSeats(Ticket ticket) throws ClassNotFoundException, SQLException;
}
