package bo.custom;

import dto.EmployeDTO;
import dto.MovieDTO;

import java.sql.SQLException;

public interface MainFormBO {
    public EmployeDTO searchMovie(String id)throws ClassNotFoundException, SQLException;
}
