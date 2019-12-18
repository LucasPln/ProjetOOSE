package Model;

import java.util.Date;

public class Wincher extends Launcher {
    private Date ropeRenewal;
    private Date parachuteRenewal;
    @Override
    public void createLauncher() {

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
