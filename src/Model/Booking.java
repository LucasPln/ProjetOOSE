package Model;

import java.util.Date;

public class Booking {

    private int idBooking;
    private Date startDate;
    private Date endDate;
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

    public Booking(int idBooking, Date startDate, Date endDate, double price, String state, int battery, int gps, String launcherPlane, String launcherWinch, int launchman, int customer, int flightManager, int diploma, String glider, int company) {
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

    public int getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(int idBooking) {
        this.idBooking = idBooking;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

    public int getGps() {
        return gps;
    }

    public void setGps(int gps) {
        this.gps = gps;
    }

    public String getLauncherPlane() {
        return launcherPlane;
    }

    public void setLauncherPlane(String launcherPlane) {
        this.launcherPlane = launcherPlane;
    }

    public String getLauncherWinch() {
        return launcherWinch;
    }

    public void setLauncherWinch(String launcherWinch) {
        this.launcherWinch = launcherWinch;
    }

    public int getLaunchman() {
        return launchman;
    }

    public void setLaunchman(int launchman) {
        this.launchman = launchman;
    }

    public int getCustomer() {
        return customer;
    }

    public void setCustomer(int customer) {
        this.customer = customer;
    }

    public int getFlightManager() {
        return flightManager;
    }

    public void setFlightManager(int flightManager) {
        this.flightManager = flightManager;
    }

    public int getDiploma() {
        return diploma;
    }

    public void setDiploma(int diploma) {
        this.diploma = diploma;
    }

    public String getGlider() {
        return glider;
    }

    public void setGlider(String glider) {
        this.glider = glider;
    }

    public int getCompany() {
        return company;
    }

    public void setCompany(int company) {
        this.company = company;
    }
}
