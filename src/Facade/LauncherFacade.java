package Facade;

import DAO.AbstractFactory;
import Model.Launcher;
import Model.Plane;
import Model.User;
import Model.Wincher;

import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * @author Hugo Niort
 */
public class LauncherFacade {
    private AbstractFactory abstractFactory;

    /**
     * Instantiates a new Launcher facade.
     */
    public LauncherFacade() {
        this.abstractFactory = AbstractFactory.getInstance();
        this.abstractFactory.createLauncherDAO();
    }

    /**
     * Get all plane array list.
     *
     * @return the array list
     */
    public ArrayList<Plane> getAllPlane(){
        return this.abstractFactory.getDaoLauncher().getAllPlane();
    }

    /**
     * Get all wincher array list.
     *
     * @return the array list
     */
    public ArrayList<Wincher> getAllWincher(){
        return this.abstractFactory.getDaoLauncher().getAllWincher();
    }

    /**
     * Gets nb launchers.
     *
     * @param type the type
     * @return the nb launchers
     */
    public String getNbLaunchers(String type) {
        User u = LoginFacade.getInstance().getConnectedUser();
        int IDCompany = u.getCompanyId();
        return this.abstractFactory.getDaoLauncher().getNbLaunchers(type, IDCompany);
    }

    /**
     * Gets all.
     *
     * @param type the type
     * @return the all
     */
    public ArrayList<Launcher> getAll(String type) {
        User u = LoginFacade.getInstance().getConnectedUser();
        int IDCompany = u.getCompanyId();
        if(type.equals("winch")) {
            return this.abstractFactory.getDaoLauncher().getAllWinchesByCompanyId(IDCompany);
        } else if(type.equals("plane")) {
            return this.abstractFactory.getDaoLauncher().getAllPlanesByCompanyId(IDCompany);
        }
        return null;
    }

    /**
     * Create plane.
     *
     * @param registrationPlane the registration plane
     * @param maxLaunchWeight   the max launch weight
     * @param acquisitionDate   the acquisition date
     * @param renewalDate       the renewal date
     * @param span              the span
     * @param maxWeight         the max weight
     */
    public void createPlane(String registrationPlane, int maxLaunchWeight, Date acquisitionDate, Date renewalDate, int span, int maxWeight) {
        User u = LoginFacade.getInstance().getConnectedUser();
        int IDCompany = u.getCompanyId();
        this.abstractFactory.getDaoLauncher().createPlane(registrationPlane, maxLaunchWeight, IDCompany, acquisitionDate, renewalDate, span, maxWeight);
    }

    /**
     * Create winch.
     *
     * @param registrationWinch the registration winch
     * @param acquisitionDate   the acquisition date
     * @param renewalDate       the renewal date
     * @param maxLaunchWeight   the max launch weight
     * @param ropeRenewal       the rope renewal
     * @param parachuteRenewal  the parachute renewal
     * @param maxWeight         the max weight
     */
    public void createWinch(String registrationWinch, Date acquisitionDate, Date renewalDate, int maxLaunchWeight, Date ropeRenewal, Date parachuteRenewal, int maxWeight) {
        User u = LoginFacade.getInstance().getConnectedUser();
        int IDCompany = u.getCompanyId();
        this.abstractFactory.getDaoLauncher().createWinch(registrationWinch,  IDCompany, acquisitionDate, renewalDate, maxLaunchWeight, ropeRenewal, parachuteRenewal, maxWeight);
    }

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
     */
    public void updateWinch(String registrationWinch, Date acquisitionDate, Date renewalDate, int maxLaunchWeight, Date ropeRenewal, Date parachuteRenewal, int maxWeight) {
        try {
            this.abstractFactory.getDaoLauncher().updateWinch(registrationWinch, acquisitionDate, renewalDate, maxLaunchWeight, ropeRenewal, parachuteRenewal, maxWeight);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * Update plane.
     *
     * @param registrationPlane the registration plane
     * @param maxLaunchWeight   the max launch weight
     * @param acquisitionDate   the acquisition date
     * @param renewalDate       the renewal date
     * @param span              the span
     * @param maxWeight         the max weight
     */
    public void updatePlane(String registrationPlane, int maxLaunchWeight, Date acquisitionDate, Date renewalDate, int span, int maxWeight) {
        try {
            this.abstractFactory.getDaoLauncher().updatePlane(registrationPlane, maxLaunchWeight, acquisitionDate, renewalDate, span, maxWeight);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deletePlane(String idPlane){
        this.abstractFactory.getDaoLauncher().deletePlane(idPlane);
    }

    public Plane getPlane(String registPlane){
        return this.abstractFactory.getDaoLauncher().getPlane(registPlane);
    }
}
