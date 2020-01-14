package View.Controller;

import Facade.LauncherFacade;
import View.Main.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.io.IOException;
import java.sql.Date;

/**
 * The type Launchers ui controller.
 */
public class LaunchersUIController {
    /**
     * The Launcher facade.
     */
    public LauncherFacade launcherFacade;
    /**
     * The Winches.
     */
    public Label winches;
    /**
     * The Planes.
     */
    public Label planes;

    /**
     * Instantiates a new Launchers ui controller.
     */
    public LaunchersUIController() {
        this.launcherFacade = new LauncherFacade();
    }

    /**
     * Initialize.
     */
    @FXML
    public void initialize(){
        winches.setText(launcherFacade.getNbLaunchers("winch") + " Winches");
        planes.setText(launcherFacade.getNbLaunchers("plane") + " Planes");
    }

    /**
     * See winches.
     *
     * @param actionEvent the action event
     */
    public void seeWinches(ActionEvent actionEvent) {
        System.out.println(launcherFacade.getAll("winch"));
    }

    /**
     * See planes.
     *
     * @param actionEvent the action event
     */
    public void seePlanes(ActionEvent actionEvent) {
        try {
            Main.planesView(Main.getPrimaryStage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Test.
     *
     * @param actionEvent the action event
     */
    public void test(ActionEvent actionEvent) {
        launcherFacade.updatePlane("PP1PP", 999, new Date(100000), new Date(100000), 998, 997);
    }
}
