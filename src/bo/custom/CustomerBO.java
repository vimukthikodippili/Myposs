package bo.custom;

import bo.SuperBO;


import java.sql.SQLException;

abstract interface CustomerBO extends SuperBO {
    String getCustomerID() throws ClassNotFoundException, SQLException;


}