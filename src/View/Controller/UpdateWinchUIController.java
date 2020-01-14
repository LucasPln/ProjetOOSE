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


        registrationField.setText(wincher.getRegistrationLauncher());
        maxLaunchWeightField.setText(wincher.getMaxLaunchWeight()+"");
        acquisitionDateField.setValue(((Date)wincher.getAcquisitionDate()).toLocalDate());
        renewalDateField.setValue(((Date)wincher.getRenewalDate()).toLocalDate());
        parachuteRenewalField.setValue(((Date)wincher.getParachuteRenewal()).toLocalDate());
        maxWeightField.setText(wincher.getMaxWeight()+"");
        ropeRenewalField.setValue(((Date)wincher.getRopeRenewal()).toLocalDate());




    }

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

    public void back(){
        try {
            Main.winchView(Main.getPrimaryStage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
