package Facade;

import DAO.AbstractFactory;
import Model.Company;
import Model.Glider;
import Model.User;

import java.util.ArrayList;

/**
 * The type Company facade.
 */
public class CompanyFacade {

        private static CompanyFacade instance = null;

        private AbstractFactory abstractFactory;

    /**
     * Instantiates a new Company facade.
     */
    public CompanyFacade() {
            this.abstractFactory = AbstractFactory.getInstance();
            this.abstractFactory.createCompanyDAO();
            this.abstractFactory.createGliderDAO();
            System.out.println("Company créé");
        }

    /**
     * Get infos company.
     *
     * @param idC the id c
     * @return the company
     */
    public Company getInfos(int idC){
            return abstractFactory.getCompanyDAO().infos(idC);
        }

    /**
     * Gets all gliders company.
     *
     * @param idC the id c
     * @return the all gliders company
     */
    public ArrayList<Glider> getAllGlidersCompany(int idC) {return abstractFactory.getDaoGlider().getGlidersFromCompany(idC);}

    }

