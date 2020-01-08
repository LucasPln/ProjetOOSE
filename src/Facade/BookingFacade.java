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

    public ArrayList<Booking> getBookingByUser(int idUser){
        return null;

    }
}
