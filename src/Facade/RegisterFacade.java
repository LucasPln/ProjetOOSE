package Facade;

import DAO.AbstractFactory;

public class RegisterFacade {

    private AbstractFactory abstractFactory;

    public RegisterFacade() {
        this.abstractFactory = AbstractFactory.getInstance();
    }

    public boolean addUser() {
        return this.abstractFactory.getUserDAO().addUser();
    }
}
