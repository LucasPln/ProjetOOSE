package View.Controller;

import Facade.LauncherFacade;
import View.Main.Main;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.Date;

/**
 * The type Plane creation ui controller.
 *
 * @author Lucas Paulin
 */
public class PlaneCreationUIController {

    private LauncherFacade launcherFacade;

    /**
     * The Registration field.
     */
    public TextField registrationField;

    /**
     * The Max launch weight field.
     */
    public TextField maxLaunchWeightField;

    /**
     * The Acquisition date field.
     */
    public DatePicker acquisitionDateField;

    /**
     * The Renewal date field.
     */
    public DatePicker renewalDateField;

    /**
     * The Span field.
     */
    public TextField spanField;

    /**
     * The Max weight field.
     */
    public TextField maxWeightField;

    /**
     * Instantiates a new Plane creation ui controller.
     */
    public PlaneCreationUIController() {
        this.launcherFacade = new LauncherFacade();
    }

    /**
     * Initialize.
     */
    @FXML
    public void initialize(){

    }

    /**
     * Create booking.
     */
    public void createBooking(){
        String registration = this.registrationField.getText();
        int maxLaunchWeight = Integer.parseInt(this.maxLaunchWeightField.getText());
        Date asquisitionDate = java.sql.Date.valueOf(this.acquisitionDateField.getValue());
        Date renewalDate = java.sql.Date.valueOf(this.renewalDateField.getValue());
        int span = Integer.parseInt(this.spanField.getText());
        int maxWeight = Integer.parseInt(this.maxWeightField.getText());

        this.launcherFacade.createPlane(registration,maxLaunchWeight,asquisitionDate,renewalDate,span,maxWeight);

        try {
            Main.planesView(Main.getPrimaryStage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Back.
     */
    public void back(){
        try {
            Main.planesView(Main.getPrimaryStage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


