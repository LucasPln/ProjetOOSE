package DAO;

import Model.Booking;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class BookingDAOMySQL implements BookingDAO {
    @Override
    public ArrayList<Booking> getBookingByUser(int idUser) {
        ArrayList<Booking> listBooking = new ArrayList<>();

        Connection con = FactoryDAOSQL.connection;
        Statement stmt= null;

        try {
            stmt = con.createStatement();
            ResultSet rs=stmt.executeQuery("select * from booking where customer="+idUser+";");

            while(rs.next()){
                Booking booking = new Booking(
                        rs.getInt(1),
                        rs.getDate(2),
                        rs.getDate(3),
                        rs.getDouble(4),
                        rs.getString(5),
                        rs.getInt(6),
                        rs.getInt(7),
                        rs.getString(8),
                        rs.getString(9),
                        rs.getInt(10),
                        rs.getInt(11),
                        rs.getInt(12),
                        rs.getInt(13),
                        rs.getString(14),
                        rs.getInt(15)
                );
                System.out.println("Booking créé");
                listBooking.add(booking);
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }

        return listBooking;


    }
}
