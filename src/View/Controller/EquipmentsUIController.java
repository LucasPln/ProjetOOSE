package View.Controller;

import Facade.EquipmentFacade;
import View.Main.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.io.IOException;

/**
 * @author Hugo Niort
 */

/**
 * The type Equipments ui controller.
 */
public class EquipmentsUIController {

    /**
     * The EquipmentFacade.
     */
    public EquipmentFacade equipmentFacade;

    /**
     * Label from the UI, that display the number of batteries.
     */
    public Label batteries;

    /**
     * Label from the UI, that display the number of GPS.
     */
    public Label GPS;

    /**
     * Label from the UI, that display the number of parachutes.
     */
    public Label parachutes;

    /**
     * Constructor that instantiates the EquipmentFacade
     */
    public EquipmentsUIController() {
        this.equipmentFacade = new EquipmentFacade();
    }

    /**
     * Initializes the elements from the UI.
     */
    @FXML
    public void initialize(){
        batteries.setText(equipmentFacade.getNbEquipments("battery") + " Batteries");
        GPS.setText(equipmentFacade.getNbEquipments("gps") + " GPS");
        parachutes.setText(equipmentFacade.getNbEquipments("parachute") + " Parachutes");
    }

    /**
     * Switch the UI to the GPS view
     */
    public void seeGPS() {
        try {
            Main.GPSView(Main.getPrimaryStage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Switch the UI to the Battery view
     */
    public void seeBatteries() {
        try {
            Main.batteriesView(Main.getPrimaryStage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Switch the UI to the Parachute view
     */
    public void seeParachutes() {
        try {
            Main.parachutesView(Main.getPrimaryStage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Back.
     *
     * @param actionEvent the action event
     */
    public void back(ActionEvent actionEvent) {
        try {
            Main.homeView(Main.getPrimaryStage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
