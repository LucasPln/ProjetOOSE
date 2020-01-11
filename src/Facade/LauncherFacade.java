package Facade;

import DAO.AbstractFactory;
import Model.Plane;
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

}
