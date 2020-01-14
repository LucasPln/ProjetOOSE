package View.Controller;

import Facade.EquipmentFacade;
import View.Main.Main;
import javafx.event.ActionEvent;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

/**
 * The type Battery creation ui controller.
 *
 * @author Hugo Niort
 */
public class BatteryCreationUIController {
    /**
     * The Error label.
     */
    public Label errorLabel;
    /**
     * The Wording input.
     */
    public TextField wordingInput;
    /**
     * The Refill date input.
     */
    public DatePicker refillDateInput;
    /**
     * The Power input.
     */
    public TextField powerInput;
    private EquipmentFacade equipmentFacade;

    /**
     * Instantiates a new Battery creation ui controller.
     */
    public BatteryCreationUIController() {equipmentFacade = new EquipmentFacade();}

    /**
     * Back.
     *
     * @param actionEvent the action event
     */
    public void back(ActionEvent actionEvent) {
        try {
            Main.batteriesView(Main.getPrimaryStage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Create battery.
     *
     * @param actionEvent the action event
     */
    public void createBattery(ActionEvent actionEvent) {
        if(wordingInput.getText().equals("") || refillDateInput.getValue() == null || powerInput.getText().equals("")) {
            errorLabel.setText("Input Error");
        } else {
            equipmentFacade.createBattery(
                    wordingInput.getText(),
                    Integer.parseInt(powerInput.getText()),
                    java.sql.Date.valueOf(refillDateInput.getValue())
            );
            try {
                Main.batteriesView(Main.getPrimaryStage());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
