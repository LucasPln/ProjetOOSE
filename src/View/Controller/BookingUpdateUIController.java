package View.Controller;

import Facade.*;
import Model.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;

import java.sql.Date;

public class BookingUpdateUIController {

    private BookingFacade bf;
    private EquipmentFacade equipmentFacade;
    private LauncherFacade launcherFacade;
    private DiplomaFacade diplomaFacade;
    private GliderFacade gliderFacade;
    private ReadUserFacade readUserFacade;

    @FXML
    private DatePicker startDateField;

    @FXML
    private DatePicker endDateField;

    @FXML
    private ChoiceBox batteryField;

    @FXML
    private ChoiceBox GPSField;

    @FXML
    private ChoiceBox launcherPlaneField;

    @FXML
    private ChoiceBox launcherWinchField;

    @FXML
    private ChoiceBox launchmanField;

    @FXML
    private ChoiceBox flightManagerField;

    @FXML
    private ChoiceBox diplomaField;

    @FXML
    private ChoiceBox gliderField;

    @FXML
    private Button updateBookingButton;

    public BookingUpdateUIController() {
        this.bf = new BookingFacade();
        this.equipmentFacade = new EquipmentFacade();
        this.launcherFacade = new LauncherFacade();
        this.diplomaFacade = new DiplomaFacade();
        this.gliderFacade = new GliderFacade();
        this.readUserFacade = new ReadUserFacade();
    }

    @FXML
    public void initialize(){
        ObservableList<Integer> listIdBattery = FXCollections.observableArrayList();
        for (Battery battery : this.equipmentFacade.getAllBattery()){
            listIdBattery.add(battery.getIdEquipement());
        }
        batteryField.setItems(listIdBattery);

        ObservableList<Integer> listIdGPS = FXCollections.observableArrayList();
        for (GPS gps : this.equipmentFacade.getAllGPS()){
            listIdGPS.add(gps.getIdEquipement());
        }
        GPSField.setItems(listIdGPS);

        ObservableList<String> listRegistrationLauncherPlane = FXCollections.observableArrayList();
        for (Plane plane : this.launcherFacade.getAllPlane()){
            listRegistrationLauncherPlane.add(plane.getRegistrationLauncher());
        }
        launcherPlaneField.setItems(listRegistrationLauncherPlane);

        ObservableList<String> listRegistrationLauncherWinch = FXCollections.observableArrayList();
        for (Wincher wincher : this.launcherFacade.getAllWincher()){
            listRegistrationLauncherWinch.add(wincher.getRegistrationLauncher());
        }
        launcherWinchField.setItems(listRegistrationLauncherWinch);

        ObservableList<Integer> listIdMonitor = FXCollections.observableArrayList();
        for (User user : this.readUserFacade.getAllMonitor()){
            listIdMonitor.add(user.getId());
        }
        launchmanField.setItems(listIdMonitor);
        flightManagerField.setItems(listIdMonitor);

        ObservableList<Integer> listIdDiploma = FXCollections.observableArrayList();
        for (Diploma diploma : this.diplomaFacade.getAllDiploma()){
            listIdDiploma.add(diploma.getIdDiploma());
        }
        diplomaField.setItems(listIdDiploma);


        ObservableList<String> listRegistrationGlider = FXCollections.observableArrayList();
        for (Glider glider : this.gliderFacade.getAllGliders()){
            listRegistrationGlider.add(glider.getRegistrationGlider());
        }
        gliderField.setItems(listRegistrationGlider);
    }

    public void setInfos(int idbooking){

        Booking booking = this.bf.getBooking(idbooking);

        startDateField.setValue(((Date)booking.getStartDate()).toLocalDate());
        endDateField.setValue(((Date)booking.getEndDate()).toLocalDate());
        batteryField.setValue(booking.getBattery());
        GPSField.setValue(booking.getGps());
        launcherPlaneField.setValue(booking.getLauncherPlane());
        launcherWinchField.setValue(booking.getLauncherWinch());
        launchmanField.setValue(booking.getLaunchman());
        flightManagerField.setValue(booking.getFlightManager());
        diplomaField.setValue(booking.getDiploma());
        gliderField.setValue(booking.getGlider());


    }



}
