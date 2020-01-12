package DAO;

import Model.User;

import java.util.ArrayList;

public interface LicensedDAO {
    boolean update(int idUser,String flightHour);
    ArrayList<User> getAllLicensed();
}
