package View.Controller;

import Facade.LauncherFacade;
import Model.Plane;
import View.Main.Main;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.sql.Date;

/**
 * The type Update plane ui controller.
 *
 * @author Lucas Paulin
 */
public class UpdatePlaneUIController {

    private LauncherFacade launcherFacade;

    private Plane plane;

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
     * Instantiates a new Update plane ui controller.
     */
    public UpdatePlaneUIController() {
        this.launcherFacade = new LauncherFacade();
    }

    /**
     * Initialize.
     */
    @FXML
    public void initialize(){

    }

    /**
     * Set infos.
     *
     * @param registPlane the regist plane
     */
    public void setInfos(String registPlane){

        this.plane = this.launcherFacade.getPlane(registPlane);
        System.out.println(plane);

        registrationField.setText(plane.getRegistrationLauncher());
        maxLaunchWeightField.setText(plane.getMaxLaunchWeight()+"");
        acquisitionDateField.setValue(((Date)plane.getAcquisitionDate()).toLocalDate());
        renewalDateField.setValue(((Date)plane.getRenewalDate()).toLocalDate());
        spanField.setText(plane.getSpan()+"");
        maxWeightField.setText(plane.getMaxWeight()+"");


    }

    /**
     * Update plane.
     */
    public void updatePlane(){
        String registration = this.registrationField.getText();
        int maxLaunchWeight = Integer.parseInt(this.maxLaunchWeightField.getText());
        Date asquisitionDate = java.sql.Date.valueOf(this.acquisitionDateField.getValue());
        Date renewalDate = java.sql.Date.valueOf(this.renewalDateField.getValue());
        int span = Integer.parseInt(this.spanField.getText());
        int maxWeight = Integer.parseInt(this.maxWeightField.getText());

        this.launcherFacade.updatePlane(registration,maxLaunchWeight,asquisitionDate,renewalDate,span,maxWeight);

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
