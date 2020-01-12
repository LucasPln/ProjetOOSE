package DAO;

import Model.Booking;

import java.sql.*;
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

    @Override
    public boolean createBooking(Booking booking) {
        int rs = -1;
        try {
            Connection con = FactoryDAOSQL.connection;
            Statement stmt=con.createStatement();
            if(booking.getDiploma() == -1){
                rs = stmt.executeUpdate("INSERT INTO `booking`(`startDate`, `endDate`, `price`, `state`, `battery`, `gps`, `launcherPlane`, `launcherWinch`, `launchman`, `customer`, `flightManager`, `diploma`, `idGlider`, `company`) " +
                        "VALUES ('"+booking.getStartDate()+"','"+booking.getEndDate()+"','"+booking.getPrice()+"','"+booking.getState()+"',"+booking.getBattery()+",'"+booking.getGps()+"','"+booking.getLauncherPlane()+"','" +booking.getLauncherWinch() +"', '"+booking.getLaunchman()+"','"+ booking.getCustomer()+"','"+booking.getFlightManager()+"',null, '"+ booking.getGlider()+"', 1)");

            } else {
                rs = stmt.executeUpdate("INSERT INTO `booking`(`startDate`, `endDate`, `price`, `state`, `battery`, `gps`, `launcherPlane`, `launcherWinch`, `launchman`, `customer`, `flightManager`, `diploma`, `idGlider`, `company`) " +
                        "VALUES ('"+booking.getStartDate()+"','"+booking.getEndDate()+"','"+booking.getPrice()+"','"+booking.getState()+"',"+booking.getBattery()+",'"+booking.getGps()+"','"+booking.getLauncherPlane()+"','" +booking.getLauncherWinch() +"', '"+booking.getLaunchman()+"','"+ booking.getCustomer()+"','"+booking.getFlightManager()+"','"+booking.getDiploma() +"', '"+ booking.getGlider()+"', 1)");

            }

            if(rs == 1) {
                return true;
            }else{
                return false;
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return false;
    }

    @Override
    public void deleteBooking(int idBooking) {
        Connection con = FactoryDAOSQL.connection;
        try {
            PreparedStatement stmt=con.prepareStatement("DELETE FROM booking WHERE idBooking='" + idBooking + "'");
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
