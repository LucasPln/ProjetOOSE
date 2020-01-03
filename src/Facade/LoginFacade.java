package Facade;

import DAO.AbstractFactory;
import Model.User;

public class LoginFacade {

    private static LoginFacade instance = null;

    private AbstractFactory abstractFactory;
    private User userConnected;

    private LoginFacade() {
        this.abstractFactory = AbstractFactory.getInstance();
        this.abstractFactory.createUserDAO();
        System.out.println("UserDAO créé");
    }

    public static LoginFacade getInstance(){
        if(instance == null) instance = new LoginFacade();
        return instance;
    }

    public boolean login(String login, String password,String role){

        userConnected = this.abstractFactory.getUserDAO().login(login, password,role);
        return (userConnected != null) && (userConnected.getAbstractRole() != null);
    }

    public String getConnectedUserName(){
        return this.userConnected.getLogin();
    }
    public User getConnectedUser(){
        return this.userConnected.getUser();
    }
}
