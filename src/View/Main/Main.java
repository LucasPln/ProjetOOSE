package View.Main;

import View.Controller.*;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * The type Main.
 *
 * @author Lucas Paulin
 */
public class Main extends Application {

    private static Stage primaryStage;
    private static FXMLLoader loader;


    /**
     * Start.
     *
     * @param primaryStage the primary stage
     * @throws Exception the exception
     */
    @Override
    public void start(Stage primaryStage) throws Exception{

        Main.loginView(primaryStage);
        Main.primaryStage = primaryStage;
    }

    private static void uploadView(Stage stage, String title, String path) throws IOException {
        loader = new FXMLLoader(Main.class.getResource(path));
        Parent root = loader.load();
        stage.setTitle(title);
        stage.setScene(new Scene(root));
        stage.show();
    }

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    /**
     * Login view.
     *
     * @param stage the stage
     * @throws IOException the io exception
     */
    public static void loginView(Stage stage) throws IOException {
        uploadView(stage, "Login", "../UI/loginUI.fxml");
    }

    /**
     * Logout view.
     *
     * @param stage the stage
     * @throws IOException the io exception
     */
    public static void logoutView(Stage stage) throws IOException {
        uploadView(stage, "Login", "../UI/loginUI.fxml");
    }

    /**
     * Home view.
     *
     * @param stage the stage
     * @throws IOException the io exception
     */
    public static void homeView(Stage stage) throws IOException {
        uploadView(stage, "Flight Manager", "../UI/Home.fxml");
    }

    /**
     * My profile view.
     *
     * @param stage the stage
     * @throws IOException the io exception
     */
    public static void myProfileView(Stage stage) throws IOException {
        uploadView(stage, "Flight Manager", "../UI/myProfile.fxml");
    }

    /**
     * Gliders view.
     *
     * @param stage the stage
     * @throws IOException the io exception
     */
    public static void glidersView(Stage stage) throws IOException {
        uploadView(stage, "Flight Manager", "../UI/gliders.fxml");
    }

    /**
     * Glider creation view.
     *
     * @param stage the stage
     * @throws IOException the io exception
     */
    public static void gliderCreationView(Stage stage) throws IOException {
        uploadView(stage, "Flight Manager", "../UI/gliderCreation.fxml");
    }

    /**
     * Booking view.
     *
     * @param stage the stage
     * @throws IOException the io exception
     */
    public static void bookingView(Stage stage) throws IOException {
        uploadView(stage, "Flight Manager", "../UI/booking.fxml");
    }

    /**
     * My company view.
     *
     * @param stage the stage
     * @throws IOException the io exception
     */
    public static void myCompanyView(Stage stage) throws IOException{
        uploadView(stage, "Flight Manager", "../UI/company.fxml");
    }

    /**
     * Add user view.
     *
     * @param stage the stage
     * @throws IOException the io exception
     */
    public static void addUserView(Stage stage) throws IOException {
        uploadView(stage, "Flight Manager", "../UI/addUser.fxml");
    }

    /**
     * Booking creation view.
     *
     * @param stage the stage
     * @throws IOException the io exception
     */
    public static void bookingCreationView(Stage stage) throws IOException{
        uploadView(stage, "Flight Manager", "../UI/addBooking.fxml");
    }

    /**
     * Update user view.
     *
     * @param stage the stage
     * @throws IOException the io exception
     */
    public static void updateUserView(Stage stage) throws IOException{
        uploadView(stage, "Flight Manager", "../UI/updateUser.fxml");
    }

    /**
     * Update booking view.
     *
     * @param stage     the stage
     * @param idBooking the id booking
     * @throws IOException the io exception
     */
    public static void updateBookingView(Stage stage, int idBooking) throws IOException{
        loader = new FXMLLoader(Main.class.getResource("../UI/bookingUpdate.fxml"));
        Parent root = loader.load();
        stage.setTitle("Flight Manager");
        stage.setScene(new Scene(root));

        BookingUpdateUIController controller = loader.<BookingUpdateUIController>getController();
        controller.setInfos(idBooking);

        stage.show();
    }

    /**
     * Glider update.
     *
     * @param stage              the stage
     * @param registrationGlider the registration glider
     * @throws IOException the io exception
     */
    public static void gliderUpdate(Stage stage, String registrationGlider) throws IOException {
        loader = new FXMLLoader(Main.class.getResource("../UI/gliderUpdate.fxml"));
        Parent root = loader.load();
        stage.setTitle("Flight Manager");
        stage.setScene(new Scene(root));

        GliderUpdateController controller = loader.<GliderUpdateController>getController();
        controller.setInfos(registrationGlider);

        stage.show();
    }

