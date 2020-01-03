package Model;

public class Monitor extends AbstractRole  {
    private int idCompany;
    private int monitorFlightHour;


    public Monitor(int idRole) {
        super(idRole);
    }

    public Monitor(int idRole, int idCompany, int monitorFlightHour) {
        super(idRole);
        this.idCompany = idCompany;
        this.monitorFlightHour = monitorFlightHour;
    }

    public int getIdCompany() {
        return idCompany;
    }

    public void setIdCompany(int idCompany) {
        this.idCompany = idCompany;
    }

    public int getMonitorFlightHour() {
        return monitorFlightHour;
    }

    public void setMonitorFlightHour(int monitorFlightHour) {
        this.monitorFlightHour = monitorFlightHour;
    }
}
