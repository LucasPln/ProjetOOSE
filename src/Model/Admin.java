package Model;

/**
 * The type Admin.
 * @author ANDREU Paola
 */
public class Admin extends AbstractRole {

    private String adminDate;

    /**
     * Instantiates a new Admin.
     *
     * @param idRole the id role
     */
    public Admin(int idRole) {
        super(idRole);
    }

    /**
     * Instantiates a new Admin.
     *
     * @param idRole    the id role
     * @param adminDate the admin date
     */
    public Admin(int idRole, String adminDate) {
        super(idRole);
        this.adminDate = adminDate;
    }

    /**
     * Gets admin date.
     *
     * @return the admin date
     */
    public String getAdminDate() {
        return adminDate;
    }

    /**
     * Sets admin date.
     *
     * @param adminDate the admin date
     */
    public void setAdminDate(String adminDate) {
        this.adminDate = adminDate;
    }

}
