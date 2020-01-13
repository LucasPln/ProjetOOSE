package Model;

/**
 * The type Company member.
 */
public class CompanyMember extends AbstractRole{

    private String position;

    /**
     * Gets position.
     *
     * @return the position
     */
    public String getPosition() {
        return position;
    }

    /**
     * Sets position.
     *
     * @param position the position
     */
    public void setPosition(String position) {
        this.position = position;
    }

    /**
     * Gets id company.
     *
     * @return the id company
     */
    public int getIdCompany() {
        return idCompany;
    }

    /**
     * Sets id company.
     *
     * @param idCompany the id company
     */
    public void setIdCompany(int idCompany) {
        this.idCompany = idCompany;
    }

    /**
     * Gets id user.
     *
     * @return the id user
     */
    public int getIdUser() {
        return idUser;
    }

    /**
     * Sets id user.
     *
     * @param idUser the id user
     */
    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    private int idCompany;
    private int idUser;

    /**
     * Instantiates a new Company member.
     *
     * @param idRole the id role
     */
    public CompanyMember(int idRole) {
        super(idRole);
    }

    /**
     * Instantiates a new Company member.
     *
     * @param idRole    the id role
     * @param position  the position
     * @param idCompany the id company
     * @param idUser    the id user
     */
    public CompanyMember(int idRole,String position,int idCompany,int idUser) {
        super(idRole);
        this.idUser = idUser;
        this.position = position;
        this.idCompany = idCompany;
    }
}
