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
import javafx.scene.layout.GridPane;

import java.io.IOException;
import java.util.ArrayList;

public class ListCompanyUIController {


    @FXML
    private GridPane gridCompany;


    /**
     * The CompanyFacade.
     */
    private CompanyFacade companyFacade;

    /**
     * Controller that instantiates the CompanyFacade.
     */
    public ListCompanyUIController(){
        companyFacade = new CompanyFacade();
    }

    /**
     * Initializes the elements from the UI.
     */
    @FXML
    public void initialize() {
        ArrayList<Company> cpy = this.companyFacade.getAllCompanies();

        for(int i = 0; i < cpy.size(); i++) {
            gridCompany.addRow(0);

            Label l1 = new Label(Integer.toString(cpy.get(i).getIdCompany()));
            gridCompany.add(l1,0, i + 1);
            GridPane.setHalignment(l1, javafx.geometry.HPos.CENTER);

            Label l2 = new Label(cpy.get(i).getName());
            gridCompany.add(l2,1, i + 1);
            GridPane.setHalignment(l2, javafx.geometry.HPos.CENTER);

            Button b1 = new Button("X");
            int j = i;
            b1.setOnAction(event -> {
                deleteCompany(cpy.get(j).getIdCompany());
            });
            gridCompany.add(b1, 2, i + 1);
        }
    }
    public void AddCompany(ActionEvent actionEvent) {
        try {
            Main.addCompanyView(Main.getPrimaryStage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void deleteCompany(int id){
       companyFacade.deleteCompany(id);
        try {
            Main.homeView(Main.getPrimaryStage());
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
