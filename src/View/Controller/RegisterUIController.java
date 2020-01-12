package View.Controller;

import Facade.LoginFacade;
import Facade.RegisterFacade;
import View.Main.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

import java.io.IOException;

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
    private TextField postalCodeField;

    @FXML
    private ChoiceBox choiceBox;

    @FXML
    private DatePicker dateField;

    private RegisterFacade registerFacade;

    public RegisterUIController(){this.registerFacade = new RegisterFacade();}

    @FXML
    public void initialize() {}

    @FXML
    private void addUser(ActionEvent event) {

        if ((firstnameField.getText() != null) && (lastnameField.getText() != null) && (phoneNumberField.getText() != null) &&
                (emailField.getText() != null) && (adressField.getText() != null) &&
                (postalCodeField.getText() != null) && (dateField.getValue() != null)){
            boolean res =this.registerFacade.addUser(firstnameField.getText(),lastnameField.getText(),phoneNumberField.getText(),emailField.getText(),adressField.getText(),postalCodeField.getText(),dateField.getValue().toString(),this.choiceBox.getValue().toString());
            if (res){
                Alert alert = new Alert(Alert.AlertType.CONFIRMATION);

                alert.setTitle("CONFIRMATION");
                alert.setHeaderText("User Ajouté");
                alert.setContentText("Le User est bien ajouté !");

                alert.showAndWait();
            }else{
                Alert alert = new Alert(Alert.AlertType.ERROR);

                alert.setTitle("ERROR");
                alert.setHeaderText("Le User n'est pas ajouté !");
                alert.setContentText("ré-essayez");

                alert.showAndWait();
            }
        }else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("ERROR");
            alert.setHeaderText("champ invalide");
            alert.setContentText("remplir tous les champs");
            alert.showAndWait();
        }

    }
}
