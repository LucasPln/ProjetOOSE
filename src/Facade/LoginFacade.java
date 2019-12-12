package Facade;

import DAO.AbstractFactory;
import Model.User;

public class LoginFacade {

    private AbstractFactory abstractFactory;
    private User userConnected;

    public LoginFacade() {
        this.abstractFactory = AbstractFactory.getInstance();
        this.abstractFactory.createUserDAO();
        System.out.println("UserDAO créé");
    }

    public boolean login(String login, String password){


        User user = this.abstractFactory.getUserDAO().login(login, password);
        return user != null;
    }

    public String getConnectedUserName(){
        return this.userConnected.getLogin();
    }
}
