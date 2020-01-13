package DAO;

import Model.Booking;

import java.sql.*;
import java.util.ArrayList;

public class BookingDAOMySQL implements BookingDAO {

    /**
     * Method that search in the database the list of all the bookings of a specific user.
     * @param idUser : The id of the user.
     * @return an ArrayList of the bookings, empty if there is no one.
     */
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

    /**
     * Create a booking in the database.
     * @param booking : the booking you want to create in the database.
     * @return true if booking has been created, false if not.
     */
    @Override
    public boolean createBooking(Booking booking) {
        int rs = -1;
        try {
            Connection con = FactoryDAOSQL.connection;
            Statement stmt=con.createStatement();
            if(booking.getDiploma() == -1){
                rs = stmt.executeUpdate("INSERT INTO `booking`(`startDate`, `endDate`, `price`, `state`, `battery`, `gps`, `launcherPlane`, `launcherWinch`, `launchman`, `customer`, `flightManager`, `diploma`, `idGlider`, `company`) " +
                        "VALUES ('"+booking.getStartDate()+"','"+booking.getEndDate()+"','"+booking.getPrice()+"','"+booking.getState()+"',"+booking.getBattery()+",'"+booking.getGps()+"',"+booking.getLauncherPlane()+"," +booking.getLauncherWinch() +", '"+booking.getLaunchman()+"','"+ booking.getCustomer()+"','"+booking.getFlightManager()+"',null, '"+ booking.getGlider()+"', 1)");

            } else {
                rs = stmt.executeUpdate("INSERT INTO `booking`(`startDate`, `endDate`, `price`, `state`, `battery`, `gps`, `launcherPlane`, `launcherWinch`, `launchman`, `customer`, `flightManager`, `diploma`, `idGlider`, `company`) " +
                        "VALUES ('"+booking.getStartDate()+"','"+booking.getEndDate()+"','"+booking.getPrice()+"','"+booking.getState()+"',"+booking.getBattery()+",'"+booking.getGps()+"',"+booking.getLauncherPlane()+"," +booking.getLauncherWinch() +", '"+booking.getLaunchman()+"','"+ booking.getCustomer()+"','"+booking.getFlightManager()+"','"+booking.getDiploma() +"', '"+ booking.getGlider()+"', 1)");

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

    /**
     * Delete a booking in the database, with a specific id.
     * @param idBooking : the id of the booking you want to delete.
     */
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

    /**
     * Method that search a booking with a specific id in the database.
     * @param idBooking : The id of the booking searched.
     * @return the instance of booking if it's found, null if not.
     */
    @Override
    public Booking getBooking(int idBooking) {
        Booking booking = null;

        Connection con = FactoryDAOSQL.connection;
        Statement stmt= null;

        try {
            stmt = con.createStatement();
            ResultSet rs=stmt.executeQuery("select * from booking where idBooking="+idBooking+";");

            if(rs.next()){
                booking = new Booking(
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
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }

        return booking;
    }

    /**
     * Update a booking the database.
     * @param booking the booking you want yo update, with new informations.
     * @return true if booking has been updated, false if not.
     */
    @Override
    public boolean updateBooking(Booking booking) {
        int rs = -1;
        try {
            Connection con = FactoryDAOSQL.connection;
            PreparedStatement stmt=null;
            if(booking.getDiploma() == -1){
                stmt = con.prepareStatement("UPDATE `booking` SET `startDate` = ?, `endDate` = ?, `price` = ?, `state` = ?, `battery` = ?, `gps` = ?, `launcherPlane` = ?, `launcherWinch` = ?, `launchman` = ?, `customer` = ?, `flightManager` = ?, `diploma` = null, `idGlider` = ?, `company` = ? WHERE idBooking = "+ booking.getIdBooking()+"; ");
                stmt.setDate(1, (java.sql.Date)booking.getStartDate());
                stmt.setDate(2, (java.sql.Date)booking.getEndDate());
                stmt.setDouble(3, booking.getPrice());
                stmt.setString(4, booking.getState());
                stmt.setInt(5, booking.getBattery());
                stmt.setInt(6, booking.getGps());
                stmt.setString(7, booking.getLauncherPlane());
                stmt.setString(8, booking.getLauncherWinch());
                stmt.setInt(9, booking.getLaunchman());
                stmt.setInt(10, booking.getCustomer());
                stmt.setInt(11, booking.getFlightManager());
                stmt.setString(12, booking.getGlider());
                stmt.setInt(13, booking.getCompany());


            } else {
                stmt = con.prepareStatement("UPDATE `booking` SET `startDate` = ?, `endDate` = ?, `price` = ?, `state` = ?, `battery` = ?, `gps` = ?, `launcherPlane` = ?, `launcherWinch` = ?, `launchman` = ?, `customer` = ?, `flightManager` = ?, `diploma` = ?, `idGlider` = ?, `company` = ? WHERE idBooking = "+ booking.getIdBooking()+"; ");
                stmt.setDate(1, (java.sql.Date)booking.getStartDate());
                stmt.setDate(2, (java.sql.Date)booking.getEndDate());
                stmt.setDouble(3, booking.getPrice());
                stmt.setString(4, booking.getState());
                stmt.setInt(5, booking.getBattery());
                stmt.setInt(6, booking.getGps());
                stmt.setString(7, booking.getLauncherPlane());
                stmt.setString(8, booking.getLauncherWinch());
                stmt.setInt(9, booking.getLaunchman());
                stmt.setInt(10, booking.getCustomer());
                stmt.setInt(11, booking.getFlightManager());
                stmt.setInt(12, booking.getDiploma());
                stmt.setString(13, booking.getGlider());
                stmt.setInt(14, booking.getCompany());

            }

            rs = stmt.executeUpdate();

            return rs != 0;

        } catch (SQLException e) {
            System.out.println(e);
        }
        return false;
    }
}
