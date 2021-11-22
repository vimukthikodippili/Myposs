package bo.custom.impl;

import bo.custom.MainFormBO;
import dao.custom.EmployeDAO;
import dao.custom.Impl.EmployeDAOImpl;
import dto.EmployeDTO;
import entity.Employe;

import java.sql.SQLException;


public class MainFormBOImpl implements MainFormBO  {
    private final EmployeDAO employeDAO=new EmployeDAOImpl();
    @Override
    public EmployeDTO searchMovie(String id) throws ClassNotFoundException, SQLException {
        Employe employe=employeDAO.search(id);
        return new EmployeDTO(employe.getEid(),employe.geteName(),employe.getPassword(),employe.getUseName()) ;
    }
}
