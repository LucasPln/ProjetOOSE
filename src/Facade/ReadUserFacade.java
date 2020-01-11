package Facade;

import DAO.AbstractFactory;
import Model.Glider;
import Model.Monitor;
import Model.User;

import java.util.ArrayList;

public class ReadUserFacade {

    private AbstractFactory abstractFactory;

    public ReadUserFacade() {
        this.abstractFactory = AbstractFactory.getInstance();
        this.abstractFactory.createUserDAO();
    }

    public ArrayList<User> getAllMonitor(){
        return this.abstractFactory.getUserDAO().getAllMonitor();
    }

}
