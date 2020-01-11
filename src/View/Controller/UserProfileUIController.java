package View.Controller;


import Facade.LoginFacade;
import Model.*;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

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

        labelUser.setText("Welcome "+user.getLastName()+" "+user.getFirstName());
        labelBirthDate.setText("Birth Date : "+user.getBirthDate());
        labelAdress.setText("Adress : "+user.getAdress());
        labelPostalCode.setText("Postal Code : "+user.getPostalCode());
        labelMail.setText("Mail : "+user.getMail());
        labelTel.setText("Tel : "+user.getTel());

        AbstractRole r = user.getAbstractRole();

        if (r instanceof Admin){
            labelPosition.setVisible(false);
            labelFlightHour.setVisible(false);
            labelAdminDate.setVisible(false);
            labelCompany.setVisible(false);
            labelAdminDate.setText("Admin Date : "+((Admin) r).getAdminDate());
            labelAdminDate.setVisible(true);

        }else if (r instanceof CompanyMember){
            labelAdminDate.setVisible(false);
            labelFlightHour.setVisible(false);
            labelAdminDate.setVisible(false);
            labelCompany.setText("id company " +((CompanyMember) r).getIdCompany());
            labelPosition.setText("Position : "+((CompanyMember) r).getPosition());
            labelCompany.setVisible(true);
            labelPosition.setVisible(true);

        }else if (r instanceof Monitor){
            labelPosition.setVisible(false);
            labelAdminDate.setVisible(false);
            labelAdminDate.setVisible(false);
            labelCompany.setText("id company " +((Monitor) r).getIdCompany());
            labelCompany.setText("flight Hour" +((Monitor) r).getMonitorFlightHour());
            labelCompany.setVisible(true);
            labelFlightHour.setVisible(true);

        }else if (r instanceof Licensed){
            labelPosition.setVisible(false);
            labelAdminDate.setVisible(false);
            labelAdminDate.setVisible(false);
            labelCompany.setVisible(false);
            labelCompany.setText("flight Hour" +((Licensed) r).getFlightHour());
            labelFlightHour.setVisible(true);
        }

    }
}
