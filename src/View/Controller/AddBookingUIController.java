package View.Controller;

import Facade.*;
import Model.*;
import View.Main.Main;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;

import java.io.IOException;
import java.util.Date;

/**
 * The type Add booking ui controller.
 *
 * @author Lucas Paulin
 */
public class AddBookingUIController {

    /**
     * The bookingFacade.
     */
    private BookingFacade bookingFacade;

    /**
     * The equipmentFacade.
     */
    private EquipmentFacade equipmentFacade;

    /**
     * The launherFacade.
     */
    private LauncherFacade launcherFacade;

    /**
     * The diplomaFacade.
     */
    private DiplomaFacade diplomaFacade;

    /**
     * The gliderFacade.
     */
    private GliderFacade gliderFacade;

    /**
     * The readUserFacade.
     */
    private ReadUserFacade readUserFacade;

    /**
     * A DatePicker from the view, used for the startDateField.
     */
    @FXML
    private DatePicker startDateField;

    /**
     * A DatePicker from the view, used for the endDateField.
     */
    @FXML
    private DatePicker endDateField;

    /**
     * A ChoiceBox from the view, used for the batteryField.
     */
    @FXML
    private ChoiceBox batteryField;

    /**
     * A ChoiceBox from the view, used for the GPSField.
     */
    @FXML
    private ChoiceBox GPSField;

    /**
     * A ChoiceBox from the view, used for the launcherPlaneField.
     */
    @FXML
    private ChoiceBox launcherPlaneField;

    /**
     * A ChoiceBox from the view, used for the launcherWinchField.
     */
    @FXML
    private ChoiceBox launcherWinchField;

    /**
     * A ChoiceBox from the view, used for the launchmanField.
     */
    @FXML
    private ChoiceBox launchmanField;

    /**
     * A ChoiceBox from the view, used for the flightManagerField.
     */
    @FXML
    private ChoiceBox flightManagerField;

    /**
     * A ChoiceBox from the view, used for the diplomaField.
     */
    @FXML
    private ChoiceBox diplomaField;

    /**
     * A ChoiceBox from the view, used for the gliderField.
     */
    @FXML
    private ChoiceBox gliderField;

    /**
     * Controller that initialize all the Facade.
     */
    public AddBookingUIController() {
        this.bookingFacade = new BookingFacade();
        this.equipmentFacade = new EquipmentFacade();
        this.launcherFacade = new LauncherFacade();
        this.diplomaFacade = new DiplomaFacade();
        this.gliderFacade = new GliderFacade();
        this.readUserFacade = new ReadUserFacade();
    }

    /**
     * Initialize elements from the UI.
     */
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

        ObservableList<String> listRegistrationLauncherPlane = FXCollections.observableArrayList();
        listRegistrationLauncherPlane.add("---");
        for (Plane plane : this.launcherFacade.getAllPlane()){
            listRegistrationLauncherPlane.add(plane.getRegistrationLauncher());
        }
        launcherPlaneField.setItems(listRegistrationLauncherPlane);

        ObservableList<String> listRegistrationLauncherWinch = FXCollections.observableArrayList();
        listRegistrationLauncherWinch.add("---");
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

        ObservableList<Object> listIdDiploma = FXCollections.observableArrayList();
        listIdDiploma.add("---");
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

    /**
     * Create a new booking with parameters selected.
     * Used by the "Create" button.
     */
    public void createBooking(){
        if(startDateField.getValue() == null ||
            endDateField.getValue() == null ||
            batteryField.getValue() == null ||
            GPSField.getValue() == null ||
            launchmanField.getValue() == null ||
            flightManagerField.getValue() == null ||
            gliderField.getValue() == null ||
            (launcherPlaneField.getValue() == null && launcherWinchField.getValue() == null)) {

            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("ERROR");
            alert.setHeaderText("ERREUR");
            alert.setContentText("Veuillez remplir tous les champs obligatoire !");
            alert.showAndWait();

        } else {
            Date startDate = java.sql.Date.valueOf(startDateField.getValue());
            Date endDate = java.sql.Date.valueOf(endDateField.getValue());
            double price = 0;
            String state = "todo";
            int idBattery = (Integer) batteryField.getValue();
            int idGPS = (Integer) GPSField.getValue();
            String registerLauncherPlane = null;
            if(launcherPlaneField.getValue() != null && launcherPlaneField.getValue() != "---"){
                registerLauncherPlane = (String) launcherPlaneField.getValue();
            }

            String registerLauncherWinch = null;
            if(launcherWinchField.getValue() != null && launcherWinchField.getValue() != "---"){
                registerLauncherWinch = (String) launcherWinchField.getValue();
            }
            int idLaunchman = (Integer) launchmanField.getValue();
            int idCustomer = LoginFacade.getInstance().getConnectedUser().getId();
            int idFlightManager = (Integer) flightManagerField.getValue();

            int idDiploma = -1;
            if(diplomaField.getValue() != null && diplomaField.getValue() != "---"){
                idDiploma = (Integer) diplomaField.getValue();
            }

            String idGlider = (String) gliderField.getValue();

            Booking newBooking = new Booking(startDate,endDate,price,state,idBattery,idGPS,registerLauncherPlane,registerLauncherWinch,idLaunchman,idCustomer,idFlightManager,idDiploma,idGlider);

            boolean result = this.bookingFacade.createBooking(newBooking);

            if (result){
                try {
                    Main.bookingView(Main.getPrimaryStage());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("ERROR");
                alert.setHeaderText("ERREUR");
                alert.setContentText("Booking non créé");
                alert.showAndWait();
            }
        }



    }

    /**
     * Switch UI to the Booking view.
     * Used by the "Back" button.
     */
    public void back(){
        try {
            Main.bookingView(Main.getPrimaryStage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
