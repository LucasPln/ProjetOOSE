package View.Controller;

import Facade.LauncherFacade;
import View.Main.Main;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.Date;

public class PlaneCreationUIController {

    private LauncherFacade launcherFacade;

    public TextField registrationField;

    public TextField maxLaunchWeightField;

    public DatePicker acquisitionDateField;

    public DatePicker renewalDateField;

    public TextField spanField;

    public TextField maxWeightField;

    public PlaneCreationUIController() {
        this.launcherFacade = new LauncherFacade();
    }

    @FXML
    public void initialize(){

    }

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

    public void back(){
        try {
            Main.planesView(Main.getPrimaryStage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


