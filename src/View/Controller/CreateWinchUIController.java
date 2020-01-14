package View.Controller;

import Facade.LauncherFacade;
import View.Main.Main;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.sql.Date;

public class CreateWinchUIController {

    private LauncherFacade launcherFacade;

    public TextField registrationField;

    public TextField maxLaunchWeightField;

    public DatePicker acquisitionDateField;

    public DatePicker renewalDateField;

    public TextField maxWeightField;

    public DatePicker parachuteRenewalField;

    public DatePicker ropeRenewalField;

    public CreateWinchUIController() {
        this.launcherFacade = new LauncherFacade();
    }

    @FXML
    public void initialize(){

    }

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

    public void back(){
        try {
            Main.winchView(Main.getPrimaryStage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
