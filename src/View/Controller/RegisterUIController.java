package View.Controller;

import Facade.LoginFacade;
import Facade.RegisterFacade;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

public class RegisterUIController {

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

    private RegisterFacade registerFacade;

    public RegisterUIController(){this.registerFacade = new RegisterFacade();}

    @FXML
    public void initialize() {}

    @FXML
    private void addUser(ActionEvent event) {
        if (firstnameField.getText() != null){
            System.out.println(firstnameField.getText());
        }
        if (this.registerFacade.addUser()){
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);

            alert.setTitle("CONFIRMATION");
            alert.setHeaderText("User Ajouté");
            alert.setContentText("Le User est bien ajouté !");

            alert.showAndWait();
        }else{
            Alert alert = new Alert(Alert.AlertType.ERROR);

            alert.setTitle("ERROR");
            alert.setHeaderText("Pas ajouté");
            alert.setContentText("Le User n'est pas ajouté !");

            alert.showAndWait();
        }
    }
}
