package View.Controller;

import Facade.LoginFacade;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HomeController {

    @FXML
    private Label labelUser;

    public HomeController(){
        labelUser.setText("Hello " + LoginFacade.getInstance().getConnectedUserName()+"!");
    }
}
