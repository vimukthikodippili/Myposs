package bo.custom.impl;

import bo.custom.SeatBO;
import dao.custom.Impl.SeatDAOImpl;
import dao.custom.SeatDAO;

import java.util.ArrayList;

public class SeatBOImpl implements SeatBO {

    private final SeatDAO seatDAO = new SeatDAOImpl();

    @Override
    public ArrayList<String> setSeatId() throws Exception {

        return seatDAO.getStatus();
    }

}
