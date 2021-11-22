package controller;

import bo.custom.MovieShowBO;
import bo.custom.impl.MovieShowBOImpl;
import dto.MovieDTO;
import dto.MovieShowDTO;
import entity.MovieShow;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.*;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Optional;

public class MovieShowController {
    public TextField txtMvIdd;
    public TextField txt1stTm;
    public TextField txt2stTm;
    public TextField txtPrc;

    public TextField txtShwID;
    public ComboBox cmbBxMvTm;
    public TableColumn tblMID;
    public TableColumn tblSWID;
    public TableColumn tblMT;
    public TableColumn tbl1stTm;
    public TableColumn tblEndTm;
    public TableColumn tblPrc;
    public TableView tblMovieShow;
    public TableColumn tblMovieID;
    public TableColumn tblShowID;
    public TableColumn tblDate;
    public TableColumn tbl1stTime;
    public TableColumn tblprice;
    public TableColumn tblPrice;
    public Button btnMSAdd;
    public Button btnMSDlt;
    public Button btnMSUpdt;
    MovieShowBO m=new MovieShowBOImpl();

    public void btnMSAddOnAction(ActionEvent actionEvent) {
    }

    public void btnMSDltOnAction(ActionEvent actionEvent) {
//        Alert alert=new Alert(Alert.AlertType.CONFIRMATION,"do you want");
//        alert.setHeaderText("do you want");
//        Optional<ButtonType> buttonType=alert.showAndWait();
//        ButtonType btnyes=new ButtonType("yes");
//        ButtonType btnno=new ButtonType("no");
//        if (buttonType.get()==ButtonType.YES)
//        {
//            try {
//                bo.deleteMovie(txtShwID.getText());
//            } catch (ClassNotFoundException e) {
//                e.printStackTrace();
//            } catch (SQLException throwables) {
//                throwables.printStackTrace();
//            }
//        }

    }

    public void btnMSUpdtOnAction(ActionEvent actionEvent) {
    }
    public ObservableList<MovieShowDTO> loadAll() throws Exception {
        ArrayList<MovieShowDTO> movieDTOS = m.allchMovie();
        ObservableList<MovieShowDTO> dtos= FXCollections.observableArrayList();
        for (MovieShowDTO movieDTO:movieDTOS) {
            MovieShowDTO movieDTO1 = new MovieShowDTO(
                    movieDTO.getMoid(),
                    movieDTO.getShowId(),
                    movieDTO.getMovietime()
                                );
            dtos.add(movieDTO1);
        }
        return dtos;
    }
}
