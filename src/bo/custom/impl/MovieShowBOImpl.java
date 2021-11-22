package bo.custom.impl;

import bo.custom.MovieShowBO;
import dao.custom.Impl.MovieShowDAOImpl;
import dao.custom.MovieShowDAO;
import dto.MovieDTO;
import dto.MovieShowDTO;
import entity.Movie;
import entity.MovieShow;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.SQLException;
import java.util.ArrayList;

public class MovieShowBOImpl implements MovieShowBO {

    MovieShowDAO movieShowDAO = new MovieShowDAOImpl();

    @Override
    public boolean addMovie(MovieShowDTO movieShow) throws ClassNotFoundException, SQLException {
        //return movieShowDAO.add(new MovieShow(movieShow.getMoid(),movieShow.getShowId(),movieShow.getStTime(),movieShow.getMoviePrice(),movieShow.getEndTime(),movieShow.getMovieDate()));
        return false;
    }

    @Override
    public boolean updateMovie(MovieShowDTO movieShow) throws ClassNotFoundException, SQLException {
       //return movieShowDAO.update(new MovieShow(movieShow.getMoid(),movieShow.getShowId(),movieShow.getStTime(),movieShow.getMoviePrice(),movieShow.getEndTime(),movieShow.getMovieDate()));
        return false;
    }

    @Override
    public boolean deleteMovie(String id) throws ClassNotFoundException, SQLException {
        return movieShowDAO.delete(id);
    }

    @Override
    public MovieShowDTO searchMovie(String id) throws ClassNotFoundException, SQLException {
        MovieShow moviebo = movieShowDAO.search(id);
        //return new MovieShowDTO(moviebo.getMoid(),moviebo.getShowId(),moviebo.getStTime(),moviebo.getMoviePrice(),moviebo.getEndTime(),moviebo.getMovieDate());
        return null;
    }

    @Override
    public ArrayList<MovieShowDTO> allchMovie() throws ClassNotFoundException, SQLException {
//        ArrayList<MovieShow> allShow = movieShowDAO.getAll();
//        ArrayList<MovieShowDTO> allMovieShow=new ArrayList<>();
//        for (MovieShow movieShow:allShow) {
//            allShow.add(new MovieShow(movieShow.getMoid(),movieShow.getShowId(),movieShow.getStTime(),movieShow.getMoviePrice(),movieShow.getEndTime(),movieShow.getMovieDate()));
//
//        }
        return null;
    }

    @Override
    public ObservableList<MovieShowDTO> loadTime() throws SQLException, ClassNotFoundException {
        ArrayList<MovieShow> combo=movieShowDAO.getAll();
        ObservableList<MovieShowDTO> movieShowDTOS=FXCollections.observableArrayList();
        for (MovieShow movieShow:combo) {
            movieShowDTOS.add(new MovieShowDTO(movieShow.getMovietime()));
        }

        return movieShowDTOS;
    }


}



