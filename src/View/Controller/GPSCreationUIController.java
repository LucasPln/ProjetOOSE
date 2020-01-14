package View.Controller;

import Facade.EquipmentFacade;
import View.Main.Main;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class GPSCreationUIController {
    public Label errorLabel;
    public TextField wordingInput;
    public TextField versionInput;
    private EquipmentFacade equipmentFacade;

    public GPSCreationUIController() {this.equipmentFacade = new EquipmentFacade();}

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

    public void back(ActionEvent actionEvent) {
        try {
            Main.GPSView(Main.getPrimaryStage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