    public static void parachuteUpdate(Stage stage, int idEquipement) throws IOException {
        loader = new FXMLLoader(Main.class.getResource("../UI/parachuteUpdate.fxml"));
        Parent root = loader.load();
        stage.setTitle("Flight Manager");
        stage.setScene(new Scene(root));

        ParachuteUpdateController controller = loader.<ParachuteUpdateController>getController();
        controller.setInfos(idEquipement);

        stage.show();
    }

    public static void GPSUpdate(Stage stage, int idEquipement) throws IOException {
        loader = new FXMLLoader(Main.class.getResource("../UI/GPSUpdate.fxml"));
        Parent root = loader.load();
        stage.setTitle("Flight Manager");
        stage.setScene(new Scene(root));

        GPSUpdateController controller = loader.<GPSUpdateController>getController();
        controller.setInfos(idEquipement);

        stage.show();
    }

    public static void batteryUpdate(Stage stage, int idEquipement) throws IOException {
        loader = new FXMLLoader(Main.class.getResource("../UI/batteryUpdate.fxml"));
        Parent root = loader.load();
        stage.setTitle("Flight Manager");
        stage.setScene(new Scene(root));

        BatteryUpdateController controller = loader.<BatteryUpdateController>getController();
        controller.setInfos(idEquipement);

        stage.show();
    }

    /**
     * Equipments view.
     *
     * @param stage the stage
     * @throws IOException the io exception
     */
    public static void EquipmentsView(Stage stage) throws IOException {
        uploadView(stage, "Flight Manager", "../UI/equipments.fxml");
    }

    public static void batteriesView(Stage stage) throws IOException {
        uploadView(stage, "Flight Manager", "../UI/batteries.fxml");
    }

    /**
     * Launchers view.
     *
     * @param stage the stage
     * @throws IOException the io exception
     */
    public static void LaunchersView(Stage stage) throws IOException {
        uploadView(stage, "Flight Manager", "../UI/launchers.fxml");
    }

    public static void GPSView(Stage stage) throws IOException {
        uploadView(stage, "Flight Manager", "../UI/GPS.fxml");
    }

    public static void listCompanyView(Stage stage) throws IOException {
        uploadView(stage, "Flight Manager", "../UI/listCompanyView.fxml");
    }

    public static void addCompanyView(Stage stage) throws IOException {
        uploadView(stage, "Flight Manager", "../UI/addCompany.fxml");
    }
    /**
     * Parachutes view.
     *
     * @param stage the stage
     * @throws IOException the io exception
     */
    public static void parachutesView(Stage stage) throws IOException {
        uploadView(stage, "Flight Manager", "../UI/parachutes.fxml");
    }

    public static void parachuteCreationView(Stage stage) throws IOException {
        uploadView(stage, "Flight Manager", "../UI/parachuteCreation.fxml");
    }

    public static void GPSCreationView(Stage stage) throws IOException {
        uploadView(stage, "Flight Manager", "../UI/GPSCreation.fxml");
    }

    public static void BatteryCreationView(Stage stage) throws IOException {
        uploadView(stage, "Flight Manager", "../UI/BatteryCreation.fxml");
    }

    /**
     * Get primary stage stage.
     *
     * @return the stage
     */
    public static Stage getPrimaryStage(){
        return primaryStage;
    }

    /**
     * Users view.
     *
     * @param stage the stage
     * @throws IOException the io exception
     */
    public static void usersView(Stage stage) throws IOException {
        uploadView(stage, "Flight Manager", "../UI/users.fxml");
    }

    public static void planesView(Stage stage) throws IOException {
        uploadView(stage, "Flight Manager", "../UI/plane.fxml");
    }

    public static void planeCreationView(Stage stage) throws IOException {
        uploadView(stage, "Flight Manager", "../UI/createPlane.fxml");
    }

    public static void updatePlaneView(Stage stage, String registPlane) throws IOException {
        loader = new FXMLLoader(Main.class.getResource("../UI/updatePlane.fxml"));
        Parent root = loader.load();
        stage.setTitle("Flight Manager");
        stage.setScene(new Scene(root));

        UpdatePlaneUIController controller = loader.<UpdatePlaneUIController>getController();
        controller.setInfos(registPlane);

        stage.show();
    }

    public static void winchView(Stage stage) throws IOException {
        uploadView(stage, "Flight Manager", "../UI/winch.fxml");
    }

    public static void createWinchView(Stage stage) throws IOException {
        uploadView(stage, "Flight Manager", "../UI/createWinch.fxml");
    }

    public static void updateWinchView(Stage stage, String idWinch) throws IOException {
        loader = new FXMLLoader(Main.class.getResource("../UI/updateWinch.fxml"));
        Parent root = loader.load();
        stage.setTitle("Flight Manager");
        stage.setScene(new Scene(root));

        UpdateWinchUIController controller = loader.<UpdateWinchUIController>getController();
        controller.setInfos(idWinch);

        stage.show();
    }

}
