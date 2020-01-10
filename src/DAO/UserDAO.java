package DAO;

import Model.Glider;
import Model.User;

import java.sql.Connection;
import java.util.ArrayList;

public interface UserDAO {

    User login(String login, String password,String role);
    boolean addUser();
}
