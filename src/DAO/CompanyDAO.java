package DAO;

import Model.Company;

import java.sql.Connection;

public interface CompanyDAO {
    Company infos(int id);
}
