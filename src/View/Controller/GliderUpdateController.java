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

/**
 * The type Glider update controller.
 */
public class GliderUpdateController {
    /**
     * The Error label.
     */
    public Label errorLabel;
    /**
     * The Max width input.
     */
    public TextField maxWidthInput;
    /**
     * The Span input.
     */
    public TextField spanInput;
    /**
     * The Registration id input.
     */
    public TextField registrationIDInput;
    /**
     * The Review date input.
     */
    public DatePicker reviewDateInput;
    private GliderFacade gliderFacade;
    /**
     * The Id glider.
     */
    String idGlider;

    /**
     * Instantiates a new Glider update controller.
     */
    public GliderUpdateController() {
        this.gliderFacade = new GliderFacade();
    }

    /**
     * Update glider.
     *
     * @param actionEvent the action event
     */
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

    /**
     * Sets infos.
     *
     * @param registrationGlider the registration glider
     */
    public void setInfos(String registrationGlider) {
        this.idGlider = registrationGlider;

        Glider g = gliderFacade.getGlider(registrationGlider);

        registrationIDInput.setText(g.getRegistrationGlider());
        reviewDateInput.setValue(((Date)g.getReviewDate()).toLocalDate());
        spanInput.setText(Integer.toString(g.getSpan()));
        maxWidthInput.setText(Integer.toString(g.getMaxWeight()));
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
