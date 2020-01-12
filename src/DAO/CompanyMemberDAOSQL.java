package DAO;

import Model.*;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class CompanyMemberDAOSQL implements CompanyMemberDAO {

    public int getIdCompany(int idUser) {
            User user = null;
            int companyId = 0;
            try {
                Connection con = FactoryDAOSQL.connection;
                Statement stmt=con.createStatement();


                ResultSet rs=stmt.executeQuery("select * from user where idUser ="+idUser);

                int id =0;
                companyId= 0;
                while(rs.next()){

                        id =  rs.getInt(1);
                    ;
                    System.out.println("id Recup");
                }
                AbstractRole abstractRole=null;
                Connection con2 = FactoryDAOSQL.connection;
                Statement stmt2=con2.createStatement();
                ResultSet rs2;
                    rs2=stmt2.executeQuery("select * from companyMember where idUser="+id+";");
                    while (rs2.next()){
                        companyId = rs2.getInt(3);
                    }
                } catch (SQLException ex) {
                ex.printStackTrace();
            }


            return companyId;
        }

    @Override
    public boolean update(int idUser, String position) {
        try {
            Connection con = FactoryDAOSQL.connection;
            Statement stmt=con.createStatement();
            int r = stmt.executeUpdate("UPDATE `companymember` SET `position`=`"+position+"` WHERE `idUser`="+idUser);
            if (r == 1){
                System.out.println("companyMember modifié");
                return true;
            }else{
                System.out.println("companyMember PAS modifié");
                return false;
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return false;
    }

    @Override
    public ArrayList<User> getAllCompanyMember() {
        ArrayList<User> companyMembers = new ArrayList<>();
        try {
            Connection con = FactoryDAOSQL.connection;
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select * from companymember,user where companymember.idUser=user.idUser ;");
            while(rs.next()){
                AbstractRole r = new CompanyMember(rs.getInt(1),
                        rs.getString(2),rs.getInt(3),rs.getInt(4));
                User user = new User(
                        rs.getInt(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getString(8),
                        rs.getString(9),
                        rs.getString(10),
                        rs.getString(11),
                        rs.getString(12),
                        rs.getString(13),
                        rs.getString(14)

                );

                user.setAbstractRole(r);

                companyMembers.add(user);
            }

            return companyMembers;
        } catch (SQLException e) {
            System.out.println(e);
        }
        return null;
    }
}

