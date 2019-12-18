package DAO;

public abstract class AbstractFactory {

    private static FactoryDAOSQL instance = null;

    protected BookingDAO bookingDAO;
    protected CompanyDAO companyDAO;
    protected DAODiploma daoDiploma;
    protected DAOEquipement daoEquipement;
    protected DAOGlider daoGlider;
    protected DAOLauncher daoLauncher;
    protected UserDAO userDAO;
    protected AdminDAO adminDAO;
    protected CompanyMemberDAO companyMemberDAO;
    protected LicensedDAO licensedDAO;
    protected MonitorDAO monitorDAO;

    protected AbstractFactory(){

    }

    public static FactoryDAOSQL getInstance(){
        if(instance == null) instance = new FactoryDAOSQL();
        return instance;
    }

    public abstract void initialize();

    public abstract void createUserDAO();

    public abstract void createCompanyDAO();

    public CompanyDAO getCompanyDAO() {
        return companyDAO;
    }

    public BookingDAO getBookingDAO() {
        return bookingDAO;
    }

    public DAODiploma getDaoDiploma() {
        return daoDiploma;
    }

    public DAOEquipement getDaoEquipement() {
        return daoEquipement;
    }

    public DAOGlider getDaoGlider() {
        return daoGlider;
    }

    public DAOLauncher getDaoLauncher() {
        return daoLauncher;
    }

    public UserDAO getUserDAO() {
        return userDAO;
    }
}
