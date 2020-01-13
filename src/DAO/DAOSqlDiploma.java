package DAO;

import Model.Diploma;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * The type Dao sql diploma.
 */
public class DAOSqlDiploma implements DAODiploma {
    @Override
    public ArrayList<Diploma> getAllDiploma() {
        ArrayList<Diploma> listDiploma = new ArrayList<>();

        Connection con = FactoryDAOSQL.connection;
        Statement stmt= null;

        try {
            stmt = con.createStatement();
            ResultSet rs=stmt.executeQuery("select * from diploma;");

            while(rs.next()){

                Diploma diploma = new Diploma(
                        rs.getInt(1),
                        rs.getDate(2),
                        rs.getDate(3),
                        rs.getInt(4),
                        rs.getInt(5),
                        rs.getInt(6),
                        rs.getString(7),
                        rs.getInt(8),
                        rs.getInt(9),
                        rs.getInt(10)

                );


                System.out.println("Diploma créé");
                listDiploma.add(diploma);
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }

        return listDiploma;
    }
}
