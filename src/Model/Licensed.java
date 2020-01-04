package Model;

public class Licensed extends AbstractRole {
    private int flightHour;

    public Licensed(int idRole) {
        super(idRole);
    }

    public Licensed(int idRole, int flightHour) {
        super(idRole);
        this.flightHour = flightHour;
    }

    public int getFlightHour() {
        return flightHour;
    }

    public void setFlightHour(int flightHour) {
        this.flightHour = flightHour;
    }
}
