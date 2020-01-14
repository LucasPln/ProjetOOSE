package View.Controller;

import Facade.CompanyFacade;
import Facade.LoginFacade;
import Model.Company;
import Model.Equipment;
import Model.Glider;
import View.Main.Main;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

import java.io.IOException;
import java.util.ArrayList;

public class listCompanyUIController {
    /**
     * Label from the UI, that print the name of the Company.
     */
    @FXML
    private Label nomCompany;

    /**
     * "Return" button grom the UI.
     */
    @FXML
    private Button returnBtn;

    /**
     * ListView from the UI, that print the list of gliders.
     */
    @FXML
    private ListView listGlider;

    @FXML
    private ListView listParachutes;

    @FXML
    private ListView listGPS;

    @FXML
    private ListView listBatteries;


    /**
     * The CompanyFacade.
     */
    private CompanyFacade companyFacade;

    /**
     * Controller that instantiates the CompanyFacade.
     */
    public listCompanyUIController(){
        companyFacade = new CompanyFacade();
    }

    /**
     * Initializes the elements from the UI.
     */
    @FXML
    public void initialize() {
    }
    public void AddCompany(ActionEvent actionEvent) {
        try {
            Main.addCompanyView(Main.getPrimaryStage());
        } catch (IOException e) {
            e.printStackTrace();
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
