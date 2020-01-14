package Facade;

import DAO.AbstractFactory;
import Model.Company;

/**
 * The type Name company facade.
 */
public class NameCompanyFacade {
    private AbstractFactory abstractFactory;

    /**
     * Instantiates a new Name company facade.
     */
    public NameCompanyFacade() {
        this.abstractFactory = AbstractFactory.getInstance();
        this.abstractFactory.createCompanyDAO();
        System.out.println("CompanyDAO créé");
    }

    /**
     * Infos boolean.
     *
     * @param id the id
     * @return the boolean
     */
    public boolean infos(int id){
        Company company = this.abstractFactory.getCompanyDAO().infos(id);
        return company != null;
    }
}
