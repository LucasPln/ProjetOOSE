package Facade;

import DAO.AbstractFactory;
import Model.Booking;

import java.util.ArrayList;

public class BookingFacade {
    private AbstractFactory af;

    public BookingFacade() {
        this.af = AbstractFactory.getInstance();
        this.af.createBookingDAO();
        System.out.println("Booking DAO créé");
    }

    public ArrayList<Booking> getBookingUserConnected(){
        return this.getBookingByUser(LoginFacade.getInstance().getConnectedUser().getId());
    }

    public ArrayList<Booking> getBookingByUser(int idUser){
        System.out.println(idUser);
        System.out.println(this.af.getBookingDAO().getBookingByUser(idUser));
        return this.af.getBookingDAO().getBookingByUser(idUser);

    }

    public boolean createBooking(Booking booking){
        return this.af.getBookingDAO().createBooking(booking);
    }

    public void deleteBooking(int idBooking){
        this.af.getBookingDAO().deleteBooking(idBooking);
    }
}
