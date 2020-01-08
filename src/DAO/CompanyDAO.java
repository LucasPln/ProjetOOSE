package DAO;

import Model.Company;

import java.sql.Connection;

public interface CompanyDAO {
    Connection connexion();

    Company infos(int id);
}
