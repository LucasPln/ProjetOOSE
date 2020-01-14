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

/**
 * The type Company ui controller.
 *
 * @author Arnaud Maësboyer
 */
public class CompanyUIController {

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
    public CompanyUIController(){
        companyFacade = new CompanyFacade();
    }

    /**
     * Initializes the elements from the UI.
     */
    @FXML
    public void initialize() {
        int id = LoginFacade.getInstance().getConnectedUser().getCompanyId();
        Company c =companyFacade.getInfos(id);
        nomCompany.setText(c.getName());

        ArrayList<Glider> GliderList = companyFacade.getAllGlidersCompany(id);
        ObservableList<String> gliders =FXCollections.observableArrayList();
        for(int i = 0 ; i < GliderList.size(); i++) {
            String planeur = GliderList.get(i).getRegistrationGlider()+"  "+ GliderList.get(i).getSpan()+"  "+ GliderList.get(i).getMaxWeight()+"  "+GliderList.get(i).getAcquisitionDate()+"  "+GliderList.get(i).getReviewDate();
            gliders.add(planeur);
        }
        listGlider.setItems(gliders);

        ArrayList<Equipment> ParachutesList = companyFacade.getAllParachutesCompany(id);
        ObservableList<String> parachutes =FXCollections.observableArrayList();
        for(int i = 0 ; i < ParachutesList.size(); i++) {
            String p = ParachutesList.get(i).getIdEquipement()+"  "+ParachutesList.get(i).getWording();
            parachutes.add(p);
        }
        listParachutes.setItems(parachutes);

        ArrayList<Equipment> GPSList = companyFacade.getAllGPSCompany(id);
        ObservableList<String> GPS =FXCollections.observableArrayList();
        for(int i = 0 ; i < GPSList.size(); i++) {
            String p = GPSList.get(i).getIdEquipement()+"  "+GPSList.get(i).getWording();
            GPS.add(p);
        }
        listGPS.setItems(GPS);

        ArrayList<Equipment> BatteriesList = companyFacade.getAllBatteriesCompany(id);
        ObservableList<String> Batteries =FXCollections.observableArrayList();
        for(int i = 0 ; i < BatteriesList.size(); i++) {
            String p = BatteriesList.get(i).getIdEquipement()+"  "+BatteriesList.get(i).getWording();
            Batteries.add(p);
        }
        listBatteries.setItems(Batteries);

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

    /**
     * Go glider.
     *
     * @param actionEvent the action event
     */
    public void goGlider(ActionEvent actionEvent) {
        try {
            Main.glidersView(Main.getPrimaryStage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Go equipement.
     *
     * @param actionEvent the action event
     */
    public void goEquipement(ActionEvent actionEvent) {
        try {
            Main.EquipmentsView(Main.getPrimaryStage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

