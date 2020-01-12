package DAO;

import Model.Booking;

import java.util.ArrayList;

public interface BookingDAO {

    ArrayList<Booking> getBookingByUser(int idUser);
    boolean createBooking(Booking booking);
    void deleteBooking(int idBooking);
}
