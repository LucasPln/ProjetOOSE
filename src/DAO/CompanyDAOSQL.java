package DAO;

import Model.Company;
import Model.Glider;

import java.sql.*;
import java.util.ArrayList;

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
            rs = stmt.executeUpdate("INSERT INTO `company`(`name`) " + "VALUES ('"+cpy.getName()+"');");


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
    @Override
    public ArrayList<Company> getAllCompanies() {
        ArrayList<Company> listCompany = new ArrayList<>();
        try {
            Connection con = FactoryDAOSQL.connection;
            Statement stmt= null;
            stmt = con.createStatement();
            ResultSet rs=stmt.executeQuery("select * from company;");

            while(rs.next()){

                Company c = new Company(
                        rs.getInt(1),
                        rs.getString(2)

                );


                System.out.println("Company créé");
                listCompany.add(c);
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }

        return listCompany;
    }

    @Override
    public Boolean deleteCompany(int id) {
        try {
            Connection con = FactoryDAOSQL.connection;
            Statement stmt=con.createStatement();
            int rs = stmt.executeUpdate("DELETE FROM `company` WHERE idCompany="+id);
            if (rs >= 1){
                System.out.println("Company supprimé");
                return true;
            }else{
                System.out.println("Company PAS supprimé");
                return false;
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
    }