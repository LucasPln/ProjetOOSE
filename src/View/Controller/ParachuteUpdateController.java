package View.Controller;

import Facade.EquipmentFacade;
import Model.Glider;
import Model.Parachute;
import View.Main.Main;
import javafx.event.ActionEvent;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.sql.Date;

public class ParachuteUpdateController {
    public DatePicker renewalDateInput;
    public DatePicker packageDateInput;
    public TextField wordingInput;
    public Label errorLabel;
    EquipmentFacade equipmentFacade;
    private int idEquipment;

    public ParachuteUpdateController() {
        this.equipmentFacade = new EquipmentFacade();
    }

    public void updateParachute(ActionEvent actionEvent) {
        if(wordingInput.getText().equals("") || renewalDateInput.getValue() == null || packageDateInput.getValue() == null) {
            errorLabel.setText("Input Error");
        } else {
            equipmentFacade.updateParachute(
                    idEquipment,
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

    public void setInfos(int idEquipment) {
        this.idEquipment = idEquipment;

        Parachute p = equipmentFacade.getParachute(idEquipment);

        wordingInput.setText(p.getWording());
        renewalDateInput.setValue(((Date)p.getRenewalDate()).toLocalDate());
        packageDateInput.setValue(((Date)p.getPackageDate()).toLocalDate());
    }

    public void back() {
        try {
            Main.parachutesView(Main.getPrimaryStage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
