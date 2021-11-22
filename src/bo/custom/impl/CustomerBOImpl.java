package bo.custom.impl;

//import bo.custom.CustomerBO;
import bo.custom.TicketBO;
import dao.DAOFactory;
import dao.SuperDAO;
import dao.custom.CustomerDAO;


import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomerBOImpl implements C {
    CustomerDAO customerDAO = (CustomerDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.CUSTOMER);

    @Override
    public String getCustomerID() throws SQLException, ClassNotFoundException {

        return customerDAO.loadCusID();
    }
}
