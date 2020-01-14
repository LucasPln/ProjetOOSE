package View.Controller;

import Facade.EquipmentFacade;
import Model.GPS;
import View.Main.Main;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

/**
 * The type Gps update controller.
 *
 * @author Hugo Niort
 */
public class GPSUpdateController {
    /**
     * The Error label.
     */
    public Label errorLabel;
    /**
     * The Version input.
     */
    public TextField versionInput;
    /**
     * The Wording input.
     */
    public TextField wordingInput;
    private EquipmentFacade equipmentFacade;
    private int idEquipment;

    /**
     * Instantiates a new Gps update controller.
     */
    public GPSUpdateController() {this.equipmentFacade = new EquipmentFacade();}

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

    /**
     * Update gps.
     *
     * @param actionEvent the action event
     */
    public void updateGPS(ActionEvent actionEvent) {
        if(wordingInput.getText().equals("") || versionInput.getText().equals("")) {
            errorLabel.setText("Input Error");
        } else {
            equipmentFacade.updateGPS(
                    idEquipment,
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
     * Sets infos.
     *
     * @param idEquipement the id equipement
     */
    public void setInfos(int idEquipement) {
        this.idEquipment = idEquipement;

        GPS g = equipmentFacade.getGPS(idEquipment);

        wordingInput.setText(g.getWording());
        versionInput.setText(g.getInstalledVersion());
    }
}
