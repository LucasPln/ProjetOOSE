package DAO;

import Model.Booking;

import java.util.ArrayList;

/**
 * The interface Booking dao.
 *
 * @author Lucas Paulin
 */
public interface BookingDAO {

    /**
     * Method that search in the database the list of all the bookings of a specific user.
     *
     * @param idUser : The id of the user.
     * @return an ArrayList of the bookings, empty if there is no one.
     */
    ArrayList<Booking> getBookingByUser(int idUser);

    /**
     * Create a booking in the database.
     *
     * @param booking : the booking you want to create in the database.
     * @return true if booking has been created, false if not.
     */
    boolean createBooking(Booking booking, int idCompany);

    /**
     * Delete a booking in the database, with a specific id.
     *
     * @param idBooking : the id of the booking you want to delete.
     */
    void deleteBooking(int idBooking);

    /**
     * Method that search a booking with a specific id in the database.
     *
     * @param idBooking : The id of the booking searched.
     * @return the instance of booking if it's found, null if not.
     */
    Booking getBooking(int idBooking);

    /**
     * Update a booking the database.
     *
     * @param booking the booking you want yo update, with new informations.
     * @return true if booking has been updated, false if not.
     */
    boolean updateBooking(Booking booking, int idCompany);
}
