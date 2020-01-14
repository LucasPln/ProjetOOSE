package View.Controller;

import Facade.LauncherFacade;
import Model.Launcher;
import Model.Plane;
import View.Main.Main;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

import java.io.IOException;
import java.util.ArrayList;

public class PlaneUIController {

    @FXML
    private GridPane gridPlanes;


    private LauncherFacade launcherFacade;


    public PlaneUIController() {
        this.launcherFacade = new LauncherFacade();
    }

    /**
     * Initialize elements from the UI.
     */
    @FXML
    public void initialize(){
        ArrayList<Launcher> planes = this.launcherFacade.getAll("plane");

        for(int i = 0; i < planes.size(); i++) {
            gridPlanes.addRow(0);

            Label l1 = new Label(planes.get(i).getRegistrationLauncher());
            gridPlanes.add(l1,0, i + 1);
            GridPane.setHalignment(l1, javafx.geometry.HPos.CENTER);

            Label l2 = new Label(planes.get(i).getMaxLaunchWeight()+"");
            gridPlanes.add(l2,1, i + 1);
            GridPane.setHalignment(l2, javafx.geometry.HPos.CENTER);

            Label l3 = new Label(planes.get(i).getRenewalDate().toString());
            gridPlanes.add(l3,2, i + 1);
            GridPane.setHalignment(l3, javafx.geometry.HPos.CENTER);

            Label l4 = new Label(((Plane)planes.get(i)).getSpan()+"");
            gridPlanes.add(l4,3, i + 1);
            GridPane.setHalignment(l4, javafx.geometry.HPos.CENTER);

            Button b2 = new Button("Update");
            int finalI = i;

            b2.setOnAction(event -> {
                updatePlane(planes.get(finalI).getRegistrationLauncher());
            });


            gridPlanes.add(b2,6,i + 1);
            GridPane.setHalignment(b2, javafx.geometry.HPos.CENTER);

            Button b1 = new Button("X");

            b1.setOnAction(event -> {
                deletePlane(planes.get(finalI).getRegistrationLauncher());
            });

            gridPlanes.add(b1,7,i + 1);
            GridPane.setHalignment(b1, javafx.geometry.HPos.CENTER);
        }
    }


    public void createPlane(){

        try {
            Main.planeCreationView(Main.getPrimaryStage());
        } catch (IOException e) {
            e.printStackTrace();
        }


    }


    public void deletePlane(String idPlane){

        this.launcherFacade.deletePlane(idPlane);
        try {
            Main.planesView(Main.getPrimaryStage());
        } catch (IOException e) {
            e.printStackTrace();
        }


    }


    public void updatePlane(String idPlane){

        try {
            Main.updatePlaneView(Main.getPrimaryStage(), idPlane);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }


    public void back(){
        try {
            Main.LaunchersView(Main.getPrimaryStage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
