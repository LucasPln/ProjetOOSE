package DAO;

import Model.Battery;
import Model.GPS;

import java.util.ArrayList;

public interface DAOEquipement {

    ArrayList<Battery> getAllBattery();

    ArrayList<GPS> getAllGPS();

    String getNbEquipments(String item, int idCompany);
}
