package DAO;

import Model.Launcher;
import Model.Plane;
import Model.Wincher;

import java.util.ArrayList;

public interface DAOLauncher {

    ArrayList<Plane> getAllPlane();

    ArrayList<Wincher> getAllWincher();

    String getNbLaunchers(String type, int idCompany);

    ArrayList<Launcher> getAllWinchesByCompanyId(int idCompany);

    ArrayList<Launcher> getAllPlanesByCompanyId(int idCompany);
}
