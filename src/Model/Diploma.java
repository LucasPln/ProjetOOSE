package Model;

import java.util.Date;

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

    public int getIdDiploma() {
        return idDiploma;
    }

    public void setIdDiploma(int idDiploma) {
        this.idDiploma = idDiploma;
    }

    public Date getAcquisitionDate() {
        return acquisitionDate;
    }

    public void setAcquisitionDate(Date acquisitionDate) {
        this.acquisitionDate = acquisitionDate;
    }

    public Date getRenewalDate() {
        return renewalDate;
    }

    public void setRenewalDate(Date renewalDate) {
        this.renewalDate = renewalDate;
    }

    public int getIdType() {
        return idType;
    }

    public void setIdType(int idType) {
        this.idType = idType;
    }

    public int getIdDeliveredBy() {
        return idDeliveredBy;
    }

    public void setIdDeliveredBy(int idDeliveredBy) {
        this.idDeliveredBy = idDeliveredBy;
    }

    public int getIdOwner() {
        return idOwner;
    }

    public void setIdOwner(int idOwner) {
        this.idOwner = idOwner;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getHourNeeded() {
        return hourNeeded;
    }

    public void setHourNeeded(int hourNeeded) {
        this.hourNeeded = hourNeeded;
    }

    public float getHourDid() {
        return hourDid;
    }

    public void setHourDid(float hourDid) {
        this.hourDid = hourDid;
    }

    public int getHolder() {
        return holder;
    }

    public void setHolder(int holder) {
        this.holder = holder;
    }
}
