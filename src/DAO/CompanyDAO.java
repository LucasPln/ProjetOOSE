package DAO;

import Model.Company;

import java.sql.Connection;

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
}
