package Model;

import java.util.Date;

public class Battery extends Equipment {
   private int power;
   private Date lastRefillDate;

   public int getPower() {
      return power;
   }

   public void setPower(int power) {
      this.power = power;
   }

   public Date getLastRefillDate() {
      return lastRefillDate;
   }

   public void setLastRefillDate(Date lastRefillDate) {
      this.lastRefillDate = lastRefillDate;
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
