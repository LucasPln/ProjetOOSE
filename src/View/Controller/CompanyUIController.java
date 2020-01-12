package View.Controller;

import Facade.CompanyFacade;
import Facade.LoginFacade;
import Model.Company;
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

public class CompanyUIController {

        @FXML
        private Label nomCompany;
        @FXML
        private Button returnBtn;
        @FXML
        private ListView listGlider;

        public CompanyUIController(){
                companyFacade = new CompanyFacade();}
        private CompanyFacade companyFacade;

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

        }
        public void ReturnView(ActionEvent actionEvent) {
                try {
                        Main.homeView(Main.getPrimaryStage());
                } catch (IOException e) {
                        e.printStackTrace();
                }
        }
    }

