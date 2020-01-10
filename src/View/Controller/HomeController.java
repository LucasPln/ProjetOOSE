package View.Controller;

import Facade.GliderFacade;
import Facade.LoginFacade;
import View.Main.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.io.IOException;

public class HomeController {

    public Button glidersBtn;
    @FXML
    public Button myProfileBtn;
    @FXML
    public Button logoutBtn;
    @FXML
    public Button myCompanyBtn;
    @FXML
    private Label labelUser;

    @FXML
    private Button viewBookingButton;

    @FXML
    public Button addUserButton;

    private LoginFacade loginFacade;

    @FXML
    public void initialize(){
        labelUser.setText("Welcome "+ LoginFacade.getInstance().getConnectedUserName()+" !");
    }


    public HomeController() {
        this.loginFacade = LoginFacade.getInstance();
    }

    public void getGliders(ActionEvent actionEvent) {
        try {
            Main.glidersView(Main.getPrimaryStage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void getMyProfile(ActionEvent actionEvent) {
        try {
            Main.myProfileView(Main.getPrimaryStage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void getCompany(ActionEvent actionEvent) {
        try {
            Main.myCompanyView(Main.getPrimaryStage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void logout(ActionEvent actionEvent) {
        try {
            loginFacade.logout();
            Main.logoutView(Main.getPrimaryStage());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void getBooking(ActionEvent actionEvent){
        try {
            Main.bookingView(Main.getPrimaryStage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void addUser(ActionEvent actionEvent){
        try {
            Main.addUserView(Main.getPrimaryStage());
        } catch (IOException e) {
            e.printStackTrace();
        }
        //deconnexion ????
        LoginFacade.getInstance().logout();

    }
}
