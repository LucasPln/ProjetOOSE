package View.Controller;

import Facade.GliderFacade;
import Model.Glider;
import View.Main.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

import java.io.IOException;
import java.util.ArrayList;

public class GlidersUIController {
    public GridPane gridGliders;
    private GliderFacade gliderFacade;

    public GlidersUIController(){
        this.gliderFacade = new GliderFacade();
    }

    @FXML
    public void initialize() {
        ArrayList<Glider> gliders = this.gliderFacade.getGlidersFromCompany();

        for(int i = 0; i < gliders.size(); i++) {
            gridGliders.addRow(0);

            Label l1 = new Label(gliders.get(i).getRegistrationGlider());
            gridGliders.add(l1,0, i + 1);
            GridPane.setHalignment(l1, javafx.geometry.HPos.CENTER);

            Label l2 = new Label(Integer.toString(gliders.get(i).getSpan()));
            gridGliders.add(l2,1, i + 1);
            GridPane.setHalignment(l2, javafx.geometry.HPos.CENTER);

            Label l3 = new Label(Integer.toString(gliders.get(i).getMaxWeight()));
            gridGliders.add(l3,2, i + 1);
            GridPane.setHalignment(l3, javafx.geometry.HPos.CENTER);

            Label l4 = new Label(gliders.get(i).getAcquisitionDate().toString());
            gridGliders.add(l4,3, i + 1);
            GridPane.setHalignment(l4, javafx.geometry.HPos.CENTER);

            Label l5 = new Label(gliders.get(i).getReviewDate().toString());
            gridGliders.add(l5,4, i + 1);
            GridPane.setHalignment(l5, javafx.geometry.HPos.CENTER);
        }


    }

    public void createGlider(ActionEvent actionEvent) {
        try {
            Main.gliderCreationView(Main.getPrimaryStage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
