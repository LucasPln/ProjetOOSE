package DAO;

import Model.User;

import java.util.ArrayList;

public interface AdminDAO {
    boolean update(int idUser,String dateAdmin);
    ArrayList<User> getAllAdmin();
}
