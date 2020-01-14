package DAO;

import Model.Glider;
import Model.Monitor;
import Model.User;

import java.sql.Connection;
import java.util.ArrayList;

/**
 * The interface User dao.
 */
public interface UserDAO {

    /**
     * Login user.
     *
     * @param login    the login
     * @param password the password
     * @param role     the role
     * @return the user
     */
    User login(String login, String password,String role);

    /**
     * Add user boolean.
     *
     * @param firstname   the firstname
     * @param lastname    the lastname
     * @param phoneNumber the phone number
     * @param email       the email
     * @param adress      the adress
     * @param postalCode  the postal code
     * @param dateBirth   the date birth
     * @param role        the role
     * @return the boolean
     */
    boolean addUser(String firstname,String lastname,String phoneNumber,String email,String adress,String postalCode,String dateBirth,String role);

    /**
     * Update boolean.
     *
     * @param id          the id
     * @param firstname   the firstname
     * @param lastname    the lastname
     * @param phoneNumber the phone number
     * @param email       the email
     * @param adress      the adress
     * @param postalCode  the postal code
     * @param dateBirth   the date birth
     * @return the boolean
     */
    boolean update(int id,String firstname,String lastname,String phoneNumber,String email,String adress,String postalCode,String dateBirth);

    /**
     * Gets all monitor.
     *
     * @return the all monitor
     */
    ArrayList<User> getAllMonitor();

    /**
     * Delete boolean.
     *
     * @param idUser the id user
     * @return the boolean
     */
    boolean delete(int idUser);

    /**
     * Gets user.
     *
     * @param idUser the id user
     * @param role   the role
     * @return the user
     */
    public User getUser(int idUser, String role);
}

