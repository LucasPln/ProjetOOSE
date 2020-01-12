package Facade;

import DAO.AbstractFactory;
import Model.Battery;
import Model.Equipment;
import Model.GPS;
import Model.User;

import java.sql.Date;
import java.util.ArrayList;

public class EquipmentFacade {

    private AbstractFactory abstractFactory;

    public EquipmentFacade(){
        this.abstractFactory = AbstractFactory.getInstance();
        this.abstractFactory.createEquipmentDAO();
        System.out.println("EquipmentDAO créé");
    }

    public ArrayList<Battery> getAllBattery(){
        return this.abstractFactory.getDaoEquipement().getAllBattery();
    }

    public ArrayList<GPS> getAllGPS(){
        return this.abstractFactory.getDaoEquipement().getAllGPS();
    }

    public String getNbEquipments(String item) {
        User u = LoginFacade.getInstance().getConnectedUser();
        int IDCompany = u.getCompanyId();
        return this.abstractFactory.getDaoEquipement().getNbEquipments(item, IDCompany);
    }

    public ArrayList<Equipment> getAll(String item) {
        User u = LoginFacade.getInstance().getConnectedUser();
        int IDCompany = u.getCompanyId();
        if(item.equals("gps")) {
            return this.abstractFactory.getDaoEquipement().getAllGpsByCompanyId(IDCompany);
        } else if(item.equals("parachute")) {
            return this.abstractFactory.getDaoEquipement().getAllParachutesByCompanyId(IDCompany);
        } else {
            return this.abstractFactory.getDaoEquipement().getAllBatteriesByCompanyId(IDCompany);
        }
    }

    public void createBattery(String wording, int power, Date lastRefillDate) {
        User u = LoginFacade.getInstance().getConnectedUser();
        int IDCompany = u.getCompanyId();
        this.abstractFactory.getDaoEquipement().createBattery(wording, power, lastRefillDate, IDCompany);
    }
}
