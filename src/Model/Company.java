package Model;

import java.util.ArrayList;

public class Company {

    public Company() {
    }

    private String idCompany;
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


}
