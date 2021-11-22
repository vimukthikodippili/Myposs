package bo.custom.impl;

import bo.custom.MovieAddBO;
import com.sun.xml.internal.bind.v2.model.core.ID;
import dao.custom.Impl.MovieDAOImpl;
import dao.custom.MovioeDAO;
import dto.MovieDTO;
import entity.Movie;

import java.sql.SQLException;
import java.util.ArrayList;

public class MovieAddBOImpl implements MovieAddBO {

    private final MovioeDAO movieDAO = new MovieDAOImpl();


    @Override
    public boolean addMovie(MovieDTO movieDTO) throws ClassNotFoundException, SQLException {
        return movieDAO.add(new Movie(movieDTO.getMoid(),movieDTO.getMovieName(),movieDTO.getGenre(),movieDTO.getMoviePrice(),movieDTO.getRating()));

    }

    @Override
    public boolean updateMovie(MovieDTO movieDTO) throws ClassNotFoundException, SQLException {
        return movieDAO.update(new Movie(movieDTO.getMoid(),movieDTO.getMovieName(),movieDTO.getGenre(),movieDTO.getMoviePrice(),movieDTO.getRating()));
    }

    @Override
    public boolean deleteMovie(String id) throws ClassNotFoundException, SQLException {
        return movieDAO.delete(id);
    }

    @Override
    public MovieDTO searchMovie(String id) throws ClassNotFoundException, SQLException {
        Movie movie = movieDAO.search(id);
        return new MovieDTO(movie.getMoid(),movie.getMovieName(),movie.getGenre(),movie.getMoviePrice(),movie.getRating());
    }

    @Override
    public ArrayList<MovieDTO> allchMovie(MovieDTO movieDTO) throws ClassNotFoundException, SQLException {
        ArrayList<Movie> all = movieDAO.getAll();
        ArrayList<MovieDTO> allMovie=new ArrayList<>();
        for (Movie movie: all) {
            allMovie.add(new MovieDTO(movie.getMoid(),
                    movie.getMovieName(),
                    movie.getGenre(),
                    movie.getMoviePrice(),
                    movie.getRating()));
        }
        return null;
    }

    @Override
    public ArrayList<MovieDTO> loadAllMovie() throws Exception {
        ArrayList<Movie> all = movieDAO.getAll();
        ArrayList<MovieDTO>movieDTOS=new ArrayList<>();
        for (Movie movie :all) {
            MovieDTO movieDTO = new MovieDTO(
                    movie.getMoid(),
                    movie.getMovieName(),
                    movie.getGenre(),
                    movie.getMoviePrice(),
                    movie.getRating()
            );
            movieDTOS.add(movieDTO);
        }
        return movieDTOS;
    }


}
