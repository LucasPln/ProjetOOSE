package View.Controller;

import Facade.BookingFacade;
import Facade.EquipmentFacade;
import Model.Battery;
import Model.GPS;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;

import java.util.ArrayList;
import java.util.Observable;

public class AddBookingUIController {

    private BookingFacade bookingFacade;
    private EquipmentFacade equipmentFacade;

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
    private Button addButton;

    @FXML
    public void initialize() {
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


    }

    public AddBookingUIController() {
        this.bookingFacade = new BookingFacade();
        this.equipmentFacade = new EquipmentFacade();
    }
}
