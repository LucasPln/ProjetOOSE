package Model;

import java.util.Date;


/**
 * The type Booking.
 *
 * @author Lucas Paulin
 */
public class Booking {

    /**
     * Id of the booking.
     */
    private int idBooking;

    /**
     * Start date of the booking.
     */
    private Date startDate;

    /**
     * End date of the booking.
     */
    private Date endDate;

    /**
     * Price of the booking.
     */
    private double price;

    /**
     * State of the booking ("todo", "done" or "cancelled").
     */
    private String state;

    /**
     * Id of the battery used by the glider.
     */
    private int battery;

    /**
     * Id of the gps used by the glider.
     */
    private int gps;

    /**
     * Registration of the plane used for the launch.
     */
    private String launcherPlane;

    /**
     * Registration of the wincher used for the launch.
     */
    private String launcherWinch;

    /**
     * IdUser of the launchman.
     */
    private int launchman;

    /**
     * IdUser of the customer.
     */
    private int customer;

    /**
     * IdUser of the flight manager.
     */
    private int flightManager;

    /**
     * Id of the diploma.
     */
    private int diploma;

    /**
     * Registration of the glider.
     */
    private String glider;

    /**
     * Id of the company.
     */
    private int company;

    /**
     * Constructor with all the infos of a booking.
     *
     * @param idBooking     : Id of the booking.
     * @param startDate     : Start date of the booking.
     * @param endDate       : End date of the booking.
     * @param price         : Price of the booking.
     * @param state         : State of the booking ("todo", "done" or "cancelled").
     * @param battery       : Id of the battery used by the glider.
     * @param gps           : Id of the gps used by the glider.
     * @param launcherPlane : Registration of the plane used for the launch.
     * @param launcherWinch : Registration of the wincher used for the launch.
     * @param launchman     : IdUser of the launchman.
     * @param customer      : IdUser of the customer.
     * @param flightManager : IdUser of the flight manager.
     * @param diploma       : Id of the diploma.
     * @param glider        : Registration of the glider.
     * @param company       : Id of the company.
     */
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

    /**
     * Constructor without the id and the idCompany.
     *
     * @param startDate     : Start date of the booking.
     * @param endDate       : End date of the booking.
     * @param price         : Price of the booking.
     * @param state         : State of the booking ("todo", "done" or "cancelled").
     * @param battery       : Id of the battery used by the glider.
     * @param gps           : Id of the gps used by the glider.
     * @param launcherPlane : Registration of the plane used for the launch.
     * @param launcherWinch : Registration of the wincher used for the launch.
     * @param launchman     : IdUser of the launchman.
     * @param customer      : IdUser of the customer.
     * @param flightManager : IdUser of the flight manager.
     * @param diploma       : Id of the diploma.
     * @param glider        : Registration of the glider.
     */
    public Booking(Date startDate, Date endDate, double price, String state, int battery, int gps, String launcherPlane, String launcherWinch, int launchman, int customer, int flightManager, int diploma, String glider) {
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
    }

    /**
     * Instantiates a new Booking.
     *
     * @param startDate the start date
     */
    public Booking(Date startDate) {
        this.startDate = startDate;
    }

    /**
     * Instantiates a new Booking.
     */
    public Booking() {
    }

    /**
     * Get the id of the booking.
     *
     * @return the id of the booking.
     */
    public int getIdBooking() {
        return idBooking;
    }

    /**
     * Get the start date of the booking.
     *
     * @return the start date of the booking.
     */
    public Date getStartDate() {
        return startDate;
    }

    /**
     * Change the start date of the booking.
     *
     * @param startDate : the new start date.
     */
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    /**
     * Get the end date of the booking.
     *
     * @return the end date of the booking.
     */
    public Date getEndDate() {
        return endDate;
    }

    /**
     * Change the end date of the booking.
     *
     * @param endDate : the new end date.
     */
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    /**
     * Get the price of the booking.
     *
     * @return the price of the booking.
     */
    public double getPrice() {
        return price;
    }

    /**
     * Change the price of the booking.
     *
     * @param price : the new price.
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * Get the state of the booking.
     *
     * @return the state of the booking.
     */
    public String getState() {
        return state;
    }

    /**
     * Change the state of the booking.
     *
     * @param state : the new state.
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * Get the id of the battery used by the glider.
     *
     * @return the id of the battery used by the glider.
     */
    public int getBattery() {
        return battery;
    }

    /**
     * Change the id of the battery used by the glider.
     *
     * @param battery : the new id.
     */
    public void setBattery(int battery) {
        this.battery = battery;
    }

    /**
     * Get the id of the gps used by the glider.
     *
     * @return the id of the gps used by the glider.
     */
    public int getGps() {
        return gps;
    }


    /**
     * Change the id of the gps used by the glider.
     *
     * @param gps : the new id.
     */
    public void setGps(int gps) {
        this.gps = gps;
    }

    /**
     * Get the registration of the plane used for the launch.
     *
     * @return the the registration of the plane used for the launch.
     */
    public String getLauncherPlane() {
        return launcherPlane;
    }

    /**
     * Change the plane used for the launch.
     *
     * @param launcherPlane : the registration of the new plane.
     */
    public void setLauncherPlane(String launcherPlane) {
        this.launcherPlane = launcherPlane;
    }

    /**
     * Get the registration of the wincher used for the launch.
     *
     * @return the the registration of the wincher used for the launch.
     */
    public String getLauncherWinch() {
        return launcherWinch;
    }

    /**
     * Change the wincher used for the launch.
     *
     * @param launcherWinch : the registration of the new wincher.
     */
    public void setLauncherWinch(String launcherWinch) {
        this.launcherWinch = launcherWinch;
    }

    /**
     * Get the id of the launchman.
     *
     * @return : the id of the launchman.
     */
    public int getLaunchman() {
        return launchman;
    }

    /**
     * Change the launchman.
     *
     * @param launchman : the idUser of the new launchman.
     */
    public void setLaunchman(int launchman) {
        this.launchman = launchman;
    }

    /**
     * Get the id of the customer.
     *
     * @return : the id of the customer.
     */
    public int getCustomer() {
        return customer;
    }

    /**
     * Change the customer.
     *
     * @param customer : the idUser of the new customer.
     */
    public void setCustomer(int customer) {
        this.customer = customer;
    }

    /**
     * Get the id of the flight manager.
     *
     * @return : the id of the flight manager.
     */
    public int getFlightManager() {
        return flightManager;
    }

    /**
     * Change the flight manager.
     *
     * @param flightManager : the idUser of the new flight manager.
     */
    public void setFlightManager(int flightManager) {
        this.flightManager = flightManager;
    }

    /**
     * Get the id of the diploma.
     *
     * @return : the id of the diploma.
     */
    public int getDiploma() {
        return diploma;
    }

    /**
     * Change the diploma.
     *
     * @param diploma : the id of the new diploma.
     */
    public void setDiploma(int diploma) {
        this.diploma = diploma;
    }

    /**
     * Get the registration of the glider.
     *
     * @return : the registration of the glider.
     */
    public String getGlider() {
        return glider;
    }

    /**
     * Change the glider.
     *
     * @param glider : the registration of the new glider.
     */
    public void setGlider(String glider) {
        this.glider = glider;
    }

    /**
     * Get the id of the company.
     *
     * @return : the id of the company.
     */
    public int getCompany() {
        return company;
    }

    /**
     * Change the company.
     *
     * @param company : the id of the new company.
     */
    public void setCompany(int company) {
        this.company = company;
    }
}
