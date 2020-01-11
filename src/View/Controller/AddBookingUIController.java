package View.Controller;

import Facade.BookingFacade;
import Facade.EquipmentFacade;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;

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
        System.out.println(this.equipmentFacade.getAllBattery());
    }

    public AddBookingUIController() {
        this.bookingFacade = new BookingFacade();
        this.equipmentFacade = new EquipmentFacade();
    }
}
