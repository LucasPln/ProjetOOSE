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
    private Button companiesBtn;
    @FXML
    private Button viewBookingButton;

    private LoginFacade loginFacade;
    /**
     * The launchers btn.
     */
    public Button launchersButton;

    /**
     * Initialize.
     */
    @FXML
    public void initialize(){
        User u = LoginFacade.getInstance().getConnectedUser();
        AbstractRole a = u.getAbstractRole();
        labelUser.setText("Welcome "+ u.getFirstName()+" !");

        if(a instanceof Admin){
            myCompanyBtn.setVisible(false);
            glidersBtn.setVisible(false);
            companiesBtn.setVisible(true);
            viewBookingButton.setVisible(false);
            equipmentsButton.setVisible(false);
            launchersButton.setVisible(false);
        }else if(a instanceof CompanyMember){
            glidersBtn.setVisible(true);
            myCompanyBtn.setVisible(true);
            viewBookingButton.setVisible(false);
            companiesBtn.setVisible(false);

        }else if(a instanceof Monitor){
            myCompanyBtn.setVisible(true);
            glidersBtn.setVisible(true);
            viewBookingButton.setVisible(true);
            companiesBtn.setVisible(false);

        }else { // Licensed
            myCompanyBtn.setVisible(false);
            glidersBtn.setVisible(false);
            viewBookingButton.setVisible(true);
            companiesBtn.setVisible(false);
            launchersButton.setVisible(false);

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


    /**
     * Gets companies.
     *
     * @param actionEvent the action event
     */
    public void getCompanies(ActionEvent actionEvent) {
        try {
            Main.listCompanyView(Main.getPrimaryStage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
