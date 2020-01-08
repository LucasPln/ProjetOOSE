package View.Controller;

import Facade.BookingFacade;
import Facade.LoginFacade;
import Model.Booking;
import javafx.fxml.FXML;

import java.util.ArrayList;

public class BookingUIController {
    private BookingFacade bf;

    public BookingUIController() {
        this.bf = new BookingFacade();
        this.getBookingUserConnected();
    }

    @FXML
    public void initialize(){
    }

    public ArrayList<Booking> getBookingUserConnected(){
        return this.getBookingByUser(LoginFacade.getInstance().getConnectedUser().getId());
    }

    public ArrayList<Booking> getBookingByUser(int idUser){
        this.bf.getBookingByUser(idUser);
        return null;
    }


}
