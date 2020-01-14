package DAO;

import Model.User;

import java.util.ArrayList;

/**
 * The interface Licensed dao.
 * @author ANDREU Paola
 */
public interface LicensedDAO {
    /**
     * Update boolean.
     *
     * @param idUser     the id user
     * @param flightHour the flight hour
     * @return the boolean
     */
    boolean update(int idUser,String flightHour);

    /**
     * Gets all licensed.
     *
     * @return the all licensed
     */
    ArrayList<User> getAllLicensed();
}
