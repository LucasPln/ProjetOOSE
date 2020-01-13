package Facade;

import DAO.AbstractFactory;
import Model.Launcher;
import Model.Plane;
import Model.User;
import Model.Wincher;

import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;

public class LauncherFacade {
    private AbstractFactory abstractFactory;

    public LauncherFacade() {
        this.abstractFactory = AbstractFactory.getInstance();
        this.abstractFactory.createLauncherDAO();
    }

    public ArrayList<Plane> getAllPlane(){
        return this.abstractFactory.getDaoLauncher().getAllPlane();
    }

    public ArrayList<Wincher> getAllWincher(){
        return this.abstractFactory.getDaoLauncher().getAllWincher();
    }

    public String getNbLaunchers(String type) {
        User u = LoginFacade.getInstance().getConnectedUser();
        int IDCompany = u.getCompanyId();
        return this.abstractFactory.getDaoLauncher().getNbLaunchers(type, IDCompany);
    }

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

    public void createPlane(String registrationPlane, int maxLaunchWeight, Date acquisitionDate, Date renewalDate, int span, int maxWeight) {
        User u = LoginFacade.getInstance().getConnectedUser();
        int IDCompany = u.getCompanyId();
        this.abstractFactory.getDaoLauncher().createPlane(registrationPlane, maxLaunchWeight, IDCompany, acquisitionDate, renewalDate, span, maxWeight);
    }

    public void createWinch(String registrationWinch, Date acquisitionDate, Date renewalDate, int maxLaunchWeight, Date ropeRenewal, Date parachuteRenewal, int maxWeight) {
        User u = LoginFacade.getInstance().getConnectedUser();
        int IDCompany = u.getCompanyId();
        this.abstractFactory.getDaoLauncher().createWinch(registrationWinch,  IDCompany, acquisitionDate, renewalDate, maxLaunchWeight, ropeRenewal, parachuteRenewal, maxWeight);
    }

    public void updateWinch(String registrationWinch, Date acquisitionDate, Date renewalDate, int maxLaunchWeight, Date ropeRenewal, Date parachuteRenewal, int maxWeight) {
        try {
            this.abstractFactory.getDaoLauncher().updateWinch(registrationWinch, acquisitionDate, renewalDate, maxLaunchWeight, ropeRenewal, parachuteRenewal, maxWeight);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
