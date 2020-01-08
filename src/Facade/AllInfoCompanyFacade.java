package Facade;

import DAO.AbstractFactory;
import Model.Company;

public class AllInfoCompanyFacade {
    private AbstractFactory abstractFactory;

    public AllInfoCompanyFacade() {
        this.abstractFactory = AbstractFactory.getInstance();
        this.abstractFactory.createCompanyDAO();
        System.out.println("CompanyDAO créé");
    }

    public boolean infos(int id){
        Company company = this.abstractFactory.getCompanyDAO().infos(id);
        return company != null;
    }
}
