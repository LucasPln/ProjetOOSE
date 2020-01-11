package View.Main;

import View.Controller.GliderUpdateController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    private static Stage primaryStage;
    private static FXMLLoader loader;



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

    public static void main(String[] args) {
        launch(args);
    }

    public static void loginView(Stage stage) throws IOException {
        uploadView(stage, "Login", "../UI/loginUI.fxml");
    }
    public static void logoutView(Stage stage) throws IOException {
        uploadView(stage, "Login", "../UI/loginUI.fxml");
    }

    public static void homeView(Stage stage) throws IOException {
        uploadView(stage, "Flight Manager", "../UI/Home.fxml");
    }

    public static void myProfileView(Stage stage) throws IOException {
        uploadView(stage, "Flight Manager", "../UI/myProfile.fxml");
    }
    public static void glidersView(Stage stage) throws IOException {
        uploadView(stage, "Flight Manager", "../UI/gliders.fxml");
    }

    public static void gliderCreationView(Stage stage) throws IOException {
        uploadView(stage, "Flight Manager", "../UI/gliderCreation.fxml");
    }

    public static void bookingView(Stage stage) throws IOException {
        uploadView(stage, "Flight Manager", "../UI/booking.fxml");
    }

    public static void myCompanyView(Stage stage) throws IOException{
        uploadView(stage, "Flight Manager", "../UI/company.fxml");
    }

    public static void addUserView(Stage stage) throws IOException {
        uploadView(stage, "Flight Manager", "../UI/addUser.fxml");
    }

    public static void bookingCreationView(Stage stage) throws IOException{
        uploadView(stage, "Flight Manager", "../UI/addBooking.fxml");
    }
    public static void updateUserView(Stage stage) throws IOException{
        uploadView(stage, "Flight Manager", "../UI/updateUser.fxml");
    }

    public static void gliderUpdate(Stage stage, String registrationGlider) throws IOException {
        loader = new FXMLLoader(Main.class.getResource("../UI/gliderUpdate.fxml"));
        Parent root = loader.load();
        stage.setTitle("Flight Manager");
        stage.setScene(new Scene(root));

        GliderUpdateController controller = loader.<GliderUpdateController>getController();
        controller.setInfos(registrationGlider);

        stage.show();
    }

    public static void EquipmentsView(Stage stage) throws IOException {
        uploadView(stage, "Flight Manager", "../UI/equipments.fxml");
    }

    public static Stage getPrimaryStage(){
        return primaryStage;
    }
}
