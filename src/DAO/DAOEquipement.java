package DAO;

import Model.Battery;
import Model.Equipment;
import Model.GPS;
import Model.Parachute;

import java.util.ArrayList;

public interface DAOEquipement {

    ArrayList<Battery> getAllBattery();

    ArrayList<GPS> getAllGPS();

    String getNbEquipments(String item, int idCompany);

    ArrayList<Equipment> getAllGpsByCompanyId(int idCompany);

    ArrayList<Equipment> getAllParachutesByCompanyId(int idCompany);

    ArrayList<Equipment> getAllBatteriesByCompanyId(int idCompany);
}
