package View.Controller;

import Facade.LauncherFacade;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class LaunchersUIController {
    public LauncherFacade launcherFacade;
    public Label winches;
    public Label planes;

    public LaunchersUIController() {
        this.launcherFacade = new LauncherFacade();
    }

    @FXML
    public void initialize(){
        winches.setText(launcherFacade.getNbLaunchers("winch") + " Winches");
        planes.setText(launcherFacade.getNbLaunchers("plane") + " Planes");
    }

    public void seeWinches(ActionEvent actionEvent) {
    }

    public void seePlanes(ActionEvent actionEvent) {
    }
}
