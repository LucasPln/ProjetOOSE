package Facade;

import DAO.AbstractFactory;
import Model.Company;
import Model.User;

public class CompanyFacade {

        private static CompanyFacade instance = null;

        private AbstractFactory abstractFactory;

        public CompanyFacade() {
            this.abstractFactory = AbstractFactory.getInstance();
            this.abstractFactory.createCompanyMemberDAO();
            System.out.println("UserDAO créé");
        }

        public Company getInfos(int idC){
            return getInfos(idC);
        }

    }

