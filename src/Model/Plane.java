package Model;

import java.util.Date;

public class Plane extends Launcher {
    private int span;
    private int maxWeight;


    public Plane(String registrationLauncher, Date acquisitionDate, Date renewalDate, int maxLaunchWeight, int idCompany, int span, int maxWeight) {
        super(registrationLauncher, acquisitionDate, renewalDate, maxLaunchWeight, idCompany);
        this.span = span;
        this.maxWeight = maxWeight;
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
