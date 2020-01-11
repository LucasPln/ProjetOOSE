package View.Controller;

import Facade.EquipmentFacade;
import Facade.LoginFacade;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

public class EquipmentsUIController {
    public EquipmentFacade equipmentFacade;
    public Label batteries;
    public Label GPS;
    public Label parachutes;

    public EquipmentsUIController() {
        this.equipmentFacade = new EquipmentFacade();
    }

    @FXML
    public void initialize(){
        batteries.setText(equipmentFacade.getNbEquipments("battery") + " Batteries");
        GPS.setText(equipmentFacade.getNbEquipments("gps") + " GPS");
        parachutes.setText(equipmentFacade.getNbEquipments("parachute") + " Parachutes");
    }

    public void seeGPS(ActionEvent actionEvent) {

    }

    public void seeBatteries(ActionEvent actionEvent) {
    }

    public void seeParachutes(ActionEvent actionEvent) {
    }
}
