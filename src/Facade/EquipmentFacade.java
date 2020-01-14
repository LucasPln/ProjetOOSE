package Facade;

import DAO.AbstractFactory;
import Model.*;

import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * The type Equipment facade.
 */
public class EquipmentFacade {

    private AbstractFactory abstractFactory;

    /**
     * Instantiates a new Equipment facade.
     */
    public EquipmentFacade(){
        this.abstractFactory = AbstractFactory.getInstance();
        this.abstractFactory.createEquipmentDAO();
        System.out.println("EquipmentDAO créé");
    }

    /**
     * Get all battery array list.
     *
     * @return the array list
     */
    public ArrayList<Battery> getAllBattery(){
        return this.abstractFactory.getDaoEquipement().getAllBattery();
    }

    /**
     * Get all gps array list.
     *
     * @return the array list
     */
    public ArrayList<GPS> getAllGPS(){
        return this.abstractFactory.getDaoEquipement().getAllGPS();
    }

    /**
     * Gets nb equipments.
     *
     * @param item the item
     * @return the nb equipments
     */
    public String getNbEquipments(String item) {
        User u = LoginFacade.getInstance().getConnectedUser();
        int IDCompany = u.getCompanyId();
        return this.abstractFactory.getDaoEquipement().getNbEquipments(item, IDCompany);
    }

    /**
     * Gets all.
     *
     * @param item the item
     * @return the all
     */
    public ArrayList<Equipment> getAll(String item) {
        User u = LoginFacade.getInstance().getConnectedUser();
        int IDCompany = u.getCompanyId();
        if(item.equals("gps")) {
            return this.abstractFactory.getDaoEquipement().getAllGpsByCompanyId(IDCompany);
        } else if(item.equals("parachute")) {
            return this.abstractFactory.getDaoEquipement().getAllParachutesByCompanyId(IDCompany);
        } else {
            return this.abstractFactory.getDaoEquipement().getAllBatteriesByCompanyId(IDCompany);
        }
    }

    /**
     * Create battery.
     *
     * @param wording        the wording
     * @param power          the power
     * @param lastRefillDate the last refill date
     */
    public void createBattery(String wording, int power, Date lastRefillDate) {
        User u = LoginFacade.getInstance().getConnectedUser();
        int IDCompany = u.getCompanyId();
        this.abstractFactory.getDaoEquipement().createBattery(wording, power, lastRefillDate, IDCompany);
    }

    /**
     * Create gps.
     *
     * @param wording          the wording
     * @param installedVersion the installed version
     */
    public void createGPS(String wording, String installedVersion) {
        User u = LoginFacade.getInstance().getConnectedUser();
        int IDCompany = u.getCompanyId();
        this.abstractFactory.getDaoEquipement().createGPS(wording, installedVersion, IDCompany);
    }

    /**
     * Create parachute.
     *
     * @param wording     the wording
     * @param renewalDate the renewal date
     * @param packageDate the package date
     */
    public void createParachute(String wording, Date renewalDate, Date packageDate) {
        User u = LoginFacade.getInstance().getConnectedUser();
        int IDCompany = u.getCompanyId();
        this.abstractFactory.getDaoEquipement().createParachute(wording,renewalDate, packageDate, IDCompany);
    }

    /**
     * Update gps boolean.
     *
     * @param id               the id
     * @param wording          the wording
     * @param installedVersion the installed version
     * @return the boolean
     */
    public boolean updateGPS(int id, String wording, String installedVersion) {
        try {
            this.abstractFactory.getDaoEquipement().updateGPS(id, wording, installedVersion);
        } catch (SQLException e) {
            System.out.println(e);
            return false;
        }
        return true;
    }

    /**
     * Update battery boolean.
     *
     * @param id             the id
     * @param wording        the wording
     * @param power          the power
     * @param lastRefillDate the last refill date
     * @return the boolean
     */
    public boolean updateBattery(int id, String wording, int power, Date lastRefillDate) {
        try {
            this.abstractFactory.getDaoEquipement().updateBattery(id, wording, power, lastRefillDate);
        } catch (SQLException e) {
            System.out.println(e);
            return false;
        }
        return true;
    }

    /**
     * Update parachute boolean.
     *
     * @param id          the id
     * @param wording     the wording
     * @param renewalDate the renewal date
     * @param packageDate the package date
     * @return the boolean
     */
    public boolean updateParachute(int id, String wording, Date renewalDate, Date packageDate) {
        try {
            this.abstractFactory.getDaoEquipement().updateParachute(id, wording, renewalDate, packageDate);
        } catch (SQLException e) {
            System.out.println(e);
            return false;
        }
        return true;
    }

    public void delete(String type, int idEquipement) {
        this.abstractFactory.getDaoEquipement().deleteEquipment(type, idEquipement);
    }

    public Parachute getParachute(int idEquipment) {
        return this.abstractFactory.getDaoEquipement().getParachute(idEquipment);
    }
}
