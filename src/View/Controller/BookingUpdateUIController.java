package View.Controller;

import Facade.*;
import Model.*;
import View.Main.Main;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;

import java.io.IOException;
import java.sql.Date;

/**
 * The type Booking update ui controller.
 *
 * @author Lucas Paulin
 */
public class BookingUpdateUIController {

    /**
     * The booking selected.
     */
    private Booking booking;

    /**
     * The bookingFacade.
     */
    private BookingFacade bf;

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
    public BookingUpdateUIController() {
        this.bf = new BookingFacade();
        this.equipmentFacade = new EquipmentFacade();
        this.launcherFacade = new LauncherFacade();
        this.diplomaFacade = new DiplomaFacade();
        this.gliderFacade = new GliderFacade();
        this.readUserFacade = new ReadUserFacade();
    }

    /**
     * Initializes the elements from the UI.
     */
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
     * Modifies the UI to have the information of the current reservation pre-selected.
     *
     * @param idbooking : id of the booking selected
     */
    public void setInfos(int idbooking){

        this.booking = this.bf.getBooking(idbooking);

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

    /**
     * Update the booking selected with the parameters selected.
     * Used by the "Update" button.
     */
    public void updateBooking() {

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
            this.booking.setStartDate(java.sql.Date.valueOf(startDateField.getValue()));
            this.booking.setEndDate(java.sql.Date.valueOf(endDateField.getValue()));
            this.booking.setBattery((Integer) batteryField.getValue());
            this.booking.setGps((Integer) GPSField.getValue());
            if(launcherPlaneField.getValue() == "---"){
                this.booking.setLauncherPlane(null);
            } else {
                this.booking.setLauncherPlane((String) launcherPlaneField.getValue());
            }

            if(launcherWinchField.getValue() == "---"){
                this.booking.setLauncherWinch(null);
            } else {
                this.booking.setLauncherWinch((String) launcherWinchField.getValue());
            }

            this.booking.setLaunchman((Integer) launchmanField.getValue());
            this.booking.setFlightManager((Integer) flightManagerField.getValue());
            if(diplomaField.getValue() == "---" || (Integer) diplomaField.getValue() == 0){
                this.booking.setDiploma(-1);
            } else {
                this.booking.setDiploma((Integer) diplomaField.getValue());
            }

            this.booking.setGlider((String) gliderField.getValue());

            System.out.println(this.booking.getDiploma());

            boolean done = bf.updateBooking(this.booking);
            if(!done) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("ERROR");
                alert.setHeaderText("ERREUR");
                alert.setContentText("Erreur lors de la mise à jour du booking !");
                alert.showAndWait();
            } else {
                try {
                    Main.bookingView(Main.getPrimaryStage());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * Switch UI to the booking view.
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
