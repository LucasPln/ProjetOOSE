package Model;

import java.util.Date;

/**
 * The type Battery.
 */
public class Battery extends Equipment {
   private int power;
   private Date lastRefillDate;
   private int idCompany;

    /**
     * Instantiates a new Battery.
     *
     * @param idEquipement   the id equipement
     * @param wording        the wording
     * @param power          the power
     * @param lastRefillDate the last refill date
     * @param idCompany      the id company
     */
    public Battery(int idEquipement, String wording, int power, Date lastRefillDate, int idCompany) {
      super(idEquipement, wording);
      this.power = power;
      this.lastRefillDate = lastRefillDate;
      this.idCompany = idCompany;
   }

    /**
     * Gets power.
     *
     * @return the power
     */
    public int getPower() {
      return power;
   }

    /**
     * Sets power.
     *
     * @param power the power
     */
    public void setPower(int power) {
      this.power = power;
   }

    /**
     * Gets last refill date.
     *
     * @return the last refill date
     */
    public Date getLastRefillDate() {
      return lastRefillDate;
   }

    /**
     * Sets last refill date.
     *
     * @param lastRefillDate the last refill date
     */
    public void setLastRefillDate(Date lastRefillDate) {
      this.lastRefillDate = lastRefillDate;
   }

}
