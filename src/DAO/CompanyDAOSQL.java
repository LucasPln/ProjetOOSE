package DAO;

import Model.Company;

import java.sql.*;

public class CompanyDAOSQL implements CompanyDAO {
    @Override
    public Connection connexion() {
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/flightmanager?autoReconnect=true&useSSL=false","root","");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

        return con;
    }

    @Override
    public Company infos(String id) {
        Company company = null;
        try {
            Connection con = this.connexion();
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select * from company where id='"+id+"';");


            while(rs.next()){
                /// ajouter infos rs.getString(3)
                company = new Company();
                System.out.println("Company créée");
            }

            con.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return company;
    }
}
