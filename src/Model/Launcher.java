package Model;

import java.util.Date;

/**
 * The type Launcher.
 *
 * @author Hugo Niort.
 */
public abstract class Launcher {
    /**
     * The Registration launcher.
     */
    String registrationLauncher ;
    /**
     * The Acquisition date.
     */
    Date acquisitionDate;
    /**
     * The Renewal date.
     */
    Date renewalDate;
    /**
     * The Max launch weight.
     */
    int maxLaunchWeight;
    /**
     * The Id company.
     */
    int idCompany;
    // Liste des dispos;


    /**
     * Instantiates a new Launcher.
     *
     * @param registrationLauncher the registration launcher
     * @param acquisitionDate      the acquisition date
     * @param renewalDate          the renewal date
     * @param maxLaunchWeight      the max launch weight
     * @param idCompany            the id company
     */
    public Launcher(String registrationLauncher, Date acquisitionDate, Date renewalDate, int maxLaunchWeight, int idCompany) {
        this.registrationLauncher = registrationLauncher;
        this.acquisitionDate = acquisitionDate;
        this.renewalDate = renewalDate;
        this.maxLaunchWeight = maxLaunchWeight;
        this.idCompany = idCompany;
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
     * Gets registration launcher.
     *
     * @return the registration launcher
     */
    public String getRegistrationLauncher() {
        return registrationLauncher;
    }

    /**
     * Sets registration launcher.
     *
     * @param registrationLauncher the registration launcher
     */
    public void setRegistrationLauncher(String registrationLauncher) {
        this.registrationLauncher = registrationLauncher;
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
     * Gets max launch weight.
     *
     * @return the max launch weight
     */
    public int getMaxLaunchWeight() {
        return maxLaunchWeight;
    }

    /**
     * Sets max launch weight.
     *
     * @param maxLaunchWeight the max launch weight
     */
    public void setMaxLaunchWeight(int maxLaunchWeight) {
        this.maxLaunchWeight = maxLaunchWeight;
    }
}
