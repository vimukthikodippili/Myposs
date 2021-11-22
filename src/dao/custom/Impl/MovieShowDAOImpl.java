package dao.custom.Impl;

import com.sun.xml.internal.bind.v2.model.core.ID;
import dao.CrudUtil;
import dao.custom.MovieShowDAO;
import entity.MovieShow;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MovieShowDAOImpl implements MovieShowDAO {
    @Override
    public boolean add(MovieShow entity) throws ClassNotFoundException, SQLException {
        String SQL="select *from MovieShow(?,?,?)";
        return CrudUtil.executeUpdate(SQL,entity.getMoid(),entity.getShowId(),entity.getMovietime());
    }

    @Override
    public boolean delete(String s) throws ClassNotFoundException, SQLException {
        String SQL="delete from MovieShow where ShowId=?";
        return CrudUtil.executeUpdate(SQL,s);

    }



    @Override
    public boolean update(MovieShow enty) throws ClassNotFoundException, SQLException {
        String SQL="update MovieShow set moid=?,movieDate=?, stTime=?,moviePrice=?,endTime=?  where ShowId=?";
        return CrudUtil.executeUpdate(SQL,enty.getShowId(),enty.getMovietime());
    }

    @Override
    public MovieShow search(String s) throws ClassNotFoundException, SQLException {
        String SQL = "select *from Movie where ShowId=?";
        ResultSet rst = CrudUtil.executeQuery(SQL, s);
        if (rst.next())
            return new MovieShow(rst.getString(1),rst.getString(2),rst.getString(3));

    return null;
    }



    @Override
    public ArrayList<MovieShow> getAll() throws ClassNotFoundException, SQLException {
        String SQL="select *from MovieShow";
        ResultSet rst = CrudUtil.executeQuery(SQL);
        ArrayList<MovieShow> allShow=new ArrayList<>();
        while(rst.next())
            allShow.add(new MovieShow(rst.getString(1),rst.getString(2),rst.getString(3)));

        return allShow;
    }

    @Override
    public ObservableList<String> getShowTimes(String moid) throws ClassNotFoundException, SQLException {
        String SQL = "select time from movieshow where moid=?";
        ResultSet rst = CrudUtil.executeQuery(SQL, moid);
        ObservableList<String> list = FXCollections.observableArrayList();
        while (rst.next()){
            list.add(rst.getString(1));
        }
        return list;
    }
}
