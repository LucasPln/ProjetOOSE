package DAO;

import Model.Battery;
import Model.Equipment;
import Model.GPS;
import Model.Parachute;

import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * @author Hugo Niort
 */
public interface DAOEquipement {

    /**
     * Gets all battery.
     *
     * @return the all battery
     */
    ArrayList<Battery> getAllBattery();

    /**
     * Gets all gps.
     *
     * @return the all gps
     */
    ArrayList<GPS> getAllGPS();

    /**
     * Gets nb equipments.
     *
     * @param item      the item
     * @param idCompany the id company
     * @return the nb equipments
     */
    String getNbEquipments(String item, int idCompany);

    /**
     * Gets all gps by company id.
     *
     * @param idCompany the id company
     * @return the all gps by company id
     */
    ArrayList<Equipment> getAllGpsByCompanyId(int idCompany);

    /**
     * Gets all parachutes by company id.
     *
     * @param idCompany the id company
     * @return the all parachutes by company id
     */
    ArrayList<Equipment> getAllParachutesByCompanyId(int idCompany);

    /**
     * Gets all batteries by company id.
     *
     * @param idCompany the id company
     * @return the all batteries by company id
     */
    ArrayList<Equipment> getAllBatteriesByCompanyId(int idCompany);

    /**
     * Delete equipment.
     *
     * @param item the item
     * @param id   the id
     */
    void deleteEquipment(String item, int id);

    /**
     * Create battery.
     *
     * @param wording        the wording
     * @param power          the power
     * @param lastRefillDate the last refill date
     * @param idCompany      the id company
     */
    void createBattery(String wording, int power, Date lastRefillDate, int idCompany);

    /**
     * Create gps.
     *
     * @param wording          the wording
     * @param installedVersion the installed version
     * @param idCompany        the id company
     */
    void createGPS(String wording, String installedVersion, int idCompany);

    /**
     * Create parachute.
     *
     * @param wording     the wording
     * @param renewalDate the renewal date
     * @param packageDate the package date
     * @param idCompany   the id company
     */
    void createParachute(String wording, Date renewalDate, Date packageDate, int idCompany);

    /**
     * Update parachute.
     *
     * @param id          the id
     * @param wording     the wording
     * @param renewalDate the renewal date
     * @param packageDate the package date
     * @throws SQLException the sql exception
     */
    void updateParachute(int id, String wording, Date renewalDate, Date packageDate) throws SQLException;

    /**
     * Update battery.
     *
     * @param id             the id
     * @param wording        the wording
     * @param power          the power
     * @param lastRefillDate the last refill date
     * @throws SQLException the sql exception
     */
    void updateBattery(int id, String wording, int power, Date lastRefillDate) throws SQLException;

    /**
     * Update gps.
     *
     * @param id               the id
     * @param wording          the wording
     * @param installedVersion the installed version
     * @throws SQLException the sql exception
     */
    void updateGPS(int id, String wording, String installedVersion) throws SQLException;

    Parachute getParachute(int idEquipment);

    GPS getGPS(int idEquipment);

    Battery getBattery(int idEquipment);
}
