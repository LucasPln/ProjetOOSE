package Facade;

import DAO.AbstractFactory;

public class UpdateUserFacade {

    private AbstractFactory abstractFactory;

    public UpdateUserFacade() {
        this.abstractFactory = AbstractFactory.getInstance();
        this.abstractFactory.createCompanyMemberDAO();
        this.abstractFactory.createMonitorDAO();
        this.abstractFactory.createLicensedDAO();
        this.abstractFactory.createAdminDAO();
    }

    public boolean updateUser(int id,String firstname,String lastname,String phoneNumber,String email,String adress,String postalCode,String dateBirth) {
        return this.abstractFactory.getUserDAO().update(id,firstname,lastname,phoneNumber,email,adress,postalCode,dateBirth);
    }
    public boolean updateAdmin(int idUser,String dateAdmin) {

        return this.abstractFactory.getAdminDAO().update(idUser,dateAdmin);
    }
    public boolean updateCompanyMember(int idUser,String position) {
        return this.abstractFactory.getCompanyMemberDAO().update(idUser,position);
    }
    public boolean updateMonitor(int idUser,String flightHour) {
        return this.abstractFactory.getMonitorDAO().update(idUser,flightHour);
    }
    public boolean updateLicensed(int idUser,String flightHour) {
        return this.abstractFactory.getLicensedDAO().update(idUser,flightHour);
    }

}
