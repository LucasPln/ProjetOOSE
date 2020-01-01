package Model;

import java.util.ArrayList;
import java.util.Date;

public class Glider {
    private String registrationGlider;
    private int span;
    private int maxWeight;
    private Date acquisitionDate;
    private Date reviewDate;
    // liste dispo pas encore codée car besoind de tout le diagramme

    // liste des batteries compatibles
    private ArrayList<Battery> batteries =new ArrayList();

    public void getDisponibilite(){}
    public void updateDisponibilite(){}

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

    public void createGlider(){}
    public void deleteGlider(){}
    public void updateGlider(){}
    public void readGlider(){}

    public Glider(String registrationGlider, int span, int maxWeight, Date acquisitionDate, Date reviewDate) {
        this.registrationGlider = registrationGlider;
        this.span = span;
        this.maxWeight = maxWeight;
        this.acquisitionDate = acquisitionDate;
        this.reviewDate = reviewDate;
    }
}

