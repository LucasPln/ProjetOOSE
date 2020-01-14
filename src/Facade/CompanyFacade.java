package Facade;

import DAO.AbstractFactory;
import Model.Company;
import Model.Equipment;
import Model.Glider;
import Model.User;

import java.util.ArrayList;

/**
 * The type Company facade.
 *
 * @author Arnaud Maësboyer
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
            this.abstractFactory.createEquipmentDAO();
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

    /**
     * Get all parachutes company array list.
     *
     * @param idC the id c
     * @return the array list
     */
    public ArrayList<Equipment> getAllParachutesCompany(int idC){return abstractFactory.getDaoEquipement().getAllParachutesByCompanyId(idC);}

    /**
     * Get all gps company array list.
     *
     * @param idC the id c
     * @return the array list
     */
    public ArrayList<Equipment> getAllGPSCompany(int idC){return abstractFactory.getDaoEquipement().getAllGpsByCompanyId(idC);}

    /**
     * Get all batteries company array list.
     *
     * @param idC the id c
     * @return the array list
     */
    public ArrayList<Equipment> getAllBatteriesCompany(int idC){return abstractFactory.getDaoEquipement().getAllBatteriesByCompanyId(idC);}


    /**
     * Create company boolean.
     *
     * @param cpy the cpy
     * @return the boolean
     */
    public boolean createCompany(Company cpy){return this.abstractFactory.getCompanyDAO().createCompany(cpy);}

    /**
     * Get all companies array list.
     *
     * @return the array list
     */
    public ArrayList<Company> getAllCompanies(){return this.abstractFactory.getCompanyDAO().getAllCompanies();}

    /**
     * Delete company boolean.
     *
     * @param id the id
     * @return the boolean
     */
    public boolean deleteCompany(int id){return this.abstractFactory.getCompanyDAO().deleteCompany(id);}

    }

