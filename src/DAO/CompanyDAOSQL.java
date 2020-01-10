package DAO;

import Model.Company;

import java.sql.*;

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

    }
