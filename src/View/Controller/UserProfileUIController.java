package View.Controller;


import Facade.CompanyFacade;
import Facade.LoginFacade;
import Model.*;
import View.Main.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import javafx.scene.control.Label;

import java.io.IOException;


public class UserProfileUIController {
    @FXML
    private Label labelUser;
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
    @FXML
    private Label labelPosition;
    @FXML
    private Label labelCompany;
    @FXML
    private Label labelFlightHour;
    @FXML
    private Label labelAdminDate;

    public UserProfileUIController(){}

    @FXML
    public void initialize() {
        User user = LoginFacade.getInstance().getConnectedUser();
        CompanyFacade cf = new CompanyFacade();

        labelUser.setText("Welcome "+user.getLastName()+" "+user.getFirstName());
        labelBirthDate.setText("Birth Date : "+user.getBirthDate());
        labelAdress.setText("Adress : "+user.getAdress());
        labelPostalCode.setText("Postal Code : "+user.getPostalCode());
        labelMail.setText("Mail : "+user.getMail());
        labelTel.setText("Tel : "+user.getTel());

        AbstractRole r = user.getAbstractRole();
        Company c = cf.getInfos(user.getCompanyId());
        if (r instanceof Admin){
            labelPosition.setVisible(false);
            labelFlightHour.setVisible(false);
            labelCompany.setVisible(false);
            labelAdminDate.setText("Admin Date : "+((Admin) r).getAdminDate());
            labelAdminDate.setVisible(true);

        }else if (r instanceof CompanyMember){
            labelFlightHour.setVisible(false);
            labelAdminDate.setVisible(false);
            labelCompany.setText("id company " +c.getName());
            labelPosition.setText("Position : "+((CompanyMember) r).getPosition());
            labelCompany.setVisible(true);
            labelPosition.setVisible(true);

        }else if (r instanceof Monitor){
            labelPosition.setVisible(false);
            labelAdminDate.setVisible(false);
            labelCompany.setText("id company " +((Monitor) r).getIdCompany());
            labelFlightHour.setText("flight Hour" +((Monitor) r).getMonitorFlightHour());
            labelCompany.setVisible(true);
            labelFlightHour.setVisible(true);

        }else if (r instanceof Licensed){
            labelPosition.setVisible(false);
            labelAdminDate.setVisible(false);
            labelCompany.setVisible(false);
            labelFlightHour.setText("flight Hour" +((Licensed) r).getFlightHour());
            labelFlightHour.setVisible(true);
        }

    }
    public void modifyMyProfile(ActionEvent actionEvent) {
        try {
            Main.updateUserView(Main.getPrimaryStage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
