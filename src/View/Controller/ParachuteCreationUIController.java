package View.Controller;

import Facade.EquipmentFacade;
import View.Main.Main;
import javafx.event.ActionEvent;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

/**
 * @author Hugo Niort
 */
public class ParachuteCreationUIController {
    public DatePicker packageDateInput;
    public DatePicker renewalDateInput;
    public TextField wordingInput;
    EquipmentFacade equipmentFacade;
    public Label errorLabel;

    public ParachuteCreationUIController() {this.equipmentFacade = new EquipmentFacade();}

    public void createParachute(ActionEvent actionEvent) {
        if(wordingInput.getText().equals("") || renewalDateInput.getValue() == null || packageDateInput.getValue() == null) {
            errorLabel.setText("Input Error");
        } else {
            equipmentFacade.createParachute(
                    wordingInput.getText(),
                    java.sql.Date.valueOf(renewalDateInput.getValue()),
                    java.sql.Date.valueOf(packageDateInput.getValue())
            );
            try {
                Main.parachutesView(Main.getPrimaryStage());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void back(ActionEvent actionEvent) {
        try {
            Main.parachutesView(Main.getPrimaryStage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
