package Model;

import java.util.Date;

public abstract class Launcher {
    String registrationLauncher ;
    Date acquisitionDate;
    Date renewalDate;
    int maxLaunchWeight;
    // Liste des dispos;

    public void getDisponibilite(){};
    public void updateDisponibilite(){};
    public abstract void updateLauncher();
    public abstract void deleteLauncher();
    public abstract void readLauncher();
    public abstract void createLauncher();


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
