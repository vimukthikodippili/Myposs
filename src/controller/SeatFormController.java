package controller;

import bo.BOFactory;
import bo.custom.CustomerBO;
import bo.custom.MovieShowBO;
import bo.custom.SeatBO;
import bo.custom.TicketBO;
import dto.MovieShowDTO;
import dto.SeatDTO;
import dto.TicketDTO;
import entity.Ticket;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.ResourceBundle;

public class SeatFormController implements Initializable {
    CustomerBO customerBO = (CustomerBO) BOFactory.getInstance().getBO(BOFactory.BOTypes.CUSTOMER);
    MovieShowBO movieShowBO = (MovieShowBO) BOFactory.getInstance().getBO(BOFactory.BOTypes.MOVIESHOW);
    TicketBO ticketBO = (TicketBO) BOFactory.getInstance().getBO(BOFactory.BOTypes.TICKET);

    String movieid;

    public void setid(String movieid){
        System.out.println("movie id "+movieid);

        this.movieid = movieid;
    }
    public Button btnS1;
    public Button btnS2;
    public Button btnS3;
    public Button btnS4;
    public Button btnS5;
    public Button btnS8;
    public Button btnS9;
    public Button btnS10;
    public Button btnS11;
    public Button btnS13;
    public Button btnS14;
    public Button btnS15;
    public Button btnS16;
    public Button btnS17;
    public Button btnS20;
    public Button btnS21;
    public Button btnS22;
    public Button btnS23;
    public Button btnS25;
    public Button btnS26;
    public Button btnS27;
    public Button btnS28;
    public Button btnS29;
    public Button btnS30;
    public Button btnS31;
    public Button btnS32;
    public Button btnS33;
    public Button btnS34;
    public Button btnS12;
    public Button btnS24;
    public Button btnS37;
    public Button btnS38;
    public Button btnS39;
    public Button btnS40;
    public Button btnS41;
    public Button btnS42;
    public Button btnS44;
    public Button btnS45;
    public Button btnS46;
    public Button btnS47;
    public Button btnS49;
    public Button btnS50;
    public Button btnS51;
    public Button btnS52;
    public Button btnS53;
    public Button btnS54;
    public Button btnS55;
    public Button btnS56;
    public Button btnS57;
    public Button btnS58;
    public Button btnS61;
    public Button btnS62;
    public Button btnS63;
    public Button btnS64;
    public Button btnS65;
    public Button btnS66;
    public Button btnS67;
    public Button btnS68;
    public Button btnS69;
    public Button btnS70;
    public Button btnS6;
    public Button btnS18;
    public Button btnS7;
    public Button btnS19;
    public Button btnS35;
    public Button btnS36;
    public Button btnS43;
    public Button btnS48;
    public Button btnS59;
    public Button btnS60;
    public Button btnS71;
    public Button btnS72;
    public Button btnOk;
    public AnchorPane root;
    public ImageView img1;
    @FXML
    private ComboBox<String> cmbTimeSet;


    @FXML
    private TextField txtCusID;


    @FXML
    private TextField txtCusName;

    @FXML
    private TextField txtNIC;

    @FXML
    private TextField txtMovieID;

    @FXML
    private TextField txtMovieName;

    @FXML
    private TextField txtDate;

    SeatBO bo = (SeatBO) BOFactory.getInstance().getBO(BOFactory.BOTypes.SEAT);
    ArrayList<String> seatIDs = new ArrayList<>();


    SeatBO bo1 = (SeatBO) BOFactory.getInstance().getBO(BOFactory.BOTypes.SEAT);

    public void initialize() throws SQLException, ClassNotFoundException {

        loadCombo();
        seatDisable();
    }




