package DAO;

import Model.Launcher;
import Model.Plane;
import Model.Wincher;

import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;

public interface DAOLauncher {

    ArrayList<Plane> getAllPlane();

    ArrayList<Wincher> getAllWincher();

    String getNbLaunchers(String type, int idCompany);

    ArrayList<Launcher> getAllWinchesByCompanyId(int idCompany);

    ArrayList<Launcher> getAllPlanesByCompanyId(int idCompany);

    void createPlane(String registrationPlane, int maxLaunchWeight, int idCompany, Date acquisitionDate, Date renewalDate, int span, int maxWeight);

    void createWinch(String registrationWinch, int idCompany, Date acquisitionDate, Date renewalDate, int maxLaunchWeight, Date ropeRenewal, Date parachuteRenewal, int maxWeight);

    void updateWinch(String registrationWinch, Date acquisitionDate, Date renewalDate, int maxLaunchWeight, Date ropeRenewal, Date parachuteRenewal, int maxWeight) throws SQLException;
}
