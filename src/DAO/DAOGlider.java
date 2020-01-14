package DAO;

import Model.Glider;

import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * @author Hugo Niort
 */
public interface DAOGlider {
    /**
     * Gets all gliders.
     *
     * @return the all gliders
     */
    ArrayList<Glider> getAllGliders();

    /**
     * Gets gliders from company.
     *
     * @param idCompany the id company
     * @return the gliders from company
     */
    ArrayList<Glider> getGlidersFromCompany(int idCompany);

    /**
     * Create glider.
     *
     * @param registrationID  the registration id
     * @param span            the span
     * @param maxWeight       the max weight
     * @param acquisitionDate the acquisition date
     * @param reviewDate      the review date
     * @param companyID       the company id
     * @throws SQLException the sql exception
     */
    void createGlider(String registrationID, float span, float maxWeight, java.sql.Date acquisitionDate,  java.sql.Date reviewDate, int companyID) throws SQLException;

    /**
     * Delete glider.
     *
     * @param id the id
     */
    void deleteGlider(String id);

    /**
     * Gets glider.
     *
     * @param registrationGlider the registration glider
     * @return the glider
     */
    Glider getGlider(String registrationGlider);

    /**
     * Update glider.
     *
     * @param registrationID the registration id
     * @param span           the span
     * @param maxWeight      the max weight
     * @param reviewDate     the review date
     * @throws SQLException the sql exception
     */
    void updateGlider(String registrationID, float span, float maxWeight, java.sql.Date reviewDate) throws SQLException;
}
