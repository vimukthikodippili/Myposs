package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class MainFormController {


    public AnchorPane root;

    public PasswordField txtPwd;
    public TextField txtUsNm;

    public ImageView imgLG1;
    public ImageView imgLG2;

    public Button btnLogin;


    public void btnLogin_OnAction(ActionEvent actionEvent) throws IOException {
        Stage primaryStage = (Stage) root.getScene().getWindow();
        primaryStage.close();
        if (txtUsNm.getText().equals("admin") && txtPwd.getText().equals("1234")) {
            Parent root = FXMLLoader.load(this.getClass().getResource("../view/ManageForm.fxml"));
            Stage stage = new Stage();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();

        }else if (txtUsNm.getText().equals("staf") && txtPwd.getText().equals("1234")){
            Parent root = FXMLLoader.load(this.getClass().getResource("../view/MovieSelectForm.fxml"));
            Stage stage = new Stage();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }

    }
}

