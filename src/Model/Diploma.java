package Model;

import java.util.Date;

public class Diploma {
    TypeOfDiploma type;
    private int idDiploma;

    public TypeOfDiploma getType() {
        return type;
    }

    public void setType(TypeOfDiploma type) {
        this.type = type;
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

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
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

    private Date acquisitionDate;
    private Date renewalDate;
    //monitor , delivredby;
    private String State ;
    private int hourNeeded;
    private float hourDid;
    //pilot holder;
}
