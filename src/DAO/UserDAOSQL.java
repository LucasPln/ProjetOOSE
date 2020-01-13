package DAO;

import Facade.LoginFacade;
import Model.*;
import java.sql.*;
import java.util.ArrayList;

/**
 * The type User daosql.
 */
public class UserDAOSQL implements UserDAO {


    @Override
    public User login(String login, String password,String role) {
        User user = null;
        try {
            Connection con = FactoryDAOSQL.connection;
            Statement stmt=con.createStatement();


            ResultSet rs=stmt.executeQuery("select * from user where login='"+login+"' and password='"+password+"';");


            while(rs.next()){
                user = new User(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getString(8),
                        rs.getString(9),
                        rs.getString(10)
                );
                System.out.println("User créé");
            }
            AbstractRole abstractRole=null;
            Connection con2 = FactoryDAOSQL.connection;
            Statement stmt2=con2.createStatement();
            ResultSet rs2;
            if (role.equals("Monitor")){
                rs2=stmt2.executeQuery("select * from monitor where idUser='"+user.getId()+"' ;");
                while (rs2.next()){
                    abstractRole = new Monitor(rs2.getInt(1),rs2.getInt(2),rs2.getInt(3));
                }
            }else if (role.equals("Licensed")){
                rs2=stmt2.executeQuery("select * from licensed where idUser='"+user.getId()+"' ;");
                while (rs2.next()){
                    abstractRole = new Licensed(rs2.getInt(1),rs2.getInt(2));
                }

            }else if(role.equals("Company Member")){
                rs2=stmt2.executeQuery("select * from companymember where idUser='"+user.getId()+"' ;");
                while (rs2.next()){
                    abstractRole = new CompanyMember(rs2.getInt(1),rs2.getString(2),rs2.getInt(3),rs2.getInt(4));
                }
            }else{//role.equals("Admin")
                rs2=stmt2.executeQuery("select * from admin where idUser='"+user.getId()+"' ;");
                while (rs2.next()){
                    abstractRole = new Admin(rs2.getInt(1),rs2.getString(2));
                }
            }
            user.setAbstractRole(abstractRole);
        } catch (SQLException e) {
        }

        return user;
    }

    @Override
    public boolean addUser(String firstname,String lastname,String phoneNumber,String email,String adress,String postalCode,String dateBirth,String role) {
        int rs = 26;
        try {
            Connection con = FactoryDAOSQL.connection;
            Statement stmt=con.createStatement();
            rs = stmt.executeUpdate("INSERT INTO `user`(`firstName`, `lastName`, `birthDate`, `adress`, `postalCode`, `mail`, `tel`) VALUES ('"+firstname+"','"+lastname+"','"+dateBirth+"','"+adress+"',"+postalCode+",'"+email+"','"+phoneNumber+"')");

            if(rs == 1) {
                ResultSet rs2;
                rs2 = stmt.executeQuery("select idUser from user where firstName='"+firstname+"' and lastName='"+lastname+"' and birthDate='"+dateBirth+"' and adress='"+adress+"' and postalCode="+postalCode+" and mail='"+email+"' and tel='"+phoneNumber+"'");

                int id=-1;
                while(rs2.next()){
                    id = rs2.getInt(1);
                }

                switch (role) {
                    case "Monitor":
                        rs = stmt.executeUpdate("INSERT INTO `monitor`(`idUser`,`idCompany`) VALUES ("+id+",NULL)");
                    case "Licensed":
                        rs = stmt.executeUpdate("INSERT INTO `licensed`(`idUser`) VALUES ("+id+")");
                    case "Admin":
                        rs = stmt.executeUpdate("INSERT INTO `admin`(`idUser`) VALUES ("+id+")");
                    case "Company Member":
                        rs = stmt.executeUpdate("INSERT INTO `companymember`(`idUser`,`idCompany`) VALUES ("+id+",NULL)");
                    default:
                }
                if (rs == 1){
                    System.out.println("user ajouté");
                    return true;
                }else{
                    System.out.println("user pas ajouté");
                    return false;
                }
            }else{
                return false;
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return false;

    }

    @Override
    public boolean update(int id,String firstname,String lastname,String phoneNumber,String email,String adress,String postalCode,String dateBirth){
        try {
            Connection con = FactoryDAOSQL.connection;
            Statement stmt=con.createStatement();
            int r = stmt.executeUpdate("UPDATE `user` SET `firstName`='"+firstname+"',`lastName`='"+lastname+"',`birthDate`='"+dateBirth+"',`adress`='"+adress+"',`postalCode`='"+postalCode+"',`mail`='"+email+"',`tel`='"+phoneNumber+"' WHERE `idUser`="+id+";");
            if (r == 1){
                System.out.println("user modifié");
                return true;
            }else{
                System.out.println("user PAS modifié");
                return false;
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return false;
    }

    @Override
    public ArrayList<User> getAllMonitor() {
        ArrayList<User> listMonitor = new ArrayList<>();

        Connection con = FactoryDAOSQL.connection;
        Statement stmt= null;

        try {
            stmt = con.createStatement();
            ResultSet rs=stmt.executeQuery("select * from user where idUser <> "+ LoginFacade.getInstance().getConnectedUser().getId() +";");

            while(rs.next()){

                int idUser = rs.getInt(1);

                Statement stmt2 = con.createStatement();
                ResultSet rs2 =stmt2.executeQuery("select * from monitor where idUser = "+ idUser +";");

                if(rs2.next()){
                    User user = new User(
                            rs.getInt(1),
                            rs.getString(2),
                            rs.getString(3),
                            rs.getString(4),
                            rs.getString(5),
                            rs.getString(6),
                            rs.getString(7),
                            rs.getString(8),
                            rs.getString(9),
                            rs.getString(10)
                    );

                    System.out.println("User créé");
                    listMonitor.add(user);
                }

            }


        } catch (SQLException e) {
            e.printStackTrace();
        }

        return listMonitor;
    }

    public boolean delete(int idUser){
        try {
            Connection con = FactoryDAOSQL.connection;
            Statement stmt=con.createStatement();
            int rs = stmt.executeUpdate("DELETE FROM `user` WHERE idUser="+idUser);
            if (rs >= 1){
                System.out.println("user supprimé");
                return true;
            }else{
                System.out.println("user PAS supprimé");
                return false;
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }


}
