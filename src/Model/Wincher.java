package Model;

import java.util.Date;

public class Wincher extends Launcher {
    private Date ropeRenewal;
    private Date parachuteRenewal;
    private int maxWeight;

    public Wincher(String registrationLauncher, Date acquisitionDate, Date renewalDate, int maxLaunchWeight, int idCompany, Date ropeRenewal, Date parachuteRenewal, int maxWeight) {
        super(registrationLauncher, acquisitionDate, renewalDate, maxLaunchWeight, idCompany);
        this.ropeRenewal = ropeRenewal;
        this.parachuteRenewal = parachuteRenewal;
        this.maxWeight = maxWeight;
    }

    public Date getRopeRenewal() {
        return ropeRenewal;
    }

    public void setRopeRenewal(Date ropeRenewal) {
        this.ropeRenewal = ropeRenewal;
    }

    public Date getParachuteRenewal() {
        return parachuteRenewal;
    }

    public void setParachuteRenewal(Date parachuteRenewal) {
        this.parachuteRenewal = parachuteRenewal;
    }

    @Override
    public void updateLauncher() {

    }

    @Override
    public void deleteLauncher() {

    }

    @Override
    public void readLauncher() {

    }
}
