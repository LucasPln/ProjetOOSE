package Facade;

import DAO.AbstractFactory;
import Model.Plane;

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


}
