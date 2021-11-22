package controller;

import bo.custom.MovieAddBO;
import bo.custom.impl.MovieAddBOImpl;
import dto.MovieDTO;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Optional;

public class MovieAddController {
    String fillname=null;
    //byte[] personam =null;
    public Button btnAdd;
    public Button btnDlt;
    public Button btnUpdt;
    public TableColumn tblMid;
    public TableColumn tblMvNm;
    public TableColumn tblShwId;
    public TableColumn tblGnr;
    public TableColumn tblPrc;
    public TableColumn tablRtng;
    public TextField txtMvNm;
    public TextField txtShwID;
    public TextField txtGnr;
    public TextField txtPrc;
    public Button btnShwTabl;
    public AnchorPane root;
    public TextField txtId;
    public TextField txtRtng;
    public TableView tblMovie;
    public Button btnaddImg;
    public Label label1;

    public void initialize() throws Exception {
        tblMid.setCellValueFactory(new PropertyValueFactory<>("moid"));
        tblMvNm.setCellValueFactory(new PropertyValueFactory<>("movieName"));
        tblGnr.setCellValueFactory(new PropertyValueFactory<>("genre"));
        tblPrc.setCellValueFactory(new PropertyValueFactory<>("moviePrice"));
        tablRtng.setCellValueFactory(new PropertyValueFactory<>("rating"));
        tblMovie.setItems(loadAll());
    }

    final private MovieAddBO bo = new MovieAddBOImpl();


    public void btnAddOnAction(ActionEvent actionEvent) {
        String moid=txtId.getText();
        String movieName=tblMvNm.getText();
//        String  showId=tblShwId.getText();
        String genre=txtGnr.getText();
        double moviePrice= Double.parseDouble(txtPrc.getText());
        int rating= Integer.parseInt(txtRtng.getText());

        try {
            boolean isAdded = bo.addMovie(new MovieDTO(moid,movieName,genre,moviePrice,rating));

            if(isAdded)
                new Alert(Alert.AlertType.INFORMATION, "Successfully added").show();
            else
                new Alert(Alert.AlertType.ERROR, "An error occured while adding").show();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }

    public void btnDltOnAction(ActionEvent actionEvent) {
        Alert alert=new Alert(Alert.AlertType.CONFIRMATION,"do you want");
        alert.setHeaderText("do you want");
        Optional<ButtonType> buttonType=alert.showAndWait();
        ButtonType btnyes=new ButtonType("yes");
        ButtonType btnno=new ButtonType("no");
        if (buttonType.get()==ButtonType.YES)
        {
            try {
                bo.deleteMovie(txtId.getText());
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }

    }

    public void btnUpdtOnAction(ActionEvent actionEvent) {
    }

    public void btnShwTablOnAction(ActionEvent actionEvent) throws IOException {
        Stage window=(Stage) this.root.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(this.getClass().getResource("/view/MovieShow.fxml"))));
        window.centerOnScreen();
    }
    public ObservableList<MovieDTO> loadAll() throws Exception {
        ArrayList<MovieDTO> movieDTOS = bo.loadAllMovie();
        ObservableList<MovieDTO> dtos=FXCollections.observableArrayList();
        for (MovieDTO movieDTO:movieDTOS) {
            MovieDTO movieDTO1 = new MovieDTO(
                    movieDTO.getMoid(),
                    movieDTO.getMovieName(),
                    movieDTO.getGenre(),
                    movieDTO.getMoviePrice(),
                    movieDTO.getRating()
            );
            dtos.add(movieDTO1);
        }
        return dtos;
    }

    public void btnaddImgOnAction(ActionEvent actionEvent) {
      //  JFileChooser chooser=new JFileChooser();
    //    chooser.showOpenDialog(null);
     //   File f=chooser.getSelectedFile();
      //  fillname=f.getAbsolutePath();
        //ImageIcon imageIcon=new ImageIcon(new ImageIcon(fillname).getImage().getScaledInstance(label1.getWidth(),label1.getHeight(), Image.SCALE_SMOOTH));
        //label1.getScene(imageIcon);
    }
}
