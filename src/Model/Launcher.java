package Model;

import java.util.Date;

public abstract class Launcher {
    String registrationLauncher ;
    Date acquisitionDate;
    Date renewalDate;
    int maxLaunchWeight;
    int idCompany;
    // Liste des dispos;


    public Launcher(String registrationLauncher, Date acquisitionDate, Date renewalDate, int maxLaunchWeight, int idCompany) {
        this.registrationLauncher = registrationLauncher;
        this.acquisitionDate = acquisitionDate;
        this.renewalDate = renewalDate;
        this.maxLaunchWeight = maxLaunchWeight;
        this.idCompany = idCompany;
    }

    public void getDisponibilite(){};
    public void updateDisponibilite(){};
    public abstract void updateLauncher();
    public abstract void deleteLauncher();
    public abstract void readLauncher();


    public String getRegistrationLauncher() {
        return registrationLauncher;
    }

    public void setRegistrationLauncher(String registrationLauncher) {
        this.registrationLauncher = registrationLauncher;
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

    public int getMaxLaunchWeight() {
        return maxLaunchWeight;
    }

    public void setMaxLaunchWeight(int maxLaunchWeight) {
        this.maxLaunchWeight = maxLaunchWeight;
    }
}
