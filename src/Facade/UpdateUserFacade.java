package Facade;

import DAO.AbstractFactory;

/**
 * The type Update user facade.
 */
public class UpdateUserFacade {

    private AbstractFactory abstractFactory;

    /**
     * Instantiates a new Update user facade.
     */
    public UpdateUserFacade() {
        this.abstractFactory = AbstractFactory.getInstance();
        this.abstractFactory.createCompanyMemberDAO();
        this.abstractFactory.createMonitorDAO();
        this.abstractFactory.createLicensedDAO();
        this.abstractFactory.createAdminDAO();
    }

    /**
     * Update user boolean.
     *
     * @param id          the id
     * @param firstname   the firstname
     * @param lastname    the lastname
     * @param phoneNumber the phone number
     * @param email       the email
     * @param adress      the adress
     * @param postalCode  the postal code
     * @param dateBirth   the date birth
     * @return the boolean
     */
    public boolean updateUser(int id,String firstname,String lastname,String phoneNumber,String email,String adress,String postalCode,String dateBirth) {
        return this.abstractFactory.getUserDAO().update(id,firstname,lastname,phoneNumber,email,adress,postalCode,dateBirth);
    }

    /**
     * Update admin boolean.
     *
     * @param idUser    the id user
     * @param dateAdmin the date admin
     * @return the boolean
     */
    public boolean updateAdmin(int idUser,String dateAdmin) {

        return this.abstractFactory.getAdminDAO().update(idUser,dateAdmin);
    }

    /**
     * Update company member boolean.
     *
     * @param idUser   the id user
     * @param position the position
     * @return the boolean
     */
    public boolean updateCompanyMember(int idUser,String position) {
        return this.abstractFactory.getCompanyMemberDAO().update(idUser,position);
    }

    /**
     * Update monitor boolean.
     *
     * @param idUser     the id user
     * @param flightHour the flight hour
     * @return the boolean
     */
    public boolean updateMonitor(int idUser,String flightHour) {
        return this.abstractFactory.getMonitorDAO().update(idUser,flightHour);
    }

    /**
     * Update licensed boolean.
     *
     * @param idUser     the id user
     * @param flightHour the flight hour
     * @return the boolean
     */
    public boolean updateLicensed(int idUser,String flightHour) {
        return this.abstractFactory.getLicensedDAO().update(idUser,flightHour);
    }

}
