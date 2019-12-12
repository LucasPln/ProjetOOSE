package DAO;

public abstract class AbstractFactory {

    protected UserDAO userDAO;

    private static FactoryDAOSQL instance = null;

    protected AbstractFactory(){

    }

    public static FactoryDAOSQL getInstance(){
        if(instance == null) instance = new FactoryDAOSQL();
        return instance;
    }

    public abstract void createUserDAO();

    public UserDAO getUserDAO() {
        return userDAO;
    }

    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }
}
