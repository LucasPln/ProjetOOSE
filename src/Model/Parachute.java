package Model;

import java.util.Date;

public class Parachute extends Equipment {
    private Date renewalDate;
    private Date packageDate;

    public Date getRenewalDate() {
        return renewalDate;
    }

    public void setRenewalDate(Date renewalDate) {
        this.renewalDate = renewalDate;
    }

    public Date getPackageDate() {
        return packageDate;
    }

    public void setPackageDate(Date packageDate) {
        this.packageDate = packageDate;
    }


    @Override
    public void updateEquipement() {

    }

    @Override
    public void deleteEquipement() {

    }

    @Override
    public void readEquipement() {

    }

    @Override
    public void createEquipement() {

    }
}
