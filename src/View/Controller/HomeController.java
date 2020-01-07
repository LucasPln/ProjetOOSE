package View.Controller;

import DAO.UserDAO;
import Facade.GliderFacade;
import Facade.LoginFacade;
import Facade.ReadUserFacade;
import View.Main.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.io.IOException;

public class HomeController {
    private GliderFacade gliderFacade;
    @FXML
    public Button glidersBtn;
    @FXML
    public Button myProfileBtn;
    @FXML
    public Button logoutBtn;
    @FXML
    private Label labelUser;
    private LoginFacade loginFacade;

    @FXML
    public void initialize(){
        labelUser.setText("Welcome "+ LoginFacade.getInstance().getConnectedUserName()+" !");
    }

    public HomeController() {
        this.gliderFacade = new GliderFacade();
    }

    public void getGliders(ActionEvent actionEvent) {
        try {
            Main.glidersView(Main.getPrimaryStage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void getMyProfile(ActionEvent actionEvent) {
        try {
            Main.myProfileView(Main.getPrimaryStage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void logout(ActionEvent actionEvent) {
        try {
            //deconnexion ????
            loginFacade.logout();
            Main.logoutView(Main.getPrimaryStage());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
