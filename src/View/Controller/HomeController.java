package View.Controller;

import Facade.GliderFacade;
import Facade.LoginFacade;
import Model.*;
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
    public Button equipmentsButton;
    @FXML
    private Label labelUser;

    @FXML
    private Button usersBtn;
    @FXML
    private Button viewBookingButton;

    @FXML
    public Button addUserButton;

    private LoginFacade loginFacade;

    @FXML
    public void initialize(){
        User u = LoginFacade.getInstance().getConnectedUser();
        AbstractRole a = u.getAbstractRole();
        labelUser.setText("Welcome "+ u.getFirstName()+" !");

        if(a instanceof Admin){
            addUserButton.setVisible(true);
            myCompanyBtn.setVisible(false);
            glidersBtn.setVisible(true);
        }else if(a instanceof CompanyMember){
            addUserButton.setVisible(false);
            glidersBtn.setVisible(true);
            myCompanyBtn.setVisible(true);
        }else if(a instanceof Monitor){
            addUserButton.setVisible(false);
            myCompanyBtn.setVisible(true);
            glidersBtn.setVisible(true);
        }else { // Licensed
            addUserButton.setVisible(false);
            myCompanyBtn.setVisible(false);
            glidersBtn.setVisible(false);
        }
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

    public void getEquipments(ActionEvent actionEvent) {
        try {
            Main.EquipmentsView(Main.getPrimaryStage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void getUsers(ActionEvent actionEvent) {
        try {
            Main.usersView(Main.getPrimaryStage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void getLaunchers(ActionEvent actionEvent) {
        try {
            Main.LaunchersView(Main.getPrimaryStage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
