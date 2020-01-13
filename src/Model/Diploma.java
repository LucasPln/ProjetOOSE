package Model;

import java.util.Date;

/**
 * The type Diploma.
 */
public class Diploma {
    private int idDiploma;
    private Date acquisitionDate;
    private Date renewalDate;
    private int idType;
    private int idDeliveredBy;
    private int idOwner;
    private String state;
    private int hourNeeded;
    private float hourDid;
    private int holder;

    /**
     * Instantiates a new Diploma.
     *
     * @param idDiploma       the id diploma
     * @param acquisitionDate the acquisition date
     * @param renewalDate     the renewal date
     * @param idType          the id type
     * @param idDeliveredBy   the id delivered by
     * @param idOwner         the id owner
     * @param state           the state
     * @param hourNeeded      the hour needed
     * @param hourDid         the hour did
     * @param holder          the holder
     */
    public Diploma(int idDiploma, Date acquisitionDate, Date renewalDate, int idType, int idDeliveredBy, int idOwner, String state, int hourNeeded, float hourDid, int holder) {
        this.idDiploma = idDiploma;
        this.acquisitionDate = acquisitionDate;
        this.renewalDate = renewalDate;
        this.idType = idType;
        this.idDeliveredBy = idDeliveredBy;
        this.idOwner = idOwner;
        this.state = state;
        this.hourNeeded = hourNeeded;
        this.hourDid = hourDid;
        this.holder = holder;
    }

    /**
     * Gets id diploma.
     *
     * @return the id diploma
     */
    public int getIdDiploma() {
        return idDiploma;
    }

    /**
     * Sets id diploma.
     *
     * @param idDiploma the id diploma
     */
    public void setIdDiploma(int idDiploma) {
        this.idDiploma = idDiploma;
    }

    /**
     * Gets acquisition date.
     *
     * @return the acquisition date
     */
    public Date getAcquisitionDate() {
        return acquisitionDate;
    }

    /**
     * Sets acquisition date.
     *
     * @param acquisitionDate the acquisition date
     */
    public void setAcquisitionDate(Date acquisitionDate) {
        this.acquisitionDate = acquisitionDate;
    }

    /**
     * Gets renewal date.
     *
     * @return the renewal date
     */
    public Date getRenewalDate() {
        return renewalDate;
    }

    /**
     * Sets renewal date.
     *
     * @param renewalDate the renewal date
     */
    public void setRenewalDate(Date renewalDate) {
        this.renewalDate = renewalDate;
    }

    /**
     * Gets id type.
     *
     * @return the id type
     */
    public int getIdType() {
        return idType;
    }

    /**
     * Sets id type.
     *
     * @param idType the id type
     */
    public void setIdType(int idType) {
        this.idType = idType;
    }

    /**
     * Gets id delivered by.
     *
     * @return the id delivered by
     */
    public int getIdDeliveredBy() {
        return idDeliveredBy;
    }

    /**
     * Sets id delivered by.
     *
     * @param idDeliveredBy the id delivered by
     */
    public void setIdDeliveredBy(int idDeliveredBy) {
        this.idDeliveredBy = idDeliveredBy;
    }

    /**
     * Gets id owner.
     *
     * @return the id owner
     */
    public int getIdOwner() {
        return idOwner;
    }

    /**
     * Sets id owner.
     *
     * @param idOwner the id owner
     */
    public void setIdOwner(int idOwner) {
        this.idOwner = idOwner;
    }

    /**
     * Gets state.
     *
     * @return the state
     */
    public String getState() {
        return state;
    }

    /**
     * Sets state.
     *
     * @param state the state
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * Gets hour needed.
     *
     * @return the hour needed
     */
    public int getHourNeeded() {
        return hourNeeded;
    }

    /**
     * Sets hour needed.
     *
     * @param hourNeeded the hour needed
     */
    public void setHourNeeded(int hourNeeded) {
        this.hourNeeded = hourNeeded;
    }

    /**
     * Gets hour did.
     *
     * @return the hour did
     */
    public float getHourDid() {
        return hourDid;
    }

    /**
     * Sets hour did.
     *
     * @param hourDid the hour did
     */
    public void setHourDid(float hourDid) {
        this.hourDid = hourDid;
    }

    /**
     * Gets holder.
     *
     * @return the holder
     */
    public int getHolder() {
        return holder;
    }

    /**
     * Sets holder.
     *
     * @param holder the holder
     */
    public void setHolder(int holder) {
        this.holder = holder;
    }
}
