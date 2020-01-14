package Model;

import java.util.ArrayList;

/**
 * The type Company.
 */
public class Company {

    /**
     * Instantiates a new Company.
     */
    public Company() {
    }

    private int idCompany;
    private String name;
    private ArrayList<Booking> bookings;
    private ArrayList<User> monitors;
    private ArrayList<User> companyMembers;
    private ArrayList<Glider> gliders;
    private ArrayList<Launcher> launchers;
    private ArrayList<Equipment> equipments;

    /**
     * Add company member boolean.
     *
     * @param companyMember the company member
     * @return the boolean
     */
    public boolean addCompanyMember(User companyMember) {
        return false;
    }

    /**
     * Remove company member boolean.
     *
     * @param idCompanyMember the id company member
     * @return the boolean
     */
    public boolean removeCompanyMember(int idCompanyMember) {
        return false;
    }

    /**
     * Add launcher boolean.
     *
     * @param laucher the laucher
     * @return the boolean
     */
    public boolean addLauncher(Launcher laucher) {
        return false;
    }

    /**
     * Remove launcher boolean.
     *
     * @param idLauncher the id launcher
     * @return the boolean
     */
    public boolean removeLauncher(int idLauncher) {
        return false;
    }

    /**
     * Add monitor boolean.
     *
     * @param monitor the monitor
     * @return the boolean
     */
    public boolean addMonitor(User monitor) {
        return false;
    }

    /**
     * Remove monitor boolean.
     *
     * @param idMonitor the id monitor
     * @return the boolean
     */
    public boolean removeMonitor(int idMonitor) {
        return false;
    }

    /**
     * Add glider boolean.
     *
     * @param glider the glider
     * @return the boolean
     */
    public boolean addGlider(Glider glider) {
        return false;
    }

    /**
     * Remove glider boolean.
     *
     * @param idGlider the id glider
     * @return the boolean
     */
    public boolean removeGlider(int idGlider) {
        return false;
    }

    /**
     * Add equipment boolean.
     *
     * @param equipment the equipment
     * @return the boolean
     */
    public boolean addEquipment(Equipment equipment) {
        return false;
    }

    /**
     * Remove equipement boolean.
     *
     * @param idEquipment the id equipment
     * @return the boolean
     */
    public boolean removeEquipement(int idEquipment) {
        return false;
    }

    /**
     * Review glider.
     */
    public void reviewGlider() {
    }

    /**
     * Review equipment.
     */
    public void reviewEquipment() {
    }

    /**
     * Review launcher.
     */
    public void reviewLauncher() {
    }

    /**
     * Instantiates a new Company.
     *
     * @param idCompany the id company
     * @param name      the name
     */
    public Company(int idCompany, String name) {
        this.idCompany = idCompany;
        this.name = name;
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
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets bookings.
     *
     * @return the bookings
     */
    public ArrayList<Booking> getBookings() {
        return bookings;
    }

    /**
     * Sets bookings.
     *
     * @param bookings the bookings
     */
    public void setBookings(ArrayList<Booking> bookings) {
        this.bookings = bookings;
    }

    /**
     * Gets monitors.
     *
     * @return the monitors
     */
    public ArrayList<User> getMonitors() {
        return monitors;
    }

    /**
     * Sets monitors.
     *
     * @param monitors the monitors
     */
    public void setMonitors(ArrayList<User> monitors) {
        this.monitors = monitors;
    }

    /**
     * Gets company members.
     *
     * @return the company members
     */
    public ArrayList<User> getCompanyMembers() {
        return companyMembers;
    }

    /**
     * Sets company members.
     *
     * @param companyMembers the company members
     */
    public void setCompanyMembers(ArrayList<User> companyMembers) {
        this.companyMembers = companyMembers;
    }

    /**
     * Gets gliders.
     *
     * @return the gliders
     */
    public ArrayList<Glider> getGliders() {
        return gliders;
    }

    /**
     * Sets gliders.
     *
     * @param gliders the gliders
     */
    public void setGliders(ArrayList<Glider> gliders) {
        this.gliders = gliders;
    }

    /**
     * Gets launchers.
     *
     * @return the launchers
     */
    public ArrayList<Launcher> getLaunchers() {
        return launchers;
    }

    /**
     * Sets launchers.
     *
     * @param launchers the launchers
     */
    public void setLaunchers(ArrayList<Launcher> launchers) {
        this.launchers = launchers;
    }

    /**
     * Gets equipments.
     *
     * @return the equipments
     */
    public ArrayList<Equipment> getEquipments() {
        return equipments;
    }

    /**
     * Sets equipments.
     *
     * @param equipments the equipments
     */
    public void setEquipments(ArrayList<Equipment> equipments) {
        this.equipments = equipments;
    }
}
