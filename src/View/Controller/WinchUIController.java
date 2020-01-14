package View.Controller;

import Facade.LauncherFacade;
import Model.Launcher;
import Model.Wincher;
import View.Main.Main;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

import java.io.IOException;
import java.util.ArrayList;

public class WinchUIController {
    @FXML
    private GridPane gridPlanes;


    private LauncherFacade launcherFacade;


    public WinchUIController() {
        this.launcherFacade = new LauncherFacade();
    }

    /**
     * Initialize elements from the UI.
     */
    @FXML
    public void initialize(){
        ArrayList<Launcher> winchs = this.launcherFacade.getAll("winch");

        for(int i = 0; i < winchs.size(); i++) {
            gridPlanes.addRow(0);

            Label l1 = new Label(winchs.get(i).getRegistrationLauncher());
            gridPlanes.add(l1,0, i + 1);
            GridPane.setHalignment(l1, javafx.geometry.HPos.CENTER);

            Label l2 = new Label(winchs.get(i).getMaxLaunchWeight()+"");
            gridPlanes.add(l2,1, i + 1);
            GridPane.setHalignment(l2, javafx.geometry.HPos.CENTER);

            Label l3 = new Label(winchs.get(i).getRenewalDate().toString());
            gridPlanes.add(l3,2, i + 1);
            GridPane.setHalignment(l3, javafx.geometry.HPos.CENTER);

            Label l4 = new Label(((Wincher)winchs.get(i)).getParachuteRenewal().toString());
            gridPlanes.add(l4,3, i + 1);
            GridPane.setHalignment(l4, javafx.geometry.HPos.CENTER);

            Button b2 = new Button("Update");
            int finalI = i;

            b2.setOnAction(event -> {
                updateWinch(winchs.get(finalI).getRegistrationLauncher());
            });


            gridPlanes.add(b2,6,i + 1);
            GridPane.setHalignment(b2, javafx.geometry.HPos.CENTER);

            Button b1 = new Button("X");

            b1.setOnAction(event -> {
                deleteWinch(winchs.get(finalI).getRegistrationLauncher());
            });

            gridPlanes.add(b1,7,i + 1);
            GridPane.setHalignment(b1, javafx.geometry.HPos.CENTER);
        }
    }


    public void createWinch(){
/*
        try {
            Main.planeCreationView(Main.getPrimaryStage());
        } catch (IOException e) {
            e.printStackTrace();
        }
*/

    }


    public void deleteWinch(String idWinch){


        this.launcherFacade.deleteWinch(idWinch);
        try {
            Main.winchView(Main.getPrimaryStage());
        } catch (IOException e) {
            e.printStackTrace();
        }




    }


    public void updateWinch(String idWinch){
        /*
        try {
            Main.updateWinchView(Main.getPrimaryStage(), idPlane);
        } catch (IOException e) {
            e.printStackTrace();
        }

         */


    }


    public void back(){
        try {
            Main.LaunchersView(Main.getPrimaryStage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
