package View.Controller;

import Facade.ReadUserFacade;
import Model.User;
import View.Main.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

import java.io.IOException;
import java.util.ArrayList;


/**
 * The type Read user ui controller.
 * @author ANDREU Paola
 */
public class ReadUserUIController {
    @FXML
    private GridPane gridUsers;

    @FXML
    private ChoiceBox choiceBox;
    private ReadUserFacade readUserFacade;

    /**
     * Instantiates a new Read user ui controller.
     */
    public ReadUserUIController(){
        this.readUserFacade = new ReadUserFacade();
    }

    /**
     * Initialize.
     */
    @FXML
    public void initialize() {

        ArrayList<User> users = this.readUserFacade.getUsersByRole("Monitor");
        for(int i = 0; i < users.size(); i++) {

            Label l1 = new Label(users.get(i).getFirstName());
            gridUsers.add(l1,0, i + 1);
            GridPane.setHalignment(l1, javafx.geometry.HPos.CENTER);

            Label l2 = new Label(users.get(i).getLastName());
            gridUsers.add(l2,1, i + 1);
            GridPane.setHalignment(l2, javafx.geometry.HPos.CENTER);

            Label l3 = new Label(users.get(i).getBirthDate());
            gridUsers.add(l3,2, i + 1);
            GridPane.setHalignment(l3, javafx.geometry.HPos.CENTER);

            Label l4 = new Label(users.get(i).getAdress());
            gridUsers.add(l4,3, i + 1);
            GridPane.setHalignment(l4, javafx.geometry.HPos.CENTER);

            Label l5 = new Label(users.get(i).getPostalCode());
            gridUsers.add(l5,4, i + 1);
            GridPane.setHalignment(l5, javafx.geometry.HPos.CENTER);

            Label l6 = new Label(users.get(i).getMail());
            gridUsers.add(l6,5, i + 1);
            GridPane.setHalignment(l6, javafx.geometry.HPos.CENTER);

            Label l7 = new Label(users.get(i).getTel());
            gridUsers.add(l7,6, i + 1);
            GridPane.setHalignment(l7, javafx.geometry.HPos.CENTER);

            Button b1 = new Button("X");
            int j=i;
            b1.setOnAction(event -> {
                deleteUser(users.get(j).getId());
            });
            gridUsers.add(b1,7,i + 1);
            GridPane.setHalignment(b1, javafx.geometry.HPos.CENTER);


        }
    }

    /**
     * Gets users.
     */
    @FXML
    public void getUsers() {
        gridUsers.getChildren().clear();
        initLabels();
        String role = choiceBox.getValue().toString();
        ArrayList<User> users = this.readUserFacade.getUsersByRole(role);
        for(int i = 0; i < users.size(); i++) {

            Label l1 = new Label(users.get(i).getFirstName());
            gridUsers.add(l1,0, i + 1);
            GridPane.setHalignment(l1, javafx.geometry.HPos.CENTER);

            Label l2 = new Label(users.get(i).getLastName());
            gridUsers.add(l2,1, i + 1);
            GridPane.setHalignment(l2, javafx.geometry.HPos.CENTER);

            Label l3 = new Label(users.get(i).getBirthDate());
            gridUsers.add(l3,2, i + 1);
            GridPane.setHalignment(l3, javafx.geometry.HPos.CENTER);

            Label l4 = new Label(users.get(i).getAdress());
            gridUsers.add(l4,3, i + 1);
            GridPane.setHalignment(l4, javafx.geometry.HPos.CENTER);

            Label l5 = new Label(users.get(i).getPostalCode());
            gridUsers.add(l5,4, i + 1);
            GridPane.setHalignment(l5, javafx.geometry.HPos.CENTER);

            Label l6 = new Label(users.get(i).getMail());
            gridUsers.add(l6,5, i + 1);
            GridPane.setHalignment(l6, javafx.geometry.HPos.CENTER);

            Label l7 = new Label(users.get(i).getTel());
            gridUsers.add(l7,6, i + 1);
            GridPane.setHalignment(l7, javafx.geometry.HPos.CENTER);

            Button b1 = new Button("X");
            int j=i;
            b1.setOnAction(event -> {
                deleteUser(users.get(j).getId());
            });
            gridUsers.add(b1,7,i + 1);
            GridPane.setHalignment(b1, javafx.geometry.HPos.CENTER);

        }
    }

    /**
     * Init labels.
     */
    public void initLabels(){
        Label l1= new Label("Firstname");
        gridUsers.add(l1,0, 0);
        GridPane.setHalignment(l1, javafx.geometry.HPos.CENTER);

        Label l2 = new Label("Lastname");
        gridUsers.add(l2,1, 0);
        GridPane.setHalignment(l2, javafx.geometry.HPos.CENTER);

        Label l3 = new Label("Birth Date");
        gridUsers.add(l3,2, 0);
        GridPane.setHalignment(l3, javafx.geometry.HPos.CENTER);

        Label l4 = new Label("Adress");
        gridUsers.add(l4,3, 0);
        GridPane.setHalignment(l4, javafx.geometry.HPos.CENTER);

        Label l5 = new Label("Postal Code");
        gridUsers.add(l5,4, 0);
        GridPane.setHalignment(l5, javafx.geometry.HPos.CENTER);

        Label l6 = new Label("Mail");
        gridUsers.add(l6,5, 0);
        GridPane.setHalignment(l6, javafx.geometry.HPos.CENTER);

        Label l7 = new Label("Tel");
        gridUsers.add(l7,6, 0);
        GridPane.setHalignment(l7, javafx.geometry.HPos.CENTER);

        Label l8 = new Label("Delete");
        gridUsers.add(l8,7, 0);
        GridPane.setHalignment(l8, javafx.geometry.HPos.CENTER);


    }
    /**
     * Return view.
     *
     * @param actionEvent the action event
     */
    public void returnView(ActionEvent actionEvent) {
        try {
            Main.homeView(Main.getPrimaryStage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Delete the user selected and reload the UI.
     * Used by the "X" buttons.
     *
     * @param id : id of the user selected.
     */
    public void deleteUser(int id){
        readUserFacade.deleteUser(id);
        try {
            Main.usersView(Main.getPrimaryStage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
