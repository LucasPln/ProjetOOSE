package View.Controller;

import Facade.EquipmentFacade;
import Model.Equipment;
import Model.GPS;
import Model.Parachute;
import View.Main.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

import java.io.IOException;
import java.util.ArrayList;

/**
 * The type Gpsui controller.
 *
 * @author Hugo Niort
 */
public class GPSUIController {
    /**
     * The Equipment facade.
     */
    EquipmentFacade equipmentFacade;
    /**
     * The Grid gps.
     */
    public GridPane gridGPS;

    /**
     * Instantiates a new Gpsui controller.
     */
    public GPSUIController() {this.equipmentFacade = new EquipmentFacade();}

    /**
     * Initialize.
     */
    @FXML
    public void initialize() {
        ArrayList<Equipment> GPSs = this.equipmentFacade.getAll("gps");

        for(int i = 0; i < GPSs.size(); i++) {
            gridGPS.addRow(0);

            Label l1 = new Label(Integer.toString(GPSs.get(i).getIdEquipement()));
            gridGPS.add(l1,0, i + 1);
            GridPane.setHalignment(l1, javafx.geometry.HPos.CENTER);

            Label l2 = new Label(((Model.GPS)GPSs.get(i)).getInstalledVersion());
            gridGPS.add(l2,1, i + 1);
            GridPane.setHalignment(l2, javafx.geometry.HPos.CENTER);

            Label l3 = new Label(GPSs.get(i).getWording());
            gridGPS.add(l3,2, i + 1);
            GridPane.setHalignment(l3, javafx.geometry.HPos.CENTER);

            Button b2 = new Button("Update");
            int finalI = i;
            b2.setOnAction(event -> {
                updateGPS(GPSs.get(finalI).getIdEquipement());
            });
            gridGPS.add(b2,6,i + 1);
            GridPane.setHalignment(b2, javafx.geometry.HPos.CENTER);

            Button b1 = new Button("X");
            b1.setOnAction(event -> {
                deleteGPS(GPSs.get(finalI).getIdEquipement());
            });
            gridGPS.add(b1,7,i + 1);
            GridPane.setHalignment(b1, javafx.geometry.HPos.CENTER);
        }
    }

    private void updateGPS(int idEquipement) {
        try {
            Main.GPSUpdate(Main.getPrimaryStage(), idEquipement);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void deleteGPS(int idEquipement) {
        equipmentFacade.delete("gps", idEquipement);
        try {
            Main.GPSView(Main.getPrimaryStage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Create gps.
     *
     * @param actionEvent the action event
     */
    public void createGPS(ActionEvent actionEvent) {
        try {
            Main.GPSCreationView(Main.getPrimaryStage());
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
            Main.EquipmentsView(Main.getPrimaryStage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
