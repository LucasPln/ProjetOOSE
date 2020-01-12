package Facade;

import DAO.AbstractFactory;
import Model.Company;
import Model.Glider;
import Model.User;

import java.util.ArrayList;

public class CompanyFacade {

        private static CompanyFacade instance = null;

        private AbstractFactory abstractFactory;

        public CompanyFacade() {
            this.abstractFactory = AbstractFactory.getInstance();
            this.abstractFactory.createCompanyDAO();
            this.abstractFactory.createGliderDAO();
            System.out.println("Company créé");
        }

        public Company getInfos(int idC){
            return abstractFactory.getCompanyDAO().infos(idC);
        }

        public ArrayList<Glider> getAllGlidersCompany(int idC) {return abstractFactory.getDaoGlider().getGlidersFromCompany(idC);}

    }

