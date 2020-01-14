package View.Controller;

import Facade.EquipmentFacade;
import View.Main.Main;
import javafx.event.ActionEvent;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

/**
 * The type Parachute creation ui controller.
 *
 * @author Hugo Niort
 */
public class ParachuteCreationUIController {
    /**
     * The Package date input.
     */
    public DatePicker packageDateInput;
    /**
     * The Renewal date input.
     */
    public DatePicker renewalDateInput;
    /**
     * The Wording input.
     */
    public TextField wordingInput;
    /**
     * The Equipment facade.
     */
    EquipmentFacade equipmentFacade;
    /**
     * The Error label.
     */
    public Label errorLabel;

    /**
     * Instantiates a new Parachute creation ui controller.
     */
    public ParachuteCreationUIController() {this.equipmentFacade = new EquipmentFacade();}

    /**
     * Create parachute.
     *
     * @param actionEvent the action event
     */
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

    /**
     * Back.
     *
     * @param actionEvent the action event
     */
    public void back(ActionEvent actionEvent) {
        try {
            Main.parachutesView(Main.getPrimaryStage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
