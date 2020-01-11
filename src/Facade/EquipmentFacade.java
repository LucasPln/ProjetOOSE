package Facade;

import DAO.AbstractFactory;
import Model.Battery;

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
}
