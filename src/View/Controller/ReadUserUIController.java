package View.Controller;

import Facade.ReadUserFacade;
import Model.User;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

import java.util.ArrayList;

public class ReadUserUIController {
    @FXML
    private GridPane gridUsers;

    @FXML
    private ChoiceBox choiceBox;
    private ReadUserFacade readUserFacade;


    public ReadUserUIController(){
        this.readUserFacade = new ReadUserFacade();
    }

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

        }
    }

    @FXML
    public void getUsers() {
        newGridPane();
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

        }
    }
    public void newGridPane(){
        ObservableList<Node> fils = this.gridUsers.getChildren();
        for (int i=8;i< fils.size();i++){
            System.out.println(fils.get(i).toString());
            this.gridUsers.getChildren().remove(fils.get(i));

        }
    }

}
