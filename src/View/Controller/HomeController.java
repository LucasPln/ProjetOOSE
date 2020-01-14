package View.Controller;

import Facade.GliderFacade;
import Facade.LoginFacade;
import Model.*;
import View.Main.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

import java.io.IOException;

/**
 * The type Home controller.
 */
public class HomeController {

    /**
     * The GridPane buttons.
     */
    public GridPane gridButtons;

    @FXML
    private Label labelUser;

    private LoginFacade loginFacade;

    /**
     * Initialize.
     */
    @FXML
    public void initialize(){
        User u = LoginFacade.getInstance().getConnectedUser();
        AbstractRole a = u.getAbstractRole();
        labelUser.setText("Welcome "+ u.getFirstName()+" !");

        Button logoutBtn = new Button();
        logoutBtn.setText("Log out");
        logoutBtn.setOnAction(e->logout(e));
        gridButtons.add(logoutBtn, 0, 0);
        GridPane.setHalignment(logoutBtn, javafx.geometry.HPos.CENTER);

        Button myProfileBtn = new Button();
        myProfileBtn.setText("My Profile");
        myProfileBtn.setOnAction(e->getMyProfile(e));
        gridButtons.add(myProfileBtn, 0, 1);
        GridPane.setHalignment(myProfileBtn, javafx.geometry.HPos.CENTER);

        if(a instanceof Admin){
            Button companiesBtn = new Button();
            companiesBtn.setText("Companies");
            companiesBtn.setOnAction(e->getCompanies(e));
            gridButtons.add(companiesBtn, 0, 2);
            GridPane.setHalignment(companiesBtn, javafx.geometry.HPos.CENTER);

            Button usersBtn = new Button();
            usersBtn.setText("Users");
            usersBtn.setOnAction(e->getUsers(e));
            GridPane.setHalignment(usersBtn, javafx.geometry.HPos.CENTER);
            gridButtons.add(usersBtn, 0, 3);

        }else if(a instanceof CompanyMember){
            Button equipmentsButton = new Button();
            equipmentsButton.setText("Equipments");
            equipmentsButton.setOnAction(e->getEquipments(e));
            gridButtons.add(equipmentsButton, 0, 2);
            GridPane.setHalignment(equipmentsButton, javafx.geometry.HPos.CENTER);

            Button launchersButton = new Button();
            launchersButton.setText("Launchers");
            launchersButton.setOnAction(e->getLaunchers(e));
            gridButtons.add(launchersButton, 0, 3);
            GridPane.setHalignment(launchersButton, javafx.geometry.HPos.CENTER);

            Button glidersBtn = new Button();
            glidersBtn.setText("Gliders");
            glidersBtn.setOnAction(e->getGliders(e));
            gridButtons.add(glidersBtn, 0, 4);
            GridPane.setHalignment(glidersBtn, javafx.geometry.HPos.CENTER);

            Button myCompanyBtn = new Button();
            myCompanyBtn.setText("My Company");
            myCompanyBtn.setOnAction(e->getCompany(e));
            gridButtons.add(myCompanyBtn, 0, 5);
            GridPane.setHalignment(myCompanyBtn, javafx.geometry.HPos.CENTER);

        }else if(a instanceof Monitor){
            Button equipmentsButton = new Button();
            equipmentsButton.setText("Equipments");
            equipmentsButton.setOnAction(e->getEquipments(e));
            gridButtons.add(equipmentsButton, 0, 2);
            GridPane.setHalignment(equipmentsButton, javafx.geometry.HPos.CENTER);

            Button launchersButton = new Button();
            launchersButton.setText("Launchers");
            launchersButton.setOnAction(e->getLaunchers(e));
            gridButtons.add(launchersButton, 0, 3);
            GridPane.setHalignment(launchersButton, javafx.geometry.HPos.CENTER);

            Button glidersBtn = new Button();
            glidersBtn.setText("Gliders");
            glidersBtn.setOnAction(e->getGliders(e));
            gridButtons.add(glidersBtn, 0, 4);
            GridPane.setHalignment(glidersBtn, javafx.geometry.HPos.CENTER);

            Button myCompanyBtn = new Button();
            myCompanyBtn.setText("My Company");
            myCompanyBtn.setOnAction(e->getCompany(e));
            gridButtons.add(myCompanyBtn, 0, 5);
            GridPane.setHalignment(myCompanyBtn, javafx.geometry.HPos.CENTER);

        }else { // Licensed
            Button viewBookingButton = new Button();
            viewBookingButton.setText("Bookings");
            viewBookingButton.setOnAction(e->getBooking(e));
            gridButtons.add(viewBookingButton, 0, 2);
            GridPane.setHalignment(viewBookingButton, javafx.geometry.HPos.CENTER);
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
