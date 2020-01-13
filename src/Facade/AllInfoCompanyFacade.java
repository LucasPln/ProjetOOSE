package Facade;

import DAO.AbstractFactory;
import Model.Company;

/**
 * The type All info company facade.
 */
public class AllInfoCompanyFacade {
    private AbstractFactory abstractFactory;

    /**
     * Instantiates a new All info company facade.
     */
    public AllInfoCompanyFacade() {
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
