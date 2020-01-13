package Facade;

import DAO.AbstractFactory;
import Model.Booking;

import java.util.ArrayList;

/**
 * The type Booking facade.
 *
 * @author Lucas Paulin
 */
public class BookingFacade {

    /**
     * The AbstractFactory that create DAOs
     */
    private AbstractFactory af;

    /**
     * Constructor that instantiate the abstractFactory and create the BookingDAO
     */
    public BookingFacade() {
        this.af = AbstractFactory.getInstance();
        this.af.createBookingDAO();
        System.out.println("Booking DAO créé");
    }

    /**
     * Method that return a booking with a specific id.
     *
     * @param idBooking : The id of the booking searched.
     * @return the instance of booking if it's found, null if not.
     */
    public Booking getBooking(int idBooking){
        return this.af.getBookingDAO().getBooking(idBooking);
    }

    /**
     * Method that return an ArrayList of all the bookings of the userConnected.
     *
     * @return an ArrayList of bookings, empty if there is no one.
     */
    public ArrayList<Booking> getBookingUserConnected(){
        return this.getBookingByUser(LoginFacade.getInstance().getConnectedUser().getId());
    }

    /**
     * Method that return an ArrayList of all the bookings of a specific user.
     *
     * @param idUser : The id of the user.
     * @return an ArrayList of the bookings, empty if there is no one.
     */
    public ArrayList<Booking> getBookingByUser(int idUser){
        System.out.println(idUser);
        System.out.println(this.af.getBookingDAO().getBookingByUser(idUser));
        return this.af.getBookingDAO().getBookingByUser(idUser);

    }

    /**
     * Create a booking in the database.
     *
     * @param booking : the booking you want to create in the database.
     * @return true if booking has been created, false if not.
     */
    public boolean createBooking(Booking booking){
        return this.af.getBookingDAO().createBooking(booking);
    }


    /**
     * Delete a booking in the database, with a specific id.
     *
     * @param idBooking : the id of the booking you want to delete.
     */
    public void deleteBooking(int idBooking){
        this.af.getBookingDAO().deleteBooking(idBooking);
    }

    /**
     * Update a booking the database.
     *
     * @param booking the booking you want yo update, with new informations.
     * @return true if booking has been updated, false if not.
     */
    public boolean updateBooking(Booking booking){
        return this.af.getBookingDAO().updateBooking(booking);
    }
}
