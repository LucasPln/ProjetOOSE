package View.Controller;

import Facade.GliderFacade;
import Model.Glider;
import View.Main.Main;
import javafx.event.ActionEvent;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.sql.Date;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;

public class GliderUpdateController {
    public Label errorLabel;
    public TextField maxWidthInput;
    public TextField spanInput;
    public TextField registrationIDInput;
    public DatePicker reviewDateInput;
    private GliderFacade gliderFacade;
    String idGlider;

    public GliderUpdateController() {
        this.gliderFacade = new GliderFacade();
    }

    public void updateGlider(ActionEvent actionEvent) {
        System.out.println(idGlider);

        if(registrationIDInput.getText().equals("") || spanInput.getText().equals("") || maxWidthInput.getText().equals("") || reviewDateInput.getValue() == null) {
            errorLabel.setText("Input Error");
        } else {
            boolean done = gliderFacade.updateGlider(
                    this.idGlider,
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

    public void setInfos(String registrationGlider) {
        this.idGlider = registrationGlider;

        Glider g = gliderFacade.getGlider(registrationGlider);

        registrationIDInput.setText(g.getRegistrationGlider());
        reviewDateInput.setValue(((Date)g.getReviewDate()).toLocalDate());
        spanInput.setText(Integer.toString(g.getSpan()));
        maxWidthInput.setText(Integer.toString(g.getMaxWeight()));


    }
}
