package View.Controller;

import Facade.LoginFacade;
import Facade.UpdateUserFacade;
import Model.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.time.LocalDate;

public class UpdateUserUIController {
    @FXML
    private TextField firstnameField;
    @FXML
    private TextField lastnameField;
    @FXML
    private TextField phoneNumberField;
    @FXML
    private TextField emailField;

    @FXML
    private TextField adressField;
    @FXML
    private TextField countryField;
    @FXML
    private TextField postalCodeField;

    @FXML
    private DatePicker dateField;


    @FXML
    private TextField positionField;
    @FXML
    private Label positionLabel;

    @FXML
    private TextField companyField;
    @FXML
    private Label companyLabel;
    @FXML
    private TextField flightHourField;
    @FXML
    private Label flightHourLabel;
    @FXML
    private DatePicker adminDateField;
    @FXML
    private Label adminDateLabel;

    private UpdateUserFacade updateUserFacade;

    public UpdateUserUIController(){updateUserFacade = new UpdateUserFacade();}

    @FXML
    public void initialize() {
        User user = LoginFacade.getInstance().getConnectedUser();
        AbstractRole r = user.getAbstractRole();
        firstnameField.setText(user.getFirstName());
        lastnameField.setText(user.getLastName());
        phoneNumberField.setText(user.getTel());
        emailField.setText(user.getMail());
        adressField.setText(user.getAdress());
        postalCodeField.setText(user.getPostalCode());
        dateField.setValue(LocalDate.parse(user.getBirthDate()));

        if (r instanceof Admin){
            positionLabel.setVisible(false);
            companyLabel.setVisible(false);
            flightHourLabel.setVisible(false);
            adminDateLabel.setVisible(true);
            positionField.setVisible(false);
            companyField.setVisible(false);
            flightHourField.setVisible(false);
            adminDateField.setValue(LocalDate.parse(((Admin) r).getAdminDate()));
            adminDateField.setVisible(true);

        }else if (r instanceof CompanyMember){
            positionLabel.setVisible(true);
            companyLabel.setVisible(true);
            flightHourLabel.setVisible(false);
            adminDateLabel.setVisible(false);
            flightHourField.setVisible(false);
            adminDateField.setVisible(false);
            companyField.setText(String.valueOf(((CompanyMember) r).getIdCompany()));
            positionField.setText(String.valueOf(((CompanyMember) r).getPosition()));
            companyField.setVisible(true);
            positionField.setVisible(true);

        }else if (r instanceof Monitor){
            positionLabel.setVisible(false);
            companyLabel.setVisible(true);
            flightHourLabel.setVisible(true);
            adminDateLabel.setVisible(false);
            positionField.setVisible(false);
            adminDateField.setVisible(false);
            companyField.setText(String.valueOf(((Monitor) r).getIdCompany()));
            flightHourField.setText(String.valueOf(((Monitor) r).getMonitorFlightHour()));
            companyField.setVisible(true);
            flightHourField.setVisible(true);

        }else if (r instanceof Licensed){
            positionLabel.setVisible(false);
            companyLabel.setVisible(false);
            flightHourLabel.setVisible(true);
            adminDateLabel.setVisible(false);
            positionField.setVisible(false);
            adminDateField.setVisible(false);
            companyField.setVisible(false);
            flightHourField.setText(String.valueOf(((Licensed) r).getFlightHour()));
            flightHourField.setVisible(true);
        }

    }
    public void updateUser(ActionEvent actionEvent) {
        User user = LoginFacade.getInstance().getConnectedUser();
        AbstractRole r = user.getAbstractRole();

        if (!firstnameField.getText().equals("") && !lastnameField.getText().equals("") && !phoneNumberField.getText().equals("") &&
                !emailField.getText().equals("") && !adressField.getText().equals("") &&
                !postalCodeField.getText().equals("") && (dateField.getValue() != null) && ( (adminDateField.getValue() != null) || (!companyField.getText().equals("") && !positionField.getText().equals("")) || (!companyField.getText().equals("") && !flightHourField.getText().equals("")) || !flightHourField.getText().equals(""))){
            boolean res = this.updateUserFacade.updateUser(user.getId(),firstnameField.getText(),lastnameField.getText(),phoneNumberField.getText(),emailField.getText(),adressField.getText(),postalCodeField.getText(),dateField.getValue().toString());
            boolean res2 = false;
            if (r instanceof Admin){
                    res2 = this.updateUserFacade.updateAdmin(user.getId(),adminDateField.getValue().toString());
            }else if (r instanceof CompanyMember){
                    res2 = this.updateUserFacade.updateCompanyMember(user.getId(),companyField.getText(),positionField.getText());
            }else if (r instanceof Monitor){
                    res2 = this.updateUserFacade.updateMonitor(user.getId(),companyField.getText(),flightHourField.getText());
            }else if (r instanceof Licensed){
                    res2 = this.updateUserFacade.updateLicensed(user.getId(),flightHourField.getText());
            }

            if (res && res2){
                Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
                alert.setTitle("CONFIRMATION");
                alert.setHeaderText("User Modifié");
                alert.setContentText("Le User est bien modifié !");
                alert.showAndWait();
            }else{
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("ERROR");
                alert.setHeaderText("Le User n'est pas modifié !");
                alert.setContentText("ré-essayez");
                alert.showAndWait();
            }
        }else {
            remplirChamps();
        }
    }

    public void remplirChamps(){ Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("ERROR");
        alert.setHeaderText("champ invalide");
        alert.setContentText("remplir tous les champs");
        alert.showAndWait();
    }
}
