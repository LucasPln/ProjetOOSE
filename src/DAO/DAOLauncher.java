package DAO;

import Model.Launcher;
import Model.Plane;
import Model.Wincher;

import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * The interface Dao launcher.
 */
public interface DAOLauncher {

    /**
     * Gets all plane.
     *
     * @return the all plane
     */
    ArrayList<Plane> getAllPlane();

    /**
     * Gets all wincher.
     *
     * @return the all wincher
     */
    ArrayList<Wincher> getAllWincher();

    /**
     * Gets nb launchers.
     *
     * @param type      the type
     * @param idCompany the id company
     * @return the nb launchers
     */
    String getNbLaunchers(String type, int idCompany);

    /**
     * Gets all winches by company id.
     *
     * @param idCompany the id company
     * @return the all winches by company id
     */
    ArrayList<Launcher> getAllWinchesByCompanyId(int idCompany);

    /**
     * Gets all planes by company id.
     *
     * @param idCompany the id company
     * @return the all planes by company id
     */
    ArrayList<Launcher> getAllPlanesByCompanyId(int idCompany);

    /**
     * Create plane.
     *
     * @param registrationPlane the registration plane
     * @param maxLaunchWeight   the max launch weight
     * @param idCompany         the id company
     * @param acquisitionDate   the acquisition date
     * @param renewalDate       the renewal date
     * @param span              the span
     * @param maxWeight         the max weight
     */
    void createPlane(String registrationPlane, int maxLaunchWeight, int idCompany, Date acquisitionDate, Date renewalDate, int span, int maxWeight);

    /**
     * Create winch.
     *
     * @param registrationWinch the registration winch
     * @param idCompany         the id company
     * @param acquisitionDate   the acquisition date
     * @param renewalDate       the renewal date
     * @param maxLaunchWeight   the max launch weight
     * @param ropeRenewal       the rope renewal
     * @param parachuteRenewal  the parachute renewal
     * @param maxWeight         the max weight
     */
    void createWinch(String registrationWinch, int idCompany, Date acquisitionDate, Date renewalDate, int maxLaunchWeight, Date ropeRenewal, Date parachuteRenewal, int maxWeight);

    /**
     * Update winch.
     *
     * @param registrationWinch the registration winch
     * @param acquisitionDate   the acquisition date
     * @param renewalDate       the renewal date
     * @param maxLaunchWeight   the max launch weight
     * @param ropeRenewal       the rope renewal
     * @param parachuteRenewal  the parachute renewal
     * @param maxWeight         the max weight
     * @throws SQLException the sql exception
     */
    void updateWinch(String registrationWinch, Date acquisitionDate, Date renewalDate, int maxLaunchWeight, Date ropeRenewal, Date parachuteRenewal, int maxWeight) throws SQLException;

    /**
     * Update plane.
     *
     * @param registrationPlane the registration plane
     * @param maxLaunchWeight   the max launch weight
     * @param acquisitionDate   the acquisition date
     * @param renewalDate       the renewal date
     * @param span              the span
     * @param maxWeight         the max weight
     * @throws SQLException the sql exception
     */
    void updatePlane(String registrationPlane, int maxLaunchWeight, Date acquisitionDate, Date renewalDate, int span, int maxWeight) throws SQLException;

    void deletePlane(String idPlane);
}
