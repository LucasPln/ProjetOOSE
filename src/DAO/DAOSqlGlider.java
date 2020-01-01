package DAO;

import Model.Glider;
import Model.User;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class DAOSqlGlider implements DAOGlider {


    @Override
    public ArrayList<Glider> getGlidersFromCompany(int idCompany) {
        Glider glider;
        ArrayList<Glider> gliders = new ArrayList<Glider>();
        try {
            Connection con = FactoryDAOSQL.connection;
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select * from glider where idCompany = " + idCompany);


            while(rs.next()){
                glider = new Glider(
                        rs.getString(1),
                        rs.getInt(2),
                        rs.getInt(3),
                        rs.getDate(5),
                        rs.getDate(6)
                );
                System.out.println("Glider créé");
                gliders.add(glider);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return gliders;
    }
}
