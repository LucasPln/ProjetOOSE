package DAO;

import Model.Glider;
import Model.User;

import java.sql.Connection;
import java.util.ArrayList;

public interface UserDAO {

    User login(String login, String password,String role);
    boolean addUser(String firstname,String lastname,String phoneNumber,String email,String adress,String country,String postalCode,String dateBirth,String role);
}
