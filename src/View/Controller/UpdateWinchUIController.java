package View.Controller;

import Facade.LauncherFacade;
import Model.Plane;
import Model.Wincher;
import View.Main.Main;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.sql.Date;

/**
 * The type Update winch ui controller.
 *
 * @author Lucas Paulin
 */
public class UpdateWinchUIController {

    private LauncherFacade launcherFacade;

    private Wincher wincher;

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
     * Instantiates a new Update winch ui controller.
     */
    public UpdateWinchUIController() {
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
     * @param registWinch the regist winch
     */
    public void setInfos(String registWinch){

        this.wincher = this.launcherFacade.getWinch(registWinch);


        registrationField.setText(wincher.getRegistrationLauncher());
        maxLaunchWeightField.setText(wincher.getMaxLaunchWeight()+"");
        acquisitionDateField.setValue(((Date)wincher.getAcquisitionDate()).toLocalDate());
        renewalDateField.setValue(((Date)wincher.getRenewalDate()).toLocalDate());
        parachuteRenewalField.setValue(((Date)wincher.getParachuteRenewal()).toLocalDate());
        maxWeightField.setText(wincher.getMaxWeight()+"");
        ropeRenewalField.setValue(((Date)wincher.getRopeRenewal()).toLocalDate());




    }

    /**
     * Update winch.
     */
    public void updateWinch(){
        String registration = this.registrationField.getText();
        int maxLaunchWeight = Integer.parseInt(this.maxLaunchWeightField.getText());
        Date asquisitionDate = java.sql.Date.valueOf(this.acquisitionDateField.getValue());
        Date renewalDate = java.sql.Date.valueOf(this.renewalDateField.getValue());
        Date parachuteRenewal = java.sql.Date.valueOf(this.parachuteRenewalField.getValue());
        int maxWeight = Integer.parseInt(this.maxWeightField.getText());
        Date ropeRenewal = java.sql.Date.valueOf(this.ropeRenewalField.getValue());

        this.launcherFacade.updateWinch(registration,asquisitionDate,renewalDate,maxLaunchWeight,parachuteRenewal,ropeRenewal,maxWeight);

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
