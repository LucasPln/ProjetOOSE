package View.Controller;

import Facade.LoginFacade;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HomeController {

    @FXML
    private Label labelUser;

    @FXML
    public void initialize(){
        labelUser.setText("Welcome "+ LoginFacade.getInstance().getConnectedUserName()+" !");
    }


}
