package dao.custom;

import dao.CrudDAO;
import entity.Movie;

import java.sql.SQLException;

public interface MovioeDAO extends CrudDAO<Movie,String> {
    boolean delete(String id) throws ClassNotFoundException, SQLException;

//    Movie search(String id) throws ClassNotFoundException, SQLException;
}
