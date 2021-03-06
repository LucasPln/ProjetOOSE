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

/**
 * The type Parachute update controller.
 *
 * @author Hugo Niort
 */
public class ParachuteUpdateController {
    /**
     * The Renewal date input.
     */
    public DatePicker renewalDateInput;
    /**
     * The Package date input.
     */
    public DatePicker packageDateInput;
    /**
     * The Wording input.
     */
    public TextField wordingInput;
    /**
     * The Error label.
     */
    public Label errorLabel;
    /**
     * The Equipment facade.
     */
    EquipmentFacade equipmentFacade;
    private int idEquipment;

    /**
     * Instantiates a new Parachute update controller.
     */
    public ParachuteUpdateController() {
        this.equipmentFacade = new EquipmentFacade();
    }

    /**
     * Update parachute.
     *
     * @param actionEvent the action event
     */
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

    /**
     * Sets infos.
     *
     * @param idEquipment the id equipment
     */
    public void setInfos(int idEquipment) {
        this.idEquipment = idEquipment;

        Parachute p = equipmentFacade.getParachute(idEquipment);

        wordingInput.setText(p.getWording());
        renewalDateInput.setValue(((Date)p.getRenewalDate()).toLocalDate());
        packageDateInput.setValue(((Date)p.getPackageDate()).toLocalDate());
    }

    /**
     * Back.
     */
    public void back() {
        try {
            Main.parachutesView(Main.getPrimaryStage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
