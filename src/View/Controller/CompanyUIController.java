package View.Controller;

import Facade.CompanyFacade;
import Facade.LoginFacade;
import Model.Company;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class CompanyUIController {

        @FXML
        private Label nomCompany;

        public CompanyUIController(){
                companyFacade = new CompanyFacade();}
        private CompanyFacade companyFacade;

        @FXML
        public void initialize() {
                int id = LoginFacade.getInstance().getConnectedUser().getCompanyId();
                System.out.println(id);
                Company c =companyFacade.getInfos(id);
                System.out.println(c);
                nomCompany.setText(c.getName());
        }
    }

