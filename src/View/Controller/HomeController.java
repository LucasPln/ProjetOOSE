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

/**
 * The type Home controller.
 */
public class HomeController {

    /**
     * The Gliders btn.
     */
    public Button glidersBtn;
    /**
     * The My profile btn.
     */
    @FXML
    public Button myProfileBtn;
    /**
     * The Logout btn.
     */
    @FXML
    public Button logoutBtn;
    /**
     * The My company btn.
     */
    @FXML
    public Button myCompanyBtn;
    /**
     * The Equipments button.
     */
    public Button equipmentsButton;
    @FXML
    private Label labelUser;

    @FXML
    private Button usersBtn;
    @FXML
    private Button viewBookingButton;

    /**
     * The Add user button.
     */
    @FXML
    public Button addUserButton;

    private LoginFacade loginFacade;

    /**
     * Initialize.
     */
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


    /**
     * Instantiates a new Home controller.
     */
    public HomeController() {
        this.loginFacade = LoginFacade.getInstance();
    }

    /**
     * Gets gliders.
     *
     * @param actionEvent the action event
     */
    public void getGliders(ActionEvent actionEvent) {
        try {
            Main.glidersView(Main.getPrimaryStage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Gets my profile.
     *
     * @param actionEvent the action event
     */
    public void getMyProfile(ActionEvent actionEvent) {
        try {
            Main.myProfileView(Main.getPrimaryStage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Gets company.
     *
     * @param actionEvent the action event
     */
    public void getCompany(ActionEvent actionEvent) {
        try {
            Main.myCompanyView(Main.getPrimaryStage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Logout.
     *
     * @param actionEvent the action event
     */
    public void logout(ActionEvent actionEvent) {
        try {
            loginFacade.logout();
            Main.logoutView(Main.getPrimaryStage());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    /**
     * Get booking.
     *
     * @param actionEvent the action event
     */
    public void getBooking(ActionEvent actionEvent){
        try {
            Main.bookingView(Main.getPrimaryStage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Add user.
     *
     * @param actionEvent the action event
     */
    public void addUser(ActionEvent actionEvent){
        try {
            Main.addUserView(Main.getPrimaryStage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Gets equipments.
     *
     * @param actionEvent the action event
     */
    public void getEquipments(ActionEvent actionEvent) {
        try {
            Main.EquipmentsView(Main.getPrimaryStage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Gets users.
     *
     * @param actionEvent the action event
     */
    public void getUsers(ActionEvent actionEvent) {
        try {
            Main.usersView(Main.getPrimaryStage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Gets launchers.
     *
     * @param actionEvent the action event
     */
    public void getLaunchers(ActionEvent actionEvent) {
        try {
            Main.LaunchersView(Main.getPrimaryStage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
