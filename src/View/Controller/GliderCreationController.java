package View.Controller;

import Facade.GliderFacade;
import View.Main.Main;
import javafx.event.ActionEvent;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

/**
 * The type Glider creation controller.
 */
public class GliderCreationController {
    /**
     * The Error label.
     */
    public Label errorLabel;
    private GliderFacade gliderFacade;
    /**
     * The Review date input.
     */
    public DatePicker reviewDateInput;
    /**
     * The Registration id input.
     */
    public TextField registrationIDInput;
    /**
     * The Span input.
     */
    public TextField spanInput;
    /**
     * The Max width input.
     */
    public TextField maxWidthInput;

    /**
     * Instantiates a new Glider creation controller.
     */
    public GliderCreationController() { this.gliderFacade = new GliderFacade();}

    /**
     * Create glider.
     *
     * @param actionEvent the action event
     */
    public void createGlider(ActionEvent actionEvent) {
        if(registrationIDInput.getText().equals("") || spanInput.getText().equals("") || maxWidthInput.getText().equals("") || reviewDateInput.getValue() == null) {
            errorLabel.setText("Input Error");
        } else {
            boolean done = gliderFacade.createGlider(
                    registrationIDInput.getText(),
                    Float.parseFloat(spanInput.getText()),
                    Float.parseFloat(maxWidthInput.getText()),
                    java.sql.Date.valueOf(reviewDateInput.getValue())
            );
            if(!done) {
                errorLabel.setText("Creation Error");
            } else {
                try {
                    Main.glidersView(Main.getPrimaryStage());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * Back.
     *
     * @param actionEvent the action event
     */
    public void back(ActionEvent actionEvent) {
        try {
            Main.glidersView(Main.getPrimaryStage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
