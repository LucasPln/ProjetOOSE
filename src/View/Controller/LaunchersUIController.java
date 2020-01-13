package View.Controller;

import Facade.LauncherFacade;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.sql.Date;

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
        System.out.println(launcherFacade.getAll("winch"));
    }

    public void seePlanes(ActionEvent actionEvent) {
        System.out.println(launcherFacade.getAll("plane"));
    }

    public void test(ActionEvent actionEvent) {
        launcherFacade.updateWinch("WW2WW", new Date(1), new Date(100000), 1000, new Date(100000), new Date(999999), 2500);
    }
}
