package controller;

import com.sun.xml.internal.ws.wsdl.writer.document.soap.Body;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class ManageFormController {

    public AnchorPane root;
    public Button btn;
    public AnchorPane body;
    public Button btn1;
    public Button btn11;

    public ImageView img1;
    public ImageView img2;
    public ImageView img3;
    public ImageView img4;
    public ImageView img11;
    public Button btnLgT;

    public void btnOnAction(ActionEvent actionEvent) throws IOException {
        body.getChildren().clear();
        body.getChildren().add(FXMLLoader.load(this.getClass().getResource("/view/movieAdd.fxml")));

    }

    public void btn1OnAction(ActionEvent actionEvent) throws IOException {
        body.getChildren().clear();
        body.getChildren().add(FXMLLoader.load(this.getClass().getResource("/view/MovieShow.fxml")));

    }

    public void btnLgTOnAction(ActionEvent actionEvent) throws IOException {
        Stage window=(Stage) this.body.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(this.getClass().getResource("/view/MainForm.fxml"))));
        window.centerOnScreen();
    }
}
