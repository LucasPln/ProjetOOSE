package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FactoryDAOSQL extends AbstractFactory {

    public static Connection connection;

    protected FactoryDAOSQL(){
        initialize();
    }

    @Override
    public void createUserDAO() {
        this.userDAO = new UserDAOSQL();
    }

    @Override
    public void createCompanyDAO() {
        this.companyDAO = new CompanyDAOSQL();
    }

    @Override
    public void createCompanyMemberDAO() {
        this.companyMemberDAO= new CompanyMemberDAOSQL();
    }

    @Override
    public void createGliderDAO() { this.daoGlider = new DAOSqlGlider(); }

    @Override
    public void createBookingDAO() {
        this.bookingDAO = new BookingDAOMySQL();
    }

    @Override
    public void initialize() {
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:"+ConfigBDD.PORT+"/"+ConfigBDD.NAME+"?autoReconnect=true&useSSL=false",ConfigBDD.LOGIN,ConfigBDD.PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

        connection =  con;
    }


}
