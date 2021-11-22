package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class MovieSelectController {

    public AnchorPane Root;
    public ImageView imgMvslc;
    public Button btnBK2;
    public Button btnBK1;
    public ImageView imgFlm1;



    public void btnBK2OnAction(ActionEvent actionEvent) throws IOException {
        String moid="M055";
        Stage window=(Stage) this.Root.getScene().getWindow();
        //window.close();



        Parent root=FXMLLoader.load(this.getClass().getResource("/view/seatForm.fxml"));
        Stage stage=new Stage();
        Scene scene=new Scene(root);
        stage.setScene(scene);
        stage.show();

        Stage primaryStage= (Stage) btnBK2.getScene().getWindow();
        primaryStage.close();


//        window.setScene(new Scene(FXMLLoader.load(this.getClass().getResource("/view/seatForm.fxml"))));
//        window.centerOnScreen();

    }

    public void btnBK1OnAction(ActionEvent actionEvent) throws IOException {
        Stage window=(Stage) this.Root.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(this.getClass().getResource("/view/seatForm.fxml"))));
        window.centerOnScreen();

    }
}
