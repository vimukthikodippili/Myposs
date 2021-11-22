package bo;

import bo.custom.impl.CustomerBOImpl;
import bo.custom.impl.MovieShowBOImpl;
import bo.custom.impl.SeatBOImpl;
import bo.custom.impl.TicketBOImpl;

public class BOFactory {
    private static BOFactory boFactory;

    private BOFactory() {

    }

    public static BOFactory getInstance() {
        if (boFactory == null) {
            boFactory = new BOFactory();
        }
        return boFactory;
    }

    public enum BOTypes {
        SEAT,CUSTOMER,MOVIESHOW,TICKET
    }

    public SuperBO getBO(BOTypes types) {
        switch (types) {
            case SEAT:
                return new SeatBOImpl();
            case CUSTOMER:
                return new CustomerBOImpl();
            case MOVIESHOW:
                return new MovieShowBOImpl();
            case TICKET:
                return new TicketBOImpl();
            default:
                return null;
        }
    }
}
