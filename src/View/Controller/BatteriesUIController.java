package View.Controller;

import Facade.EquipmentFacade;
import Model.Battery;
import Model.Equipment;
import View.Main.Main;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

import java.io.IOException;
import java.util.ArrayList;

public class BatteriesUIController {
    public GridPane gridBatteries;
    private EquipmentFacade equipmentFacade;
    
    public BatteriesUIController() {this.equipmentFacade = new EquipmentFacade();}

    public void initialize() {
        ArrayList<Equipment> batteries = this.equipmentFacade.getAll("battery");

        for(int i = 0; i < batteries.size(); i++) {
            gridBatteries.addRow(0);

            Label l1 = new Label(Integer.toString(batteries.get(i).getIdEquipement()));
            gridBatteries.add(l1,0, i + 1);
            GridPane.setHalignment(l1, javafx.geometry.HPos.CENTER);

            Label l2 = new Label(batteries.get(i).getWording());
            gridBatteries.add(l2,1, i + 1);
            GridPane.setHalignment(l2, javafx.geometry.HPos.CENTER);

            Label l3 = new Label(Integer.toString(((Battery)batteries.get(i)).getPower()));
            gridBatteries.add(l3,2, i + 1);
            GridPane.setHalignment(l3, javafx.geometry.HPos.CENTER);

            Label l4 = new Label(((Battery)batteries.get(i)).getLastRefillDate().toString());
            gridBatteries.add(l4,3, i + 1);
            GridPane.setHalignment(l4, javafx.geometry.HPos.CENTER);

            Button b2 = new Button("Update");
            int finalI = i;
            b2.setOnAction(event -> {
                updateBattery(batteries.get(finalI).getIdEquipement());
            });
            gridBatteries.add(b2,6,i + 1);
            GridPane.setHalignment(b2, javafx.geometry.HPos.CENTER);

            Button b1 = new Button("X");
            b1.setOnAction(event -> {
                deleteBattery(batteries.get(finalI).getIdEquipement());
            });
            gridBatteries.add(b1,7,i + 1);
            GridPane.setHalignment(b1, javafx.geometry.HPos.CENTER);
        }


    }

    private void deleteBattery(int idEquipement) {
        equipmentFacade.delete("battery", idEquipement);
        try {
            Main.batteriesView(Main.getPrimaryStage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void updateBattery(int idEquipement) {
        try {
            Main.batteryUpdate(Main.getPrimaryStage(), idEquipement);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void createBattery(ActionEvent actionEvent) {
        try {
            Main.BatteryCreationView(Main.getPrimaryStage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void back(ActionEvent actionEvent) {
        try {
            Main.EquipmentsView(Main.getPrimaryStage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
