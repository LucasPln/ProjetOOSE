package DAO;

import Model.Battery;
import Model.Equipment;
import Model.GPS;
import Model.Parachute;

import java.sql.Date;
import java.util.ArrayList;

public interface DAOEquipement {

    ArrayList<Battery> getAllBattery();

    ArrayList<GPS> getAllGPS();

    String getNbEquipments(String item, int idCompany);

    ArrayList<Equipment> getAllGpsByCompanyId(int idCompany);

    ArrayList<Equipment> getAllParachutesByCompanyId(int idCompany);

    ArrayList<Equipment> getAllBatteriesByCompanyId(int idCompany);

    void deleteEquipment(String item, int id);

    void createBattery(String wording, int power, Date lastRefillDate, int idCompany);

    void createGPS(String wording, String installedVersion, int idCompany);

    void createParachute(String wording, Date renewalDate, Date packageDate, int idCompany);
}
