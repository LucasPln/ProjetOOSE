package Facade;

import DAO.AbstractFactory;
import Model.Glider;
import Model.User;

import java.util.ArrayList;

public class ReadUserFacade {

    private AbstractFactory abstractFactory;

    public ReadUserFacade() {
        this.abstractFactory = AbstractFactory.getInstance();
    }

}
