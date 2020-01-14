package View.Controller;

import Facade.LauncherFacade;
import View.Main.Main;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.sql.Date;

/**
 * The type Create winch ui controller.
 *
 * @author Lucas Paulin
 */
public class CreateWinchUIController {

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
     * The Max weight field.
     */
    public TextField maxWeightField;

    /**
     * The Parachute renewal field.
     */
    public DatePicker parachuteRenewalField;

    /**
     * The Rope renewal field.
     */
    public DatePicker ropeRenewalField;

    /**
     * Instantiates a new Create winch ui controller.
     */
    public CreateWinchUIController() {
        this.launcherFacade = new LauncherFacade();
    }

    /**
     * Initialize.
     */
    @FXML
    public void initialize(){

    }

    /**
     * Create winch.
     */
    public void createWinch(){
        String registration = this.registrationField.getText();
        int maxLaunchWeight = Integer.parseInt(this.maxLaunchWeightField.getText());
        Date asquisitionDate = java.sql.Date.valueOf(this.acquisitionDateField.getValue());
        Date renewalDate = java.sql.Date.valueOf(this.renewalDateField.getValue());
        int maxWeight = Integer.parseInt(this.maxWeightField.getText());
        Date parachuteRenewal = java.sql.Date.valueOf(this.parachuteRenewalField.getValue());
        Date ropeRenawal = java.sql.Date.valueOf(this.ropeRenewalField.getValue());

        this.launcherFacade.createWinch(registration,asquisitionDate,renewalDate,maxLaunchWeight,ropeRenawal,parachuteRenewal,maxWeight);

        try {
            Main.winchView(Main.getPrimaryStage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Back.
     */
    public void back(){
        try {
            Main.winchView(Main.getPrimaryStage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
