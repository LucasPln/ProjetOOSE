package View.Controller;

import Facade.EquipmentFacade;
import Model.Equipment;
import Model.Parachute;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

import java.util.ArrayList;

public class ParachutesUIController {
    public GridPane gridParachutes;
    private EquipmentFacade equipmentFacade;

    public ParachutesUIController() {
        this.equipmentFacade = new EquipmentFacade();
    }

    @FXML
    public void initialize() {
        ArrayList<Equipment> parachutes = this.equipmentFacade.getAll("parachute");

        for(int i = 0; i < parachutes.size(); i++) {
            gridParachutes.addRow(0);

            Label l1 = new Label(Integer.toString(parachutes.get(i).getIdEquipement()));
            gridParachutes.add(l1,0, i + 1);
            GridPane.setHalignment(l1, javafx.geometry.HPos.CENTER);

            Label l2 = new Label(parachutes.get(i).getWording());
            gridParachutes.add(l2,1, i + 1);
            GridPane.setHalignment(l2, javafx.geometry.HPos.CENTER);

            Label l3 = new Label(((Parachute)parachutes.get(i)).getRenewalDate().toString());
            gridParachutes.add(l3,2, i + 1);
            GridPane.setHalignment(l3, javafx.geometry.HPos.CENTER);

            Label l4 = new Label(((Parachute)parachutes.get(i)).getPackageDate().toString());
            gridParachutes.add(l4,3, i + 1);
            GridPane.setHalignment(l4, javafx.geometry.HPos.CENTER);

            Button b2 = new Button("Update");
            int finalI = i;
            b2.setOnAction(event -> {
                updateParachute(parachutes.get(finalI).getIdEquipement());
            });
            gridParachutes.add(b2,6,i + 1);
            GridPane.setHalignment(b2, javafx.geometry.HPos.CENTER);

            Button b1 = new Button("X");
            b1.setOnAction(event -> {
                deleteParachute(parachutes.get(finalI).getIdEquipement());
            });
            gridParachutes.add(b1,7,i + 1);
            GridPane.setHalignment(b1, javafx.geometry.HPos.CENTER);
        }


    }

    private void deleteParachute(int idEquipement) {
    }

    private void updateParachute(int idEquipement) {
    }

    public void createParachute(ActionEvent actionEvent) {
    }
}
