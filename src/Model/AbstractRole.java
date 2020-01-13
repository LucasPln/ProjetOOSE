package Model;

/**
 * The type Abstract role.
 */
public abstract class AbstractRole {

    private int idRole;

    /**
     * Instantiates a new Abstract role.
     *
     * @param idRole the id role
     */
    public AbstractRole(int idRole) {
        this.idRole = idRole;
    }

    /**
     * Gets id role.
     *
     * @return the id role
     */
    public int getIdRole() {
        return idRole;
    }

    /**
     * Sets id role.
     *
     * @param idRole the id role
     */
    public void setIdRole(int idRole) {
        this.idRole = idRole;
    }

}