    private void seatDisable(){


        try {
            ArrayList<String> seatList = bo.setSeatId();
            System.out.println(seatList.size());

            for(String seat:seatList)
            {
                switch (seat){
                    case "S1":
                        System.out.println("seat s1");
                        btnS1.setDisable(true);
                        break;

                    case "S2":
                        System.out.println("seat s1");
                        btnS2.setDisable(true);
                        break;
                        case "S3":
                            System.out.println("seat s1");
                        btnS3.setDisable(true);
                            break;
                    case "S4":
                        btnS4.setDisable(true);
                        break;
                    case "S5":
                        btnS5.setDisable(true);
                        break;

                    case "S6":
                        btnS6.setDisable(true);
                        break;
                    case "S7":
                        btnS7.setDisable(true);
                        break;
                    case "S8":
                        btnS8.setDisable(true);
                        break;
                    case "S9":
                        btnS10.setDisable(true);
                        break;
                    case "S11":
                        btnS11.setDisable(true);
                        break;
                    case "S12":
                        btnS12.setDisable(true);
                        break;
                    case "S13":
                        btnS13.setDisable(true);
                        break;
                    case "S14":
                        btnS14.setDisable(true);
                        break;
                    case "S15":
                        btnS15.setDisable(true);
                        break;
                    case "S16":
                        btnS16.setDisable(true);
                        break;
                    case "S17":
                        btnS17.setDisable(true);
                        break;
                    case "S18":
                        btnS18.setDisable(true);
                        break;
                    case "S19":
                        btnS19.setDisable(true);
                        break;
                    case "S20":
                        btnS20.setDisable(true);
                        break;
                    case "S21":
                        btnS21.setDisable(true);
                        break;
                    case "S22":
                        btnS22.setDisable(true);
                        break;
                    case "S23":
                        btnS23.setDisable(true);
                        break;
                    case "S24":
                        btnS24.setDisable(true);
                        break;
                    case "S25":
                        btnS25.setDisable(true);
                        break;
                    case "S26":
                        btnS26.setDisable(true);
                        break;
                    case "S27":
                        btnS27.setDisable(true);
                        break;
                    case "S28":
                        btnS28.setDisable(true);
                        break;
                    case "S29":
                        btnS29.setDisable(true);
                        break;
                    case "S30":
                        btnS30.setDisable(true);
                        break;
                    case "S31":
                        btnS31.setDisable(true);
                        break;
                    case "S32":
                        btnS32.setDisable(true);
                        break;
                    case "S33":
                        btnS33.setDisable(true);
                        break;
                    case "S34":
                        btnS34.setDisable(true);
                        break;
                    case "S35":
                        btnS35.setDisable(true);
                        break;
                    case "S36":
                        btnS36.setDisable(true);
                        break;
                    case "S37":
                        btnS38.setDisable(true);
                        break;
                        case "39":
                        btnS39.setDisable(true);
                            break;
                    case "S40":
                        btnS40.setDisable(true);
                        break;
                    case "S41":
                        btnS41.setDisable(true);
                        break;
                        case "S42":
                        btnS42.setDisable(true);
                            break;
                    case "S43":
                        btnS43.setDisable(true);
                        break;
                    case "S45":
                        btnS45.setDisable(true);
                        break;
                    case "S46":
                        btnS46.setDisable(true);
                        break;
                    case "S47":
                        btnS47.setDisable(true);
                        break;
                    case "S48":
                        btnS48.setDisable(true);
                        break;
                    case "S49":
                        btnS49.setDisable(true);
                        break;
                    case "S50":
                        btnS50.setDisable(true);
                        break;
                    case "S51":
                        btnS51.setDisable(true);
                        break;
                    case "S52":
                        btnS52.setDisable(true);
                        break;
                    case "S53":
                        btnS53.setDisable(true);
                        break;
                    case "S54":
                        btnS54.setDisable(true);
                        break;
                        case "S55":
                        btnS55.setDisable(true);
                            break;
                    case "S56":
                        btnS56.setDisable(true);
                        break;
                    case "S57":
                        btnS57.setDisable(true);
                        break;
                    case "S58":
                        btnS58.setDisable(true);
                        break;
                    case "S59":
                        btnS59.setDisable(true);
                        break;
                    case "S60":
                        btnS60.setDisable(true);
                        break;
                    case "S61":
                        btnS61.setDisable(true);
                        break;
                    case "S62":
                        btnS62.setDisable(true);
                        break;
                    case "S63":
                        btnS63.setDisable(true);
                        break;
                    case "S64":
                        btnS64.setDisable(true);
                        break;
                    case "S65":
                        btnS65.setDisable(true);
                        break;
                    case "S66":
                        btnS66.setDisable(true);

                        break;
                    case "S67":
                        btnS67.setDisable(true);
                        break;
                    case "S68":
                        btnS68.setDisable(true);
                        break;
                    case "S69":
                        btnS69.setDisable(true);
                        break;
                    case "S70":
                        btnS70.setDisable(true);
                        break;
                    case "S71":
                        btnS71.setDisable(true);
                        break;
                    case "S72":
                        btnS72.setDisable(true);
                        break;









                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void btnS1OnAction(ActionEvent actionEvent) {
        try {
            btnS1.setDisable(true);
            bo.setSeatId();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void btnS2OnAction(ActionEvent actionEvent) {
        seatIDs.add("S2");

        btnS2.setDisable(true);
        btnS2.setStyle("-fx-background-color: red;");
    }

    public void btnS3OnAction(ActionEvent actionEvent) {
        seatIDs.add("S3");
        btnS3.setDisable(true);
        btnS3.setStyle("-fx-background-color: red");
    }

    public void btnS4OnAction(ActionEvent actionEvent) {
        seatIDs.add("S4");
        btnS4.setDisable(true);
        btnS4.setStyle("-fx-background-color: red");
    }

    public void btnS5OnAction(ActionEvent actionEvent) {
        seatIDs.add("S5");
        btnS5.setDisable(true);
        btnS5.setStyle("-fx-background-color: red");
    }

    public void btnS8OnAction(ActionEvent actionEvent) {
        seatIDs.add("S8");
        btnS8.setDisable(true);
        btnS8.setStyle("-fx-background-color: red");
    }

    public void btnS6OnAction(ActionEvent actionEvent) {
        seatIDs.add("S6");
        btnS6.setDisable(true);
        btnS6.setStyle("-fx-background-color: red");
    }

    public void btnS10OnAction(ActionEvent actionEvent) {
        seatIDs.add("S10");
        btnS10.setDisable(true);
        btnS10.setStyle("-fx-background-color: red");
    }

    public void btnS11OnAction(ActionEvent actionEvent) {
        seatIDs.add("S11");
        btnS11.setDisable(true);
        btnS11.setStyle("-fx-background-color: red");

    }

    public void btnS13OnAction(ActionEvent actionEvent) {
        seatIDs.add("S13");
        btnS13.setDisable(true);
        btnS13.setStyle("-fx-background-color: red");

    }

    public void btnS15OnAction(ActionEvent actionEvent) {
        seatIDs.add("S15");
        btnS15.setDisable(true);
        btnS15.setStyle("-fx-background-color: red");

    }

    public void btnS16OnAction(ActionEvent actionEvent) {
        seatIDs.add("S16");
        btnS16.setDisable(true);
        btnS16.setStyle("-fx-background-color: red");

    }

    public void btnS17OnAction(ActionEvent actionEvent) {
        seatIDs.add("S17");
        btnS17.setDisable(true);
        btnS17.setStyle("-fx-background-color: red");

    }

    public void btnS20OnAction(ActionEvent actionEvent) {
        seatIDs.add("S20");
        btnS20.setDisable(true);
        btnS20.setStyle("-fx-background-color: #ff0000");

    }

    public void btnS21OnAction(ActionEvent actionEvent) {
        seatIDs.add("S21");
        btnS21.setDisable(true);
        btnS21.setStyle("-fx-background-color: red");

    }

    public void btnS22OnAction(ActionEvent actionEvent) {
        seatIDs.add("S22");
        btnS22.setDisable(true);
        btnS22.setStyle("-fx-background-color: red");

    }

    public void btnS23OnAction(ActionEvent actionEvent) {
        seatIDs.add("S23");
        btnS23.setDisable(true);
        btnS23.setStyle("-fx-background-color: red");

    }

    public void btnS25OnAction(ActionEvent actionEvent) {
        seatIDs.add("S25");
        btnS25.setDisable(true);
        btnS25.setStyle("-fx-background-color: red");

    }

    public void btnS26OnAction(ActionEvent actionEvent) {
        seatIDs.add("S26");
        btnS26.setDisable(true);
        btnS26.setStyle("-fx-background-color: red");

    }

    public void btnS27OnAction(ActionEvent actionEvent) {
        seatIDs.add("S27");
        btnS27.setDisable(true);
        btnS27.setStyle("-fx-background-color: red");

    }

    public void btnS28OnAction(ActionEvent actionEvent) {
        seatIDs.add("S28");
        btnS28.setDisable(true);
        btnS28.setStyle("-fx-background-color: red");

    }

    public void btnS29OnAction(ActionEvent actionEvent) {
        seatIDs.add("S29");
        btnS29.setDisable(true);
        btnS29.setStyle("-fx-background-color: red");

    }

    public void btnS30OnAction(ActionEvent actionEvent) {
        seatIDs.add("S30");
        btnS30.setDisable(true);
        btnS30.setStyle("-fx-background-color: red");

    }

    public void btnS31OnAction(ActionEvent actionEvent) {
        seatIDs.add("S31");
        btnS31.setDisable(true);
        btnS31.setStyle("-fx-background-color: red");

    }

    public void btnS32OnAction(ActionEvent actionEvent) {
        seatIDs.add("S32");
        btnS32.setDisable(true);
        btnS32.setStyle("-fx-background-color: red");

    }

    public void btnS33OnAction(ActionEvent actionEvent) {
        seatIDs.add("S33");
        btnS33.setDisable(true);
        btnS33.setStyle("-fx-background-color: red");

    }

    public void btnS34OnAction(ActionEvent actionEvent) {
        seatIDs.add("S34");
        btnS34.setDisable(true);
        btnS34.setStyle("-fx-background-color: red");

    }

    public void btnS12OnAction(ActionEvent actionEvent) {
        seatIDs.add("S12");
        btnS12.setDisable(true);
        btnS12.setStyle("-fx-background-color: red");

    }

    public void btnS24OnAction(ActionEvent actionEvent) {
        seatIDs.add("S24");
        btnS24.setDisable(true);
        btnS24.setStyle("-fx-background-color: red");

    }

    public void btnS37OnAction(ActionEvent actionEvent) {
        seatIDs.add("S37");
        btnS37.setDisable(true);
        btnS37.setStyle("-fx-background-color: red");

    }

    public void btnS38OnAction(ActionEvent actionEvent) {
        seatIDs.add("S38");
        btnS38.setDisable(true);
        btnS38.setStyle("-fx-background-color: red");

    }

    public void btnS39OnAction(ActionEvent actionEvent) {
        seatIDs.add("S39");
        btnS39.setDisable(true);
        btnS39.setStyle("-fx-background-color: red");

    }

    public void btnS40OnAction(ActionEvent actionEvent) {
        seatIDs.add("S40");
        btnS40.setDisable(true);
        btnS40.setStyle("-fx-background-color: red");

    }

    public void btnS41OnAction(ActionEvent actionEvent) {
        seatIDs.add("S41");
        btnS41.setDisable(true);
        btnS41.setStyle("-fx-background-color: red");

    }

    public void btnS42OnAction(ActionEvent actionEvent) {
        seatIDs.add("S42");
        btnS42.setDisable(true);
        btnS42.setStyle("-fx-background-color: red");

    }

    public void btnS44OnAction(ActionEvent actionEvent) {
        seatIDs.add("S44");
        btnS44.setDisable(true);
        btnS44.setStyle("-fx-background-color: red");

    }

    public void btnS45OnAction(ActionEvent actionEvent) {
        seatIDs.add("S45");
        btnS45.setDisable(true);
        btnS45.setStyle("-fx-background-color: red");

    }

    public void btnS46OnAction(ActionEvent actionEvent) {
        seatIDs.add("S46");
        btnS46.setDisable(true);
        btnS46.setStyle("-fx-background-color: red");

    }

    public void btnS47OnAction(ActionEvent actionEvent) {
        seatIDs.add("S47");
        btnS47.setDisable(true);
        btnS47.setStyle("-fx-background-color: red");

    }

    public void btnS49OnAction(ActionEvent actionEvent) {
        seatIDs.add("S49");
        btnS49.setDisable(true);
        btnS49.setStyle("-fx-background-color: red");

    }

    public void btnS50OnAction(ActionEvent actionEvent) {
        seatIDs.add("S50");
        btnS50.setDisable(true);
        btnS50.setStyle("-fx-background-color: red");

    }

    public void btnS51OnAction(ActionEvent actionEvent) {
        seatIDs.add("S51");
        btnS51.setDisable(true);
        btnS51.setStyle("-fx-background-color: red");

    }

    public void btnS52OnAction(ActionEvent actionEvent) {
        seatIDs.add("S52");
        btnS52.setDisable(true);
        btnS52.setStyle("-fx-background-color: red");

    }

    public void btnS53OnAction(ActionEvent actionEvent) {
        seatIDs.add("S53");
        btnS53.setDisable(true);
        btnS53.setStyle("-fx-background-color: red");

    }

    public void btnS54OnAction(ActionEvent actionEvent) {
        seatIDs.add("S54");
        btnS54.setDisable(true);
        btnS54.setStyle("-fx-background-color: red");

    }

    public void btnS55OnAction(ActionEvent actionEvent) {
        seatIDs.add("S55");
        btnS55.setDisable(true);
        btnS55.setStyle("-fx-background-color: red");

    }

    public void btnS56OnAction(ActionEvent actionEvent) {
        seatIDs.add("S56");
        btnS56.setDisable(true);
        btnS56.setStyle("-fx-background-color: red");

    }

    public void btnS57OnAction(ActionEvent actionEvent) {
        seatIDs.add("S56");
        btnS57.setDisable(true);
        btnS57.setStyle("-fx-background-color: red");

    }

    public void btnS58OnAction(ActionEvent actionEvent) {
        btnS58.setDisable(true);
        btnS58.setStyle("-fx-background-color: red");

    }

    public void btnS61OnAction(ActionEvent actionEvent) {
        seatIDs.add("S61");
        btnS61.setDisable(true);
        btnS61.setStyle("-fx-background-color: red");

    }

    public void btnS62OnAction(ActionEvent actionEvent) {
        seatIDs.add("S62");
        btnS62.setDisable(true);
        btnS62.setStyle("-fx-background-color: red");

    }

    public void btnS63OnAction(ActionEvent actionEvent) {
        seatIDs.add("S62");
        btnS63.setDisable(true);
        btnS63.setStyle("-fx-background-color: red");

    }

    public void btnS64OnAction(ActionEvent actionEvent) {
        seatIDs.add("S64");
        btnS64.setDisable(true);
        btnS64.setStyle("-fx-background-color: red");

    }

    public void btnS65OnAction(ActionEvent actionEvent) {
        seatIDs.add("S65");
        btnS65.setDisable(true);
        btnS65.setStyle("-fx-background-color: red");

    }

    public void btnS66OnAction(ActionEvent actionEvent) {
        seatIDs.add("S66");
        btnS66.setDisable(true);
        btnS66.setStyle("-fx-background-color: red");

    }

    public void btnS67OnAction(ActionEvent actionEvent) {
        seatIDs.add("S67");
        btnS67.setDisable(true);
        btnS67.setStyle("-fx-background-color: red");

    }

    public void btnS68OnAction(ActionEvent actionEvent) {
        seatIDs.add("S68");
        btnS68.setDisable(true);
        btnS68.setStyle("-fx-background-color: red");

    }

    public void btnS69OnAction(ActionEvent actionEvent) {
        seatIDs.add("S69");
        btnS69.setDisable(true);
        btnS69.setStyle("-fx-background-color: red");

    }

    public void btnS70OnAction(ActionEvent actionEvent) {
        seatIDs.add("S70");
        btnS70.setDisable(true);
        btnS70.setStyle("-fx-background-color: red");

    }

    public void btnS6OnActon(ActionEvent actionEvent) {
        seatIDs.add("S6");
        btnS6.setDisable(true);
        btnS6.setStyle("-fx-background-color: red");

    }

    public void btnS18OnAction(ActionEvent actionEvent) {
        seatIDs.add("S18");
        btnS18.setDisable(true);
        btnS18.setStyle("-fx-background-color: red");

    }

    public void btnS7OnAction(ActionEvent actionEvent) {
        seatIDs.add("S7");
        btnS7.setDisable(true);
        btnS7.setStyle("-fx-background-color: red");

    }

    public void btnS19OnAtion(ActionEvent actionEvent) {
        seatIDs.add("S19");
        btnS19.setDisable(true);
        btnS19.setStyle("-fx-background-color: red");

    }

    public void btnS35OnAction(ActionEvent actionEvent) {
        seatIDs.add("S35");
        btnS35.setDisable(true);
        btnS35.setStyle("-fx-background-color: red");

    }

    public void btnS36OnAction(ActionEvent actionEvent) {
        seatIDs.add("S36");
        btnS36.setDisable(true);
        btnS36.setStyle("-fx-background-color: red");

    }

    public void btnS43OnAction(ActionEvent actionEvent) {
        seatIDs.add("S43");
        btnS43.setDisable(true);
        btnS43.setStyle("-fx-background-color: red");

    }

    public void btnS48OnAction(ActionEvent actionEvent) {
        seatIDs.add("S48");
        btnS48.setDisable(true);
        btnS48.setStyle("-fx-background-color: red");

    }

    public void btnS59OnAction(ActionEvent actionEvent) {
        seatIDs.add("S59");
        btnS59.setDisable(true);
        btnS59.setStyle("-fx-background-color: red");

    }

    public void btnS60OnAction(ActionEvent actionEvent) {
        seatIDs.add("S60");
        btnS60.setDisable(true);
        btnS60.setStyle("-fx-background-color: red");

    }

    public void btnS71OnAction(ActionEvent actionEvent) {
        seatIDs.add("S71");
        btnS71.setDisable(true);
        btnS71.setStyle("-fx-background-color: red");

    }

    public void btnS72OnAction(ActionEvent actionEvent) {
        seatIDs.add("S72");
        btnS72.setDisable(true);
        btnS72.setStyle("-fx-background-color: red");

    }

    public void btnOkOnAction(ActionEvent actionEvent) throws IOException {
        Stage window=(Stage) this.root.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(this.getClass().getResource("/view/ticket.fxml"))));
        window.centerOnScreen();
    }

    public void btnS9OnAction(ActionEvent actionEvent) {
        btnS72.setDisable(true);
        btnS72.setStyle("-fx-background-color: red");

    }

    public void purchaseTIckets(MouseEvent mouseEvent) {
        loadAvailableSeats();

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        loadMovieID();
        loadDate();
        //loadAvailableSeats();
        loadCusID();


        System.out.println(movieid);
    }

    private void loadMovieID() {
        txtMovieID.setText("m001");
    }

    private void loadAvailableSeats() {
        try {
            TicketDTO ticketDTO = new TicketDTO(txtDate.getText(),txtMovieID.getText(),cmbTimeSet.getValue());

            ObservableList<String> bookedSeats =ticketBO.getBookedSeats(ticketDTO) ;
            for(String s : bookedSeats){
                System.out.println(s);
            }
            System.out.println("hi");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void loadDate() {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YYYY-MM-dd");
        String datetxt = simpleDateFormat.format(date);
        txtDate.setText(datetxt);
    }



    private void loadCusID() {
        try {
            txtCusID.setText(customerBO.getCustomerID());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void cmbOnAction(ActionEvent actionEvent) {
    }

    public void loadCombo() throws SQLException, ClassNotFoundException {

       ObservableList<MovieShowDTO> load=movieShowBO.loadTime();
        for (MovieShowDTO movieShowDTO:load) {
            cmbTimeSet.getItems().add(movieShowDTO.getMovietime());
        }
    }
}
