package Model;

/**
 * The type Licensed.
 *
 * @author ANDREU Paola
 */
public class Licensed extends AbstractRole {
    private int flightHour;

    /**
     * Instantiates a new Licensed.
     *
     * @param idRole the id role
     */
    public Licensed(int idRole) {
        super(idRole);
    }

    /**
     * Instantiates a new Licensed.
     *
     * @param idRole     the id role
     * @param flightHour the flight hour
     */
    public Licensed(int idRole, int flightHour) {
        super(idRole);
        this.flightHour = flightHour;
    }

    /**
     * Gets flight hour.
     *
     * @return the flight hour
     */
    public int getFlightHour() {
        return flightHour;
    }

    /**
     * Sets flight hour.
     *
     * @param flightHour the flight hour
     */
    public void setFlightHour(int flightHour) {
        this.flightHour = flightHour;
    }
}
