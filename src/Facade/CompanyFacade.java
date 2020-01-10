package Facade;

import DAO.AbstractFactory;
import Model.Company;
import Model.User;

public class CompanyFacade {

        private static CompanyFacade instance = null;

        private AbstractFactory abstractFactory;

        public CompanyFacade() {
            this.abstractFactory = AbstractFactory.getInstance();
            this.abstractFactory.createCompanyDAO();
            System.out.println("Company créé");
        }

        public Company getInfos(int idC){
            return abstractFactory.getCompanyDAO().infos(idC);
        }

    }

