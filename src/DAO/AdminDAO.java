package DAO;

import Model.User;

import java.util.ArrayList;

/**
 * The interface Admin dao.
 */
public interface AdminDAO {
    /**
     * Update boolean.
     *
     * @param idUser    the id user
     * @param dateAdmin the date admin
     * @return the boolean
     */
    boolean update(int idUser,String dateAdmin);

    /**
     * Gets all admin.
     *
     * @return the all admin
     */
    ArrayList<User> getAllAdmin();
}
