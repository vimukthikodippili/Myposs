package dao;

import com.sun.xml.internal.bind.v2.model.core.ID;
import entity.Customer;

import java.sql.SQLException;
import java.util.ArrayList;

public interface CrudDAO<T,ID> extends SuperDAO{
    boolean add(T enty)throws ClassNotFoundException, SQLException;
    public boolean delete(ID id) throws ClassNotFoundException,SQLException;
    public boolean update(T enty)throws ClassNotFoundException,SQLException;
    public T search(ID id)throws ClassNotFoundException,SQLException;
    public ArrayList<T> getAll() throws ClassNotFoundException, SQLException;
}
