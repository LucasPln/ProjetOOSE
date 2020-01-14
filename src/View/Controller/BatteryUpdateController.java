package View.Controller;

import Facade.EquipmentFacade;
import Model.Battery;
import View.Main.Main;
import javafx.event.ActionEvent;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.sql.Date;

/**
 * The type Battery update controller.
 *
 * @author Hugo Niort
 */
public class BatteryUpdateController {
    /**
     * The Power input.
     */
    public TextField powerInput;
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
    private EquipmentFacade equipmentFacade;
    private int idEquipment;

    /**
     * Instantiates a new Battery update controller.
     */
    public BatteryUpdateController() {this.equipmentFacade = new EquipmentFacade();}

    /**
     * Sets infos.
     *
     * @param idEquipment the id equipment
     */
    public void setInfos(int idEquipment) {
        this.idEquipment = idEquipment;

        Battery b = equipmentFacade.getBattery(idEquipment);

        wordingInput.setText(b.getWording());
        refillDateInput.setValue(((Date)b.getLastRefillDate()).toLocalDate());
        powerInput.setText(Integer.toString(b.getPower()));
    }

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
     * Update battery.
     *
     * @param actionEvent the action event
     */
    public void updateBattery(ActionEvent actionEvent) {
        if(wordingInput.getText().equals("") || refillDateInput.getValue() == null || powerInput.getText().equals("")) {
            errorLabel.setText("Input Error");
        } else {
            equipmentFacade.updateBattery(
                    idEquipment,
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
