package View.Controller;

import Facade.EquipmentFacade;
import View.Main.Main;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

/**
 * The type Gps creation ui controller.
 *
 * @author Hugo Niort
 */
public class GPSCreationUIController {
    /**
     * The Error label.
     */
    public Label errorLabel;
    /**
     * The Wording input.
     */
    public TextField wordingInput;
    /**
     * The Version input.
     */
    public TextField versionInput;
    private EquipmentFacade equipmentFacade;

    /**
     * Instantiates a new Gps creation ui controller.
     */
    public GPSCreationUIController() {this.equipmentFacade = new EquipmentFacade();}

    /**
     * Create gps.
     *
     * @param actionEvent the action event
     */
    public void createGPS(ActionEvent actionEvent) {
        if(wordingInput.getText().equals("") || versionInput.getText().equals("")) {
            errorLabel.setText("Input Error");
        } else {
            equipmentFacade.createGPS(
                    wordingInput.getText(),
                    versionInput.getText()
            );
            try {
                Main.GPSView(Main.getPrimaryStage());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * Back.
     *
     * @param actionEvent the action event
     */
    public void back(ActionEvent actionEvent) {
        try {
            Main.GPSView(Main.getPrimaryStage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
