package View.Controller;

import Facade.CompanyFacade;
import Facade.LoginFacade;
import Model.Company;
import Model.Glider;
import View.Main.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.io.IOException;
import java.util.ArrayList;

public class CompanyUIController {

        @FXML
        private Label nomCompany;
        @FXML
        private Button returnBtn;

        public CompanyUIController(){
                companyFacade = new CompanyFacade();}
        private CompanyFacade companyFacade;

        @FXML
        public void initialize() {
                int id = LoginFacade.getInstance().getConnectedUser().getCompanyId();
                Company c =companyFacade.getInfos(id);
                System.out.println(id);
                ArrayList<Glider> GliderList = companyFacade.getAllGlidersCompany(id);
                System.out.println(GliderList);

                nomCompany.setText(c.getName());
        }
        public void ReturnView(ActionEvent actionEvent) {
                try {
                        Main.homeView(Main.getPrimaryStage());
                } catch (IOException e) {
                        e.printStackTrace();
                }
        }
    }

