package Model;

/**
 * The type Equipment.
 */
public abstract class Equipment {
    /**
     * The Id equipement.
     */
    protected int idEquipement;
    /**
     * The Wording.
     */
    protected String wording;

    /**
     * Instantiates a new Equipment.
     *
     * @param idEquipement the id equipement
     * @param wording      the wording
     */
    public Equipment(int idEquipement, String wording) {
        this.idEquipement = idEquipement;
        this.wording = wording;
    }

    /**
     * Get disponibilite.
     */
    public void getDisponibilite(){};

    /**
     * Update disponibilite.
     */
    public void updateDisponibilite(){};

    /**
     * Gets id equipement.
     *
     * @return the id equipement
     */
    public int getIdEquipement() {
        return idEquipement;
    }

    /**
     * Sets id equipement.
     *
     * @param idEquipement the id equipement
     */
    public void setIdEquipement(int idEquipement) {
        this.idEquipement = idEquipement;
    }

    /**
     * Gets wording.
     *
     * @return the wording
     */
    public String getWording() {
        return wording;
    }

    /**
     * Sets wording.
     *
     * @param wording the wording
     */
    public void setWording(String wording) {
        this.wording = wording;
    }

}
