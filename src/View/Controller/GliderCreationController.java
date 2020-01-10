package View.Controller;

import Facade.GliderFacade;
import View.Main.Main;
import javafx.event.ActionEvent;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class GliderCreationController {
    public Label errorLabel;
    private GliderFacade gliderFacade;
    public DatePicker reviewDateInput;
    public TextField registrationIDInput;
    public TextField spanInput;
    public TextField maxWidthInput;

    public GliderCreationController() { this.gliderFacade = new GliderFacade();}

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
}
