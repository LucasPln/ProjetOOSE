package View.Controller;

import Facade.EquipmentFacade;
import Model.GPS;
import View.Main.Main;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;
/**
 * @author Hugo Niort
 */
public class GPSUpdateController {
    public Label errorLabel;
    public TextField versionInput;
    public TextField wordingInput;
    private EquipmentFacade equipmentFacade;
    private int idEquipment;

    public GPSUpdateController() {this.equipmentFacade = new EquipmentFacade();}

    public void back(ActionEvent actionEvent) {
        try {
            Main.GPSView(Main.getPrimaryStage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

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

    public void setInfos(int idEquipement) {
        this.idEquipment = idEquipement;

        GPS g = equipmentFacade.getGPS(idEquipment);

        wordingInput.setText(g.getWording());
        versionInput.setText(g.getInstalledVersion());
    }
}
