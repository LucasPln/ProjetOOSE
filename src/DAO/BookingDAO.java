package DAO;

import Model.Booking;

import java.util.ArrayList;

public interface BookingDAO {

    ArrayList<Booking> getBookingByUser(int idUser);
    boolean createBooking(Booking booking);
    void deleteBooking(int idBooking);
    Booking getBooking(int idBooking);
    boolean updateBooking(Booking booking);
}
