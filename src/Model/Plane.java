package Model;

import java.util.Date;

/**
 * The type Plane.
 */
public class Plane extends Launcher {
    private int span;
    private int maxWeight;


    /**
     * Instantiates a new Plane.
     *
     * @param registrationLauncher the registration launcher
     * @param acquisitionDate      the acquisition date
     * @param renewalDate          the renewal date
     * @param maxLaunchWeight      the max launch weight
     * @param idCompany            the id company
     * @param span                 the span
     * @param maxWeight            the max weight
     */
    public Plane(String registrationLauncher, Date acquisitionDate, Date renewalDate, int maxLaunchWeight, int idCompany, int span, int maxWeight) {
        super(registrationLauncher, acquisitionDate, renewalDate, maxLaunchWeight, idCompany);
        this.span = span;
        this.maxWeight = maxWeight;
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
     * Update launcher.
     */
    @Override
    public void updateLauncher() {

    }

    /**
     * Delete launcher.
     */
    @Override
    public void deleteLauncher() {

    }

    /**
     * Read launcher.
     */
    @Override
    public void readLauncher() {

    }
}
