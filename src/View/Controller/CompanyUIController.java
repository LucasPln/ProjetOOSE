package View.Controller;

import Facade.CompanyFacade;
import Facade.LoginFacade;
import Model.Company;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class CompanyUIController {

        @FXML
        private Label nomCompany;
        @FXML
        private Label labelBirthDate;
        @FXML
        private Label labelAdress;
        @FXML
        private Label labelPostalCode;
        @FXML
        private Label labelMail;
        @FXML
        private Label labelTel;

        public CompanyUIController(){
                companyFacade = new CompanyFacade();}
        private CompanyFacade companyFacade;

        @FXML
        public void initialize() {
                Company companyC = AffichageCompany();
                //System.out.println(CompanyC.getNom());

            nomCompany.setText("Welcome ");
        }

        public Company AffichageCompany(){
                //int id =LoginFacade.getInstance().getConnectedUser().getIdCompany();
                //Company CompanyC =companyFacade.getInfos(id);
                //return CompanyC;
                return null;
        };
    }

