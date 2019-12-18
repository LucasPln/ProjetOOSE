package DAO;

import Model.User;

import java.sql.Connection;

public interface UserDAO {

    User login(String login, String password);
}
