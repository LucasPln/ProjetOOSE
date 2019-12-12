package DAO;

public class FactoryDAOSQL extends AbstractFactory {

    protected FactoryDAOSQL(){

    }

    @Override
    public void createUserDAO() {
        this.userDAO = new UserDAOSQL();
    }


}
