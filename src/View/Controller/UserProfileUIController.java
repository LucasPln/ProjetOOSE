package View.Controller;


import Facade.LoginFacade;
import Facade.ReadUserFacade;
import Model.User;
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

    }
}
