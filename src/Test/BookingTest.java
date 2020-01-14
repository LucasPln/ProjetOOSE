package Test;

import Model.Booking;

import java.util.Calendar;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

/**
 * The type Booking test.
 */
class BookingTest {

    /**
     * Gets start date test.
     */
    @org.junit.jupiter.api.Test
    void getStartDateTest() {
        Booking booking = new Booking(new Date(2020, Calendar.NOVEMBER,10));
        assertEquals(new Date(2020, Calendar.NOVEMBER,10), booking.getStartDate());
    }

    /**
     * Sets start date test.
     */
    @org.junit.jupiter.api.Test
    void setStartDateTest() {
        Booking booking = new Booking();
        booking.setStartDate(new Date(2020, Calendar.NOVEMBER,10));
        assertEquals(new Date(2020, Calendar.NOVEMBER,10), booking.getStartDate());
    }
}