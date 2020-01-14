package Model;

import java.util.Date;

/**
 * The type Wincher.
 */
public class Wincher extends Launcher {
    private Date ropeRenewal;
    private Date parachuteRenewal;
    private int maxWeight;

    /**
     * Instantiates a new Wincher.
     *
     * @param registrationLauncher the registration launcher
     * @param acquisitionDate      the acquisition date
     * @param renewalDate          the renewal date
     * @param maxLaunchWeight      the max launch weight
     * @param idCompany            the id company
     * @param ropeRenewal          the rope renewal
     * @param parachuteRenewal     the parachute renewal
     * @param maxWeight            the max weight
     */
    public Wincher(String registrationLauncher, Date acquisitionDate, Date renewalDate, int maxLaunchWeight, int idCompany, Date ropeRenewal, Date parachuteRenewal, int maxWeight) {
        super(registrationLauncher, acquisitionDate, renewalDate, maxLaunchWeight, idCompany);
        this.ropeRenewal = ropeRenewal;
        this.parachuteRenewal = parachuteRenewal;
        this.maxWeight = maxWeight;
    }

    /**
     * Gets rope renewal.
     *
     * @return the rope renewal
     */
    public Date getRopeRenewal() {
        return ropeRenewal;
    }

    /**
     * Sets rope renewal.
     *
     * @param ropeRenewal the rope renewal
     */
    public void setRopeRenewal(Date ropeRenewal) {
        this.ropeRenewal = ropeRenewal;
    }

    /**
     * Gets parachute renewal.
     *
     * @return the parachute renewal
     */
    public Date getParachuteRenewal() {
        return parachuteRenewal;
    }

    /**
     * Sets parachute renewal.
     *
     * @param parachuteRenewal the parachute renewal
     */
    public void setParachuteRenewal(Date parachuteRenewal) {
        this.parachuteRenewal = parachuteRenewal;
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }
}
