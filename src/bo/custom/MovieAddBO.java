package bo.custom;

import dto.MovieDTO;

import java.sql.SQLException;
import java.util.ArrayList;

public interface MovieAddBO {
    public boolean addMovie(MovieDTO movieDTO)throws ClassNotFoundException, SQLException;
    public boolean updateMovie(MovieDTO movieDTO)throws ClassNotFoundException, SQLException;
    public boolean deleteMovie(String id)throws ClassNotFoundException, SQLException;
    public MovieDTO searchMovie(String id)throws ClassNotFoundException, SQLException;
    public ArrayList<MovieDTO> allchMovie(MovieDTO movieDTO)throws ClassNotFoundException, SQLException;

    ArrayList<MovieDTO> loadAllMovie()throws Exception;
}
