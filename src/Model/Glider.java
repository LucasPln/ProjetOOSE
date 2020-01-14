package Model;

import java.util.Date;

/**
 * The type Glider.
 */
public class Glider {
    private String registrationGlider;
    private int span;
    private int maxWeight;
    private int idCompany;
    private Date acquisitionDate;
    private Date reviewDate;

    /**
     * Instantiates a new Glider.
     *
     * @param registrationGlider the registration glider
     * @param span               the span
     * @param maxWeight          the max weight
     * @param idCompany          the id company
     * @param acquisitionDate    the acquisition date
     * @param reviewDate         the review date
     */
    public Glider(String registrationGlider, int span, int maxWeight, int idCompany, Date acquisitionDate, Date reviewDate) {
        this.registrationGlider = registrationGlider;
        this.span = span;
        this.maxWeight = maxWeight;
        this.idCompany = idCompany;
        this.acquisitionDate = acquisitionDate;
        this.reviewDate = reviewDate;
    }

    /**
     * Instantiates a new Glider.
     */
    public Glider(){

    }

    /**
     * Instantiates a new Glider.
     *
     * @param registrationGlider the registration glider
     */
    public Glider(String registrationGlider){
        this.registrationGlider = registrationGlider;
    }

    /**
     * Get disponibilite.
     */
    public void getDisponibilite(){}

    /**
     * Update disponibilite.
     */
    public void updateDisponibilite(){}

    /**
     * Delete glider.
     */
    public void deleteGlider(){}

    /**
     * Update glider.
     */
    public void updateGlider(){}

    /**
     * Read glider.
     */
    public void readGlider(){}

    /**
     * Gets registration glider.
     *
     * @return the registration glider
     */
    public String getRegistrationGlider() {
        return registrationGlider;
    }

    /**
     * Sets registration glider.
     *
     * @param registrationGlider the registration glider
     */
    public void setRegistrationGlider(String registrationGlider) {
        this.registrationGlider = registrationGlider;
    }

    /**
     * Gets span.
     *
     * @return the span
     */
    public int getSpan() {
        return span;
    }

    /**
     * Sets span.
     *
     * @param span the span
     */
    public void setSpan(int span) {
        this.span = span;
    }

    /**
     * Gets max weight.
     *
     * @return the max weight
     */
    public int getMaxWeight() {
        return maxWeight;
    }

    /**
     * Sets max weight.
     *
     * @param maxWeight the max weight
     */
    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
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
     * Gets review date.
     *
     * @return the review date
     */
    public Date getReviewDate() {
        return reviewDate;
    }

    /**
     * Sets review date.
     *
     * @param reviewDate the review date
     */
    public void setReviewDate(Date reviewDate) {
        this.reviewDate = reviewDate;
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
}

