package Facade;

import DAO.AbstractFactory;

public class UpdateUserFacade {

    private AbstractFactory abstractFactory;

    public UpdateUserFacade() {
        this.abstractFactory = AbstractFactory.getInstance();
    }

    public boolean updateUser(int id,String firstname,String lastname,String phoneNumber,String email,String adress,String postalCode,String dateBirth) {
        return this.abstractFactory.getUserDAO().update(id,firstname,lastname,phoneNumber,email,adress,postalCode,dateBirth);
    }
    public boolean updateAdmin(int idUser,String dateAdmin) {
        return true;
    }
    public boolean updateCompanyMember(int idUser,String idCompany,String position) {
        return true;
    }
    public boolean updateMonitor(int idUser,String idCompany,String flightHour) {
        return true;
    }
    public boolean updateLicensed(int idUser,String flightHour) {
        return true;
    }

}
