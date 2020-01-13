package DAO;

/**
 * The type Abstract factory.
 */
public abstract class AbstractFactory {

    private static FactoryDAOSQL instance = null;

    /**
     * The Booking dao.
     */
    protected BookingDAO bookingDAO;
    /**
     * The Company dao.
     */
    protected CompanyDAO companyDAO;
    /**
     * The Dao diploma.
     */
    protected DAODiploma daoDiploma;
    /**
     * The Dao equipement.
     */
    protected DAOEquipement daoEquipement;
    /**
     * The Dao glider.
     */
    protected DAOGlider daoGlider;
    /**
     * The Dao launcher.
     */
    protected DAOLauncher daoLauncher;
    /**
     * The User dao.
     */
    protected UserDAO userDAO;
    /**
     * The Admin dao.
     */
    protected AdminDAO adminDAO;
    /**
     * The Company member dao.
     */
    protected CompanyMemberDAO companyMemberDAO;
    /**
     * The Licensed dao.
     */
    protected LicensedDAO licensedDAO;
    /**
     * The Monitor dao.
     */
    protected MonitorDAO monitorDAO;

    /**
     * Instantiates a new Abstract factory.
     */
    protected AbstractFactory(){

    }

    /**
     * Get instance factory daosql.
     *
     * @return the factory daosql
     */
    public static FactoryDAOSQL getInstance(){
        if(instance == null) instance = new FactoryDAOSQL();
        return instance;
    }

    /**
     * Initialize.
     */
    public abstract void initialize();

    /**
     * Create user dao.
     */
    public abstract void createUserDAO();

    /**
     * Create company dao.
     */
    public abstract void createCompanyDAO();

    /**
     * Create company member dao.
     */
    public abstract void createCompanyMemberDAO();

    /**
     * Create glider dao.
     */
    public abstract void createGliderDAO();

    /**
     * Create booking dao.
     */
    public abstract void createBookingDAO();

    /**
     * Create equipment dao.
     */
    public abstract void createEquipmentDAO();

    /**
     * Create launcher dao.
     */
    public abstract void createLauncherDAO();

    /**
     * Create diploma dao.
     */
    public abstract void createDiplomaDAO();

    /**
     * Create monitor dao.
     */
    public abstract void createMonitorDAO();

    /**
     * Create licensed dao.
     */
    public abstract void createLicensedDAO();

    /**
     * Create admin dao.
     */
    public abstract void createAdminDAO();


    /**
     * Gets company dao.
     *
     * @return the company dao
     */
    public CompanyDAO getCompanyDAO() {
        return companyDAO;
    }

    /**
     * Gets booking dao.
     *
     * @return the booking dao
     */
    public BookingDAO getBookingDAO() {
        return bookingDAO;
    }

    /**
     * Gets dao diploma.
     *
     * @return the dao diploma
     */
    public DAODiploma getDaoDiploma() {
        return daoDiploma;
    }

    /**
     * Gets dao equipement.
     *
     * @return the dao equipement
     */
    public DAOEquipement getDaoEquipement() {
        return daoEquipement;
    }

    /**
     * Gets dao glider.
     *
     * @return the dao glider
     */
    public DAOGlider getDaoGlider() {
        return daoGlider;
    }

    /**
     * Gets dao launcher.
     *
     * @return the dao launcher
     */
    public DAOLauncher getDaoLauncher() {
        return daoLauncher;
    }

    /**
     * Gets user dao.
     *
     * @return the user dao
     */
    public UserDAO getUserDAO() {
        return userDAO;
    }

    /**
     * Gets admin dao.
     *
     * @return the admin dao
     */
    public AdminDAO getAdminDAO() {
        return adminDAO;
    }

    /**
     * Gets company member dao.
     *
     * @return the company member dao
     */
    public CompanyMemberDAO getCompanyMemberDAO() {
        return companyMemberDAO;
    }

    /**
     * Gets licensed dao.
     *
     * @return the licensed dao
     */
    public LicensedDAO getLicensedDAO() {
        return licensedDAO;
    }

    /**
     * Gets monitor dao.
     *
     * @return the monitor dao
     */
    public MonitorDAO getMonitorDAO() {
        return monitorDAO;
    }
}
