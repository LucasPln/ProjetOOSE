package Facade;

import DAO.AbstractFactory;
import Model.Launcher;
import Model.Plane;
import Model.User;
import Model.Wincher;

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
}
