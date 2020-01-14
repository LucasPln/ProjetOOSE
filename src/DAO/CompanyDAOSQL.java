package DAO;

import Model.Company;

import java.sql.*;

/**
 * The type Company daosql.
 */
public class CompanyDAOSQL implements CompanyDAO {
    @Override
    public Company infos(int id) {
        Company company = null;
        try {
            Connection con = FactoryDAOSQL.connection;
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select * from company where idCompany='"+id+"';");


            while(rs.next()){
                company = new Company(
                rs.getInt(1),
                rs.getString(2));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return company;
    }

    @Override
    public Boolean createCompany(Company cpy) {
        int rs = -1;
        try {
            Connection con = FactoryDAOSQL.connection;
            Statement stmt=con.createStatement();

            rs = stmt.executeUpdate("INSERT INTO `company`(`name`) " + "VALUES ('"+cpy.getName()+"'");


            if(rs == 1) {
                return true;
            }else{
                return false;
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return false;
    }

}