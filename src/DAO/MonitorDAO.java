package DAO;

import Model.User;

import java.util.ArrayList;

public interface MonitorDAO {
    boolean update(int idUser,String flightHour);
    ArrayList<User> getAllMonitor();
}
