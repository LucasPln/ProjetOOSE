package Facade;

import DAO.AbstractFactory;
import Model.Company;
import Model.Equipment;
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

    public ArrayList<Equipment> getAllParachutesCompany(int idC){return abstractFactory.getDaoEquipement().getAllParachutesByCompanyId(idC);}
    public ArrayList<Equipment> getAllGPSCompany(int idC){return abstractFactory.getDaoEquipement().getAllGpsByCompanyId(idC);}
    public ArrayList<Equipment> getAllBatteriesCompany(int idC){return abstractFactory.getDaoEquipement().getAllBatteriesByCompanyId(idC);}


    public boolean createCompany(Company cpy){return this.abstractFactory.getCompanyDAO().createCompany(cpy);}

    public ArrayList<Company> getAllCompanies(){return this.abstractFactory.getCompanyDAO().getAllCompanies();}
    public boolean deleteCompany(int id){return this.abstractFactory.getCompanyDAO().deleteCompany(id);}

    }

