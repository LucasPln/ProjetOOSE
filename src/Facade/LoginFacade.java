package Facade;

import DAO.AbstractFactory;
import Model.User;

/**
 * The type Login facade.
 */
public class LoginFacade {

    private static LoginFacade instance = null;

    private AbstractFactory abstractFactory;
    private User userConnected;

    private LoginFacade() {
        this.abstractFactory = AbstractFactory.getInstance();
        this.abstractFactory.createUserDAO();
        System.out.println("UserDAO créé");
    }

    /**
     * Get instance login facade.
     *
     * @return the login facade
     */
    public static LoginFacade getInstance(){
        if(instance == null) instance = new LoginFacade();
        return instance;
    }

    /**
     * Login boolean.
     *
     * @param login    the login
     * @param password the password
     * @param role     the role
     * @return the boolean
     */
    public boolean login(String login, String password,String role){

        userConnected = this.abstractFactory.getUserDAO().login(login, password,role);
        return (userConnected != null) && (userConnected.getAbstractRole() != null);
    }

    /**
     * Get connected user name string.
     *
     * @return the string
     */
    public String getConnectedUserName(){
        return this.userConnected.getLogin();
    }

    /**
     * Get connected user user.
     *
     * @return the user
     */
    public User getConnectedUser(){
        return this.userConnected.getUser();
    }

    /**
     * Logout.
     */
    public void logout(){
        userConnected=null;
    }

}
