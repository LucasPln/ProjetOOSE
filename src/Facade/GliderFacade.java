package Facade;

import DAO.AbstractFactory;
import Model.Glider;
import Model.Monitor;
import Model.User;

import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;

/**
 * The type Glider facade.
 */
public class GliderFacade {
    private AbstractFactory abstractFactory;

    /**
     * Instantiates a new Glider facade.
     */
    public GliderFacade() {
        this.abstractFactory = AbstractFactory.getInstance();
        this.abstractFactory.createGliderDAO();
        System.out.println("GliderDAO créé");
    }

    /**
     * Get all gliders array list.
     *
     * @return the array list
     */
    public ArrayList<Glider> getAllGliders(){
        return this.abstractFactory.getDaoGlider().getAllGliders();
    }

    /**
     * Gets gliders from company.
     *
     * @return the gliders from company
     */
    public ArrayList<Glider> getGlidersFromCompany() {
        User u = LoginFacade.getInstance().getConnectedUser();
        int idCompany = u.getCompanyId();
        ArrayList<Glider> gliders = this.abstractFactory.getDaoGlider().getGlidersFromCompany(idCompany);
        return gliders;
    }

    /**
     * Create glider boolean.
     *
     * @param registrationID the registration id
     * @param span           the span
     * @param maxWeight      the max weight
     * @param reviewDate     the review date
     * @return the boolean
     */
    public boolean createGlider(String registrationID, float span, float maxWeight, java.sql.Date reviewDate) {
        User u = LoginFacade.getInstance().getConnectedUser();
        int IDCompany = u.getCompanyId();
        try {
            this.abstractFactory.getDaoGlider().createGlider(registrationID, span, maxWeight, new java.sql.Date(Calendar.getInstance().getTime().getTime()), reviewDate, IDCompany);
        } catch (SQLException e) {
            System.out.println(e);
            return false;
        }
        return true;
    }

    /**
     * Delete glider.
     *
     * @param id the id
     */
    public void deleteGlider(String id) {
        this.abstractFactory.getDaoGlider().deleteGlider(id);
    }

    /**
     * Gets glider.
     *
     * @param registrationGlider the registration glider
     * @return the glider
     */
    public Glider getGlider(String registrationGlider) {
        return this.abstractFactory.getDaoGlider().getGlider(registrationGlider);
    }

    /**
     * Update glider boolean.
     *
     * @param idGlider   the id glider
     * @param span       the span
     * @param maxWeight  the max weight
     * @param reviewDate the review date
     * @return the boolean
     */
    public boolean updateGlider(String idGlider, float span, float maxWeight, Date reviewDate) {
        try {
            this.abstractFactory.getDaoGlider().updateGlider(idGlider, span, maxWeight,reviewDate);
        } catch (SQLException e) {
            System.out.println(e);
            return false;
        }
        return true;
    }
}
