package Model;

/**
 * The type Gps.
 */
public class GPS extends Equipment {
    private String installedVersion;
    private int idCompany;

    /**
     * Instantiates a new Gps.
     *
     * @param idEquipement     the id equipement
     * @param wording          the wording
     * @param installedVersion the installed version
     * @param idCompany        the id company
     */
    public GPS(int idEquipement, String wording, String installedVersion, int idCompany) {
        super(idEquipement, wording);
        this.installedVersion = installedVersion;
        this.idCompany = idCompany;
    }

    /**
     * Gets installed version.
     *
     * @return the installed version
     */
    public String getInstalledVersion() {
        return installedVersion;
    }

    /**
     * Sets installed version.
     *
     * @param installedVersion the installed version
     */
    public void setInstalledVersion(String installedVersion) {
        this.installedVersion = installedVersion;
    }

    /**
     * Update equipement.
     */
    @Override
    public void updateEquipement() {

    }

    /**
     * Delete equipement.
     */
    @Override
    public void deleteEquipement() {

    }

    /**
     * Read equipement.
     */
    @Override
    public void readEquipement() {

    }

    /**
     * Create equipement.
     */
    @Override
    public void createEquipement() {

    }
}
