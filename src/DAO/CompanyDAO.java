package DAO;

import Model.Company;
import Model.Glider;

import java.sql.Connection;
import java.util.ArrayList;

/**
 * The interface Company dao.
 *
 * @author Arnaud Maësboyer
 */
public interface CompanyDAO {
    /**
     * Infos company.
     *
     * @param id the id
     * @return the company
     */
    Company infos(int id);

    /**
     * Create company boolean.
     *
     * @param cpy the cpy
     * @return the boolean
     */
    Boolean createCompany(Company cpy);

    /**
     * Gets all companies.
     *
     * @return the all companies
     */
    ArrayList<Company> getAllCompanies();

    /**
     * Delete company boolean.
     *
     * @param id the id
     * @return the boolean
     */
    Boolean deleteCompany(int id);
}
