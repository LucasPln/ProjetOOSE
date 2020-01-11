package Model;

import java.util.Date;

public class Glider {
    private String registrationGlider;
    private int span;
    private int maxWeight;
    private int idCompany;
    private Date acquisitionDate;
    private Date reviewDate;

    public Glider(String registrationGlider, int span, int maxWeight, int idCompany, Date acquisitionDate, Date reviewDate) {
        this.registrationGlider = registrationGlider;
        this.span = span;
        this.maxWeight = maxWeight;
        this.idCompany = idCompany;
        this.acquisitionDate = acquisitionDate;
        this.reviewDate = reviewDate;
    }

    public void getDisponibilite(){}
    public void updateDisponibilite(){}

    public void deleteGlider(){}
    public void updateGlider(){}
    public void readGlider(){}

    public String getRegistrationGlider() {
        return registrationGlider;
    }

    public void setRegistrationGlider(String registrationGlider) {
        this.registrationGlider = registrationGlider;
    }

    public int getSpan() {
        return span;
    }

    public void setSpan(int span) {
        this.span = span;
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public Date getAcquisitionDate() {
        return acquisitionDate;
    }

    public void setAcquisitionDate(Date acquisitionDate) {
        this.acquisitionDate = acquisitionDate;
    }

    public Date getReviewDate() {
        return reviewDate;
    }

    public void setReviewDate(Date reviewDate) {
        this.reviewDate = reviewDate;
    }

    public int getIdCompany() {
        return idCompany;
    }

    public void setIdCompany(int idCompany) {
        this.idCompany = idCompany;
    }
}

