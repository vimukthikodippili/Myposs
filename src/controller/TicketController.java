package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class TicketController {
    //String movieid ;
    public ComboBox cmbSlctTm;
    public Button btnSt;
    public Button btnPrchs;
    public Button btnClr;
    public AnchorPane root;
    public Button btnLgT;
    public ImageView img4;
    public ImageView img1;
    public TextField txtStNo;
    public Button btnPrchc;
    public ImageView img3;
    public ImageView img2;
    public TextField txtTID;
    public Button btnLgTT;

    public void btnPrchsOnAction(ActionEvent actionEvent) {
    }

    public void btnClrOnAction(ActionEvent actionEvent) {
    }

    public void btnStOnAction(ActionEvent actionEvent) throws IOException {
        Stage window=(Stage) this.root.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(this.getClass().getResource("/view/seatForm.fxml"))));
        window.centerOnScreen();

    }

    public void btnLgTOnAction(ActionEvent actionEvent) {
    }

    public void btnPrchcOnAction(ActionEvent actionEvent) {
    }

    public void btnLgTTOnAction(ActionEvent actionEvent) throws IOException {
        Stage window=(Stage) this.root.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(this.getClass().getResource("/view/MainForm.fxml"))));
        window.centerOnScreen();
    }
}
