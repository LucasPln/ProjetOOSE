package Facade;

import DAO.AbstractFactory;
import Model.Glider;
import Model.Monitor;
import Model.User;

import java.util.ArrayList;

/**
 * The type Read user facade.
 */
public class ReadUserFacade {

    private AbstractFactory abstractFactory;

    /**
     * Instantiates a new Read user facade.
     */
    public ReadUserFacade() {
        this.abstractFactory = AbstractFactory.getInstance();
        this.abstractFactory.createUserDAO();
        this.abstractFactory.createMonitorDAO();
        this.abstractFactory.createLicensedDAO();
        this.abstractFactory.createAdminDAO();
        this.abstractFactory.createCompanyMemberDAO();
    }

    /**
     * Get all monitor array list.
     *
     * @return the array list
     */
    public ArrayList<User> getAllMonitor(){
        return this.abstractFactory.getUserDAO().getAllMonitor();
    }

    /**
     * Gets users by role.
     *
     * @param role the role
     * @return the users by role
     */
    public ArrayList<User> getUsersByRole(String role) {
        if (role.equals("Admin")) {
            return this.abstractFactory.getAdminDAO().getAllAdmin();
        } else if (role.equals("Company Member")) {
            return this.abstractFactory.getCompanyMemberDAO().getAllCompanyMember();
        } else if (role.equals("Licensed")) {
            return this.abstractFactory.getLicensedDAO().getAllLicensed();
        } else {//role Monitor
            return this.abstractFactory.getMonitorDAO().getAllMonitor();
        }
    }
}
