package Model;

/**
 * The type Monitor.
 */
public class Monitor extends AbstractRole  {
    private int idCompany;
    private int monitorFlightHour;


    /**
     * Instantiates a new Monitor.
     *
     * @param idRole the id role
     */
    public Monitor(int idRole) {
        super(idRole);
    }

    /**
     * Instantiates a new Monitor.
     *
     * @param idRole            the id role
     * @param idCompany         the id company
     * @param monitorFlightHour the monitor flight hour
     */
    public Monitor(int idRole, int idCompany, int monitorFlightHour) {
        super(idRole);
        this.idCompany = idCompany;
        this.monitorFlightHour = monitorFlightHour;
    }

    /**
     * Gets id company.
     *
     * @return the id company
     */
    public int getIdCompany() {
        return idCompany;
    }

    /**
     * Sets id company.
     *
     * @param idCompany the id company
     */
    public void setIdCompany(int idCompany) {
        this.idCompany = idCompany;
    }

    /**
     * Gets monitor flight hour.
     *
     * @return the monitor flight hour
     */
    public int getMonitorFlightHour() {
        return monitorFlightHour;
    }

    /**
     * Sets monitor flight hour.
     *
     * @param monitorFlightHour the monitor flight hour
     */
    public void setMonitorFlightHour(int monitorFlightHour) {
        this.monitorFlightHour = monitorFlightHour;
    }
}
