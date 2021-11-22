package dao.custom;

import dao.CrudDAO;
import entity.MovieShow;
import javafx.collections.ObservableList;

import java.sql.SQLException;

public interface MovieShowDAO extends CrudDAO<MovieShow,String> {
    ObservableList<String> getShowTimes(String moid) throws ClassNotFoundException, SQLException;
}
