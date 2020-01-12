package View.Controller;

import Facade.BookingFacade;
import Facade.LoginFacade;
import Model.Booking;
import Model.Glider;
import View.Main.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

import java.io.IOException;
import java.util.ArrayList;

public class BookingUIController {
    @FXML
    private GridPane gridBookings;
    @FXML
    private Button addBooking;

    private BookingFacade bf;

    public BookingUIController() {
        this.bf = new BookingFacade();
    }

    @FXML
    public void initialize(){
        ArrayList<Booking> bookings = this.bf.getBookingUserConnected();

        for(int i = 0; i < bookings.size(); i++) {
            gridBookings.addRow(0);

            Label l1 = new Label(bookings.get(i).getStartDate().toString());
            gridBookings.add(l1,0, i + 1);
            GridPane.setHalignment(l1, javafx.geometry.HPos.CENTER);

            Label l2 = new Label(bookings.get(i).getEndDate().toString());
            gridBookings.add(l2,1, i + 1);
            GridPane.setHalignment(l2, javafx.geometry.HPos.CENTER);

            Label l3 = new Label(Double.toString(bookings.get(i).getPrice()));
            gridBookings.add(l3,2, i + 1);
            GridPane.setHalignment(l3, javafx.geometry.HPos.CENTER);

            Label l4 = new Label(bookings.get(i).getState());
            gridBookings.add(l4,3, i + 1);
            GridPane.setHalignment(l4, javafx.geometry.HPos.CENTER);

            Button b2 = new Button("Update");
            int finalI = i;
            /*
            b2.setOnAction(event -> {
                updateBooking(bookings.get(finalI).getIdBooking());
            });
            */

            gridBookings.add(b2,6,i + 1);
            GridPane.setHalignment(b2, javafx.geometry.HPos.CENTER);

            Button b1 = new Button("X");

            b1.setOnAction(event -> {
                deleteBooking(bookings.get(finalI).getIdBooking());
            });

            gridBookings.add(b1,7,i + 1);
            GridPane.setHalignment(b1, javafx.geometry.HPos.CENTER);
        }
    }

    public void createBooking(ActionEvent event){
        try {
            Main.bookingCreationView(Main.getPrimaryStage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void deleteBooking(int idBooking){
        this.bf.deleteBooking(idBooking);
        try {
            Main.bookingView(Main.getPrimaryStage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
