package bo.custom;

import bo.SuperBO;
import dto.MovieShowDTO;
import dto.TicketDTO;
import javafx.collections.ObservableList;

import java.sql.SQLException;

public interface TicketBO extends SuperBO {
 abstract double area();
    public ObservableList<String> getBookedSeats(TicketDTO ticketDTO) throws ClassNotFoundException, SQLException;
}

