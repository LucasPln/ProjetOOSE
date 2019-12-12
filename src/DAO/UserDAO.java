package DAO;

import Model.User;

import java.sql.Connection;

public interface UserDAO {

    Connection connexion();

    User login(String login, String password);
}
