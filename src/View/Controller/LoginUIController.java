package View.Controller;

import Facade.LoginFacade;
import View.Main.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.io.IOException;

/**
 * The type Login ui controller.
 */
public class LoginUIController {

    @FXML
    private TextField loginField ;

    @FXML
    private TextField passwordField ;

    @FXML
    private ChoiceBox choiceBox ;

    private LoginFacade loginFacade;

    /**
     * Instantiates a new Login ui controller.
     */
    public LoginUIController(){
        this.loginFacade = LoginFacade.getInstance();
    }

    @FXML
    private void login(ActionEvent event) {

        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        boolean estConnecte = this.loginFacade.login(this.loginField.getText(), this.passwordField.getText(),this.choiceBox.getValue().toString());
        System.out.println(estConnecte);

        if(estConnecte){
            try {
                Main.homeView(Main.getPrimaryStage());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }else {
            Alert alert = new Alert(Alert.AlertType.ERROR);

            alert.setTitle("Error alert");
            alert.setHeaderText("Can not connect");
            alert.setContentText("Try again !");

            alert.showAndWait();
        }
    }
}
