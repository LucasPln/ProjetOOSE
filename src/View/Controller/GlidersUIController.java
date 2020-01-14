package View.Controller;

import Facade.GliderFacade;
import Model.Glider;
import View.Main.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

import java.io.IOException;
import java.util.ArrayList;

/**
 * @author Hugo Niort
 */
public class GlidersUIController {

    /**
     * The GridPane from the UI, that display the list of gliders
     */
    public GridPane gridGliders;

    /**
     * The GliderFacade
     */
    private GliderFacade gliderFacade;

    /**
     * Constructor that instatiates the GliderFacade
     */
    public GlidersUIController(){
        this.gliderFacade = new GliderFacade();
    }

    /**
     * Initializes the elements from the UI.
     */
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

            Button b2 = new Button("Update");
            int finalI = i;
            b2.setOnAction(event -> {
                updateGlider(gliders.get(finalI).getRegistrationGlider());
            });
            gridGliders.add(b2,6,i + 1);
            GridPane.setHalignment(b2, javafx.geometry.HPos.CENTER);

            Button b1 = new Button("X");
            b1.setOnAction(event -> {
                deleteGlider(gliders.get(finalI).getRegistrationGlider());
            });
            gridGliders.add(b1,7,i + 1);
            GridPane.setHalignment(b1, javafx.geometry.HPos.CENTER);
        }


    }

    /**
     * Switch UI to the gliderUpdate view of the glider selected.
     * Used by the "Update" buttons.
     * @param registrationGlider : registration of the glider selected.
     */
    private void updateGlider(String registrationGlider) {
        try {
            Main.gliderUpdate(Main.getPrimaryStage(), registrationGlider);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Delete the glider selected and reload the UI.
     * Used by the "X" buttons.
     *
     * @param id : registration of the booking selected.
     */
    public void deleteGlider(String id) {
        gliderFacade.deleteGlider(id);
        try {
            Main.glidersView(Main.getPrimaryStage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Switch UI to gliderCreationView view.
     * Used by the "New" button on the UI.
     */
    public void createGlider() {
        try {
            Main.gliderCreationView(Main.getPrimaryStage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void back(ActionEvent actionEvent) {
        try {
            Main.homeView(Main.getPrimaryStage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
