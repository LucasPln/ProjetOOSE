package DAO;

import Model.User;

import java.util.ArrayList;

/**
 * The interface Monitor dao.
 *
 * @author ANDREU Paola
 */
public interface MonitorDAO {
    /**
     * Update boolean.
     *
     * @param idUser     the id user
     * @param flightHour the flight hour
     * @return the boolean
     */
    boolean update(int idUser,String flightHour);

    /**
     * Gets all monitor.
     *
     * @return the all monitor
     */
    ArrayList<User> getAllMonitor();
}
