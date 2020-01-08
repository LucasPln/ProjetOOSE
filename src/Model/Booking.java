package Model;

public class Booking {

    private int idBooking;
    private String startDate;
    private String endDate;
    private double price;
    private String state;
    private int battery;
    private int gps;
    private String launcherPlane;
    private String launcherWinch;
    private int launchman;
    private int customer;
    private int flightManager;
    private int diploma;
    private String glider;
    private int company;

    public Booking(int idBooking, String startDate, String endDate, double price, String state, int battery, int gps, String launcherPlane, String launcherWinch, int launchman, int customer, int flightManager, int diploma, String glider, int company) {
        this.idBooking = idBooking;
        this.startDate = startDate;
        this.endDate = endDate;
        this.price = price;
        this.state = state;
        this.battery = battery;
        this.gps = gps;
        this.launcherPlane = launcherPlane;
        this.launcherWinch = launcherWinch;
        this.launchman = launchman;
        this.customer = customer;
        this.flightManager = flightManager;
        this.diploma = diploma;
        this.glider = glider;
        this.company = company;
    }
}
