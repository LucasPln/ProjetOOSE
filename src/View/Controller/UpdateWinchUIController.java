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

public class UpdateWinchUIController {

    private LauncherFacade launcherFacade;

    private Wincher wincher;

    public TextField registrationField;

    public TextField maxLaunchWeightField;

    public DatePicker acquisitionDateField;

    public DatePicker renewalDateField;

    public TextField maxWeightField;

    public DatePicker parachuteRenewalField;

    public DatePicker ropeRenewalField;

    public UpdateWinchUIController() {
        this.launcherFacade = new LauncherFacade();
    }

    @FXML
    public void initialize(){

    }

    public void setInfos(String registWinch){

        this.wincher = this.launcherFacade.getWinch(registWinch);
        /*
        System.out.println(plane);

        registrationField.setText(plane.getRegistrationLauncher());
        maxLaunchWeightField.setText(plane.getMaxLaunchWeight()+"");
        acquisitionDateField.setValue(((Date)plane.getAcquisitionDate()).toLocalDate());
        renewalDateField.setValue(((Date)plane.getRenewalDate()).toLocalDate());
        spanField.setText(plane.getSpan()+"");
        maxWeightField.setText(plane.getMaxWeight()+"");

         */


    }

    public void updateWinch(){
        /*
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

         */
    }

    public void back(){
        try {
            Main.winchView(Main.getPrimaryStage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
