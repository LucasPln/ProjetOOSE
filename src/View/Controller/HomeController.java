package View.Controller;

import DAO.UserDAO;
import Facade.GliderFacade;
import Facade.LoginFacade;
import View.Main.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.io.IOException;

public class HomeController {
    private GliderFacade gliderFacade;
    public Button glidersBtn;
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
        System.out.println(this.gliderFacade.getGlidersFromCompany(1).get(0).getReviewDate());

        try {
            Main.glidersView(Main.getPrimaryStage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
