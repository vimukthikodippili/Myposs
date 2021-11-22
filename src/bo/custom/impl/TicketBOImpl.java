package bo.custom.impl;

import bo.custom.SeatBO;
import bo.custom.TicketBO;
import dao.DAOFactory;
import dao.custom.TicketDAO;
import dto.TicketDTO;
import entity.Ticket;
import javafx.collections.ObservableList;

import java.sql.SQLException;

public class TicketBOImpl implements TicketBO {
    TicketDAO ticketDAO = (TicketDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.TICKET);

    @Override
    public double area() {
        return 0;
    }

    @Override
    public ObservableList<String> getBookedSeats(TicketDTO ticketDTO) throws ClassNotFoundException, SQLException {
        return ticketDAO.getBookedSeats(new Ticket(ticketDTO.getDate(),ticketDTO.getMoid(),ticketDTO.getShowId()));
    }
}
