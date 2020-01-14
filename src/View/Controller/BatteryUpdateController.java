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
 * @author Hugo Niort
 */
public class BatteryUpdateController {
    public TextField powerInput;
    public Label errorLabel;
    public TextField wordingInput;
    public DatePicker refillDateInput;
    private EquipmentFacade equipmentFacade;
    private int idEquipment;

    public BatteryUpdateController() {this.equipmentFacade = new EquipmentFacade();}

    public void setInfos(int idEquipment) {
        this.idEquipment = idEquipment;

        Battery b = equipmentFacade.getBattery(idEquipment);

        wordingInput.setText(b.getWording());
        refillDateInput.setValue(((Date)b.getLastRefillDate()).toLocalDate());
        powerInput.setText(Integer.toString(b.getPower()));
    }

    public void back(ActionEvent actionEvent) {
        try {
            Main.batteriesView(Main.getPrimaryStage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

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
