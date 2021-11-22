package dao;

import bo.custom.impl.CustomerBOImpl;
import dao.custom.CustomerDAO;
import dao.custom.Impl.CustomerDAOImpl;
import dao.custom.Impl.MovieShowDAOImpl;
import dao.custom.Impl.TicketDAOImpl;

public class DAOFactory {
    private static DAOFactory daoFactory;

    private DAOFactory(){}

    public static DAOFactory getInstance(){
        if (daoFactory==null){
            daoFactory=new DAOFactory();
        }
        return daoFactory;
    }

    public enum DAOTypes{
        CUSTOMER,MOVIESHOW,TICKET
    }

    public SuperDAO getDAO(DAOTypes daoTypes){
        switch (daoTypes){
            case CUSTOMER:
                return new CustomerDAOImpl();
            case MOVIESHOW:
                return new MovieShowDAOImpl();
            case TICKET:
                return new TicketDAOImpl();
            default:
                return null;
        }
    }
}
