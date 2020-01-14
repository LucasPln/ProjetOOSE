package Facade;

import DAO.AbstractFactory;

/**
 * The type Register facade.
 * @author ANDREU Paola
 */
public class RegisterFacade {

    private AbstractFactory abstractFactory;

    /**
     * Instantiates a new Register facade.
     */
    public RegisterFacade() {
        this.abstractFactory = AbstractFactory.getInstance();
    }

    /**
     * Add user boolean.
     *
     * @param firstname   the firstname
     * @param lastname    the lastname
     * @param phoneNumber the phone number
     * @param email       the email
     * @param adress      the adress
     * @param postalCode  the postal code
     * @param dateBirth   the date birth
     * @param role        the role
     * @return the boolean
     */
    public boolean addUser(String firstname,String lastname,String phoneNumber,String email,String adress,String postalCode,String dateBirth,String role) {
        return this.abstractFactory.getUserDAO().addUser(firstname,lastname,phoneNumber,email,adress,postalCode,dateBirth,role);
    }
}
