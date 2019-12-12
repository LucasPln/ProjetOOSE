package DAO;

import Model.User;

import java.sql.*;

public class UserDAOSQL implements UserDAO {

    public Connection connexion(){
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
    public User login(String login, String password) {
        User user = null;
        try {
            Connection con = this.connexion();
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select * from user where login='"+login+"' and password='"+password+"';");


            while(rs.next()){
                user = new User(rs.getInt(1),rs.getString(2), rs.getString(3));
                System.out.println("User créé");
            }

            con.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return user;
    }
}
