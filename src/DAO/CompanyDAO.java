package DAO;

import Model.Company;
import Model.Glider;

import java.sql.Connection;
import java.util.ArrayList;

/**
 * The interface Company dao.
 */
public interface CompanyDAO {
    /**
     * Infos company.
     *
     * @param id the id
     * @return the company
     */
    Company infos(int id);
    Boolean createCompany(Company cpy);
    ArrayList<Company> getAllCompanies();
    Boolean deleteCompany(int id);
}
