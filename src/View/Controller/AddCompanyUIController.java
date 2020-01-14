package View.Controller;

import Facade.CompanyFacade;
import Facade.LoginFacade;
import Model.Booking;
import Model.Company;
import Model.Equipment;
import Model.Glider;
import View.Main.Main;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.io.IOException;
import java.util.ArrayList;

public class AddCompanyUIController {

    @FXML
    private TextField nomCompany;

    @FXML
    private Button addCompany;

    @FXML
    private Button ReturnBtn;
        /**
         * The CompanyFacade.
         */
        private CompanyFacade companyFacade;

        /**
         * Controller that instantiates the CompanyFacade.
         */
        public AddCompanyUIController(){
            companyFacade = new CompanyFacade();
        }

        /**
         * Initializes the elements from the UI.
         */
        @FXML
        public void initialize() {}
    public void createCompany() {
        String nCompany = nomCompany.getText();
        Company newCompany = new Company(nCompany);

        boolean result = this.companyFacade.createCompany(newCompany);

        if (result) {
            try {
                Main.bookingView(Main.getPrimaryStage());
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("ERROR");
            alert.setHeaderText("ERREUR");
            alert.setContentText("Company non créé");
            alert.showAndWait();
        }
    }
    /**
         * Switch the UI to the Home view.
         *
         * @param actionEvent the action event
         */
        public void ReturnView(ActionEvent actionEvent) {
            try {
                Main.homeView(Main.getPrimaryStage());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
}
