package Model;

import java.util.ArrayList;

public class Company {

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

    public boolean addCompanyMember(User companyMember) {
        return false;
    }

    public boolean removeCompanyMember(int idCompanyMember) {
        return false;
    }

    public boolean addLauncher(Launcher laucher) {
        return false;
    }

    public boolean removeLauncher(int idLauncher) {
        return false;
    }

    public boolean addMonitor(User monitor) {
        return false;
    }

    public boolean removeMonitor(int idMonitor) {
        return false;
    }

    public boolean addGlider(Glider glider) {
        return false;
    }

    public boolean removeGlider(int idGlider) {
        return false;
    }

    public boolean addEquipment(Equipment equipment) {
        return false;
    }

    public boolean removeEquipement(int idEquipment) {
        return false;
    }

    public void reviewGlider() {
    }

    public void reviewEquipment() {
    }

    public void reviewLauncher() {
    }

    public Company(int idCompany, String name) {
        this.idCompany = idCompany;
        this.name = name;
    }

    public int getIdCompany() {
        return idCompany;
    }

    public void setIdCompany(int idCompany) {
        this.idCompany = idCompany;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Booking> getBookings() {
        return bookings;
    }

    public void setBookings(ArrayList<Booking> bookings) {
        this.bookings = bookings;
    }

    public ArrayList<User> getMonitors() {
        return monitors;
    }

    public void setMonitors(ArrayList<User> monitors) {
        this.monitors = monitors;
    }

    public ArrayList<User> getCompanyMembers() {
        return companyMembers;
    }

    public void setCompanyMembers(ArrayList<User> companyMembers) {
        this.companyMembers = companyMembers;
    }

    public ArrayList<Glider> getGliders() {
        return gliders;
    }

    public void setGliders(ArrayList<Glider> gliders) {
        this.gliders = gliders;
    }

    public ArrayList<Launcher> getLaunchers() {
        return launchers;
    }

    public void setLaunchers(ArrayList<Launcher> launchers) {
        this.launchers = launchers;
    }

    public ArrayList<Equipment> getEquipments() {
        return equipments;
    }

    public void setEquipments(ArrayList<Equipment> equipments) {
        this.equipments = equipments;
    }
}
