package bo.custom;

import bo.SuperBO;
import dto.MovieShowDTO;
import javafx.collections.ObservableList;

import java.sql.SQLException;
import java.util.ArrayList;

public interface MovieShowBO extends SuperBO {


    boolean addMovie(MovieShowDTO movieShow) throws ClassNotFoundException, SQLException;

    boolean updateMovie(MovieShowDTO movieShow) throws ClassNotFoundException, SQLException;

    boolean deleteMovie(String id) throws ClassNotFoundException, SQLException;

    MovieShowDTO searchMovie(String id) throws ClassNotFoundException, SQLException;

    ArrayList<MovieShowDTO> allchMovie() throws ClassNotFoundException, SQLException;

    ObservableList<MovieShowDTO> loadTime() throws SQLException, ClassNotFoundException;
}
