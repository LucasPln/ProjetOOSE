package View.Controller;

import Facade.EquipmentFacade;
import Facade.LoginFacade;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

import java.sql.Date;


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
        System.out.println(equipmentFacade.getAll("gps"));
    }

    public void seeBatteries(ActionEvent actionEvent) {
        System.out.println(equipmentFacade.getAll("battery"));
    }

    public void seeParachutes(ActionEvent actionEvent) {
        System.out.println(equipmentFacade.getAll("parachute"));
    }

    public void test(ActionEvent actionEvent) {
        equipmentFacade.createParachute("foo", new Date(1000), new Date(200));
    }
}
