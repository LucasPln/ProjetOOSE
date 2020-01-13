package View.Controller;

import Facade.EquipmentFacade;
import javafx.fxml.FXML;
import javafx.scene.control.Label;


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
        System.out.println(equipmentFacade.getAll("gps"));
    }

    /**
     * Switch the UI to the Battery view
     */
    public void seeBatteries() {
        System.out.println(equipmentFacade.getAll("battery"));
    }

    /**
     * Switch the UI to the Parachute view
     */
    public void seeParachutes() {
        System.out.println(equipmentFacade.getAll("parachute"));
    }
}
