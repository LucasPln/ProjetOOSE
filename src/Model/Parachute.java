package Model;

import java.util.Date;

public class Parachute extends Equipment {
    private Date renewalDate;
    private Date packageDate;
    private int idCompany;

    public Parachute(int idEquipement, String wording, Date renewalDate, Date packageDate, int idCompany) {
        super(idEquipement, wording);
        this.renewalDate = renewalDate;
        this.packageDate = packageDate;
        this.idCompany = idCompany;
    }

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
