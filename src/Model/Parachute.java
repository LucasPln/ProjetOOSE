package Model;

import java.util.Date;

/**
 * The type Parachute.
 */
public class Parachute extends Equipment {
    private Date renewalDate;
    private Date packageDate;
    private int idCompany;

    /**
     * Instantiates a new Parachute.
     *
     * @param idEquipement the id equipement
     * @param wording      the wording
     * @param renewalDate  the renewal date
     * @param packageDate  the package date
     * @param idCompany    the id company
     */
    public Parachute(int idEquipement, String wording, Date renewalDate, Date packageDate, int idCompany) {
        super(idEquipement, wording);
        this.renewalDate = renewalDate;
        this.packageDate = packageDate;
        this.idCompany = idCompany;
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
     * Gets package date.
     *
     * @return the package date
     */
    public Date getPackageDate() {
        return packageDate;
    }

    /**
     * Sets package date.
     *
     * @param packageDate the package date
     */
    public void setPackageDate(Date packageDate) {
        this.packageDate = packageDate;
    }


}
