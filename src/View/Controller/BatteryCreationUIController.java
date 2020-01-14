package View.Controller;

import Facade.EquipmentFacade;
import View.Main.Main;
import javafx.event.ActionEvent;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class BatteryCreationUIController {
    public Label errorLabel;
    public TextField wordingInput;
    public DatePicker refillDateInput;
    public TextField powerInput;
    private EquipmentFacade equipmentFacade;

    public BatteryCreationUIController() {equipmentFacade = new EquipmentFacade();}

    public void back(ActionEvent actionEvent) {
        try {
            Main.batteriesView(Main.getPrimaryStage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

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
