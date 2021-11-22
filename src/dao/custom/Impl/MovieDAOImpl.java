package dao.custom.Impl;

import com.sun.xml.internal.bind.v2.model.core.ID;
import dao.CrudDAO;
import dao.CrudUtil;
import dao.custom.MovioeDAO;
import entity.Movie;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MovieDAOImpl implements MovioeDAO {

    @Override
    public boolean add(Movie enty) throws ClassNotFoundException, SQLException {
        String SQL="insert into Movie values(?,?,?,?,?)";
        return CrudUtil.executeUpdate(SQL,enty.getMoid(),enty.getMovieName(),enty.getGenre(),enty.getMoviePrice(),enty.getRating());
    }

    @Override
    public boolean delete(String s) throws ClassNotFoundException, SQLException {
        String SQL="delete from Movie where moid=?";
        return CrudUtil.executeUpdate(SQL,s);
    }

    @Override
    public boolean update(Movie enty) throws ClassNotFoundException, SQLException {
        String SQL="update Movie set movieName=?,genre=?,rating=?,moviePrice=?  where moid=?";
        return CrudUtil.executeUpdate(SQL,enty.getMoid(),enty.getMovieName(),enty.getGenre(),enty.getMoviePrice(),enty.getRating());
    }

    @Override
    public Movie search(String s) throws ClassNotFoundException, SQLException {
        String SQL="select *from Movie where moid=?";
        ResultSet rst = CrudUtil.executeQuery(SQL, s);
        if (rst.next()) {
            return new Movie(rst.getString(1), rst.getString(2), rst.getString(3), rst.getDouble(4), rst.getInt(5));
        }
        return null;
    }

    @Override
    public ArrayList<Movie> getAll() throws ClassNotFoundException, SQLException {
        String SQL="select *from Movie";
        ResultSet rst = CrudUtil.executeQuery(SQL);
        ArrayList<Movie> allMovie=new ArrayList<>();
        while (rst.next())
            allMovie.add(new Movie(rst.getString(1),rst.getString(2),rst.getString(3),rst.getDouble(4),rst.getInt(5)));

        return allMovie;
    }
}
