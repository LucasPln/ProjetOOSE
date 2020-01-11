package Model;

import java.util.Date;

public class Diploma {
    private TypeOfDiploma type;
    private int idDiploma;
    private Date acquisitionDate;
    private Date renewalDate;
    private User moitor;
    private User deliveredBy;
    private String state;
    private int hourNeeded;
    private float hourDid;
    private User holder;

    public Diploma(TypeOfDiploma type, int idDiploma, Date acquisitionDate, Date renewalDate, User moitor, User deliveredBy, String state, int hourNeeded, float hourDid, User holder) {
        this.type = type;
        this.idDiploma = idDiploma;
        this.acquisitionDate = acquisitionDate;
        this.renewalDate = renewalDate;
        this.moitor = moitor;
        this.deliveredBy = deliveredBy;
        this.state = state;
        this.hourNeeded = hourNeeded;
        this.hourDid = hourDid;
        this.holder = holder;
    }

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


}
