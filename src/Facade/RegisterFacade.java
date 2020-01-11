package Facade;

import DAO.AbstractFactory;

public class RegisterFacade {

    private AbstractFactory abstractFactory;

    public RegisterFacade() {
        this.abstractFactory = AbstractFactory.getInstance();
    }

    public boolean addUser(String firstname,String lastname,String phoneNumber,String email,String adress,String postalCode,String dateBirth,String role) {
        return this.abstractFactory.getUserDAO().addUser(firstname,lastname,phoneNumber,email,adress,postalCode,dateBirth,role);
    }
}
