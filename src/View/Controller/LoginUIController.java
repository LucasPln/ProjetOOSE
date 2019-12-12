package View.Controller;

import Facade.LoginFacade;
import Model.User;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginUIController {

    @FXML
    private TextField loginField ;

    @FXML
    private TextField passwordField ;

    private LoginFacade loginFacade;

    public LoginUIController(){
        this.loginFacade = new LoginFacade();
    }

    @FXML
    private void login(ActionEvent event) {

        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();


        boolean estConnecte = this.loginFacade.login(this.loginField.getText(), this.passwordField.getText());
        System.out.println(estConnecte);




    }
}
