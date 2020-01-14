package DAO;

import Model.User;

import java.util.ArrayList;

/**
 * The interface Company member dao.
 * @author ANDREU Paola
 */
public interface CompanyMemberDAO {
    /**
     * Update boolean.
     *
     * @param idUser   the id user
     * @param position the position
     * @return the boolean
     */
    boolean update(int idUser,String position);

    /**
     * Gets all company member.
     *
     * @return the all company member
     */
    ArrayList<User> getAllCompanyMember();
}
