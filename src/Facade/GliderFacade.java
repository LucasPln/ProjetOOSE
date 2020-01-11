package Facade;

import DAO.AbstractFactory;
import Model.Glider;
import Model.Monitor;
import Model.User;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;

public class GliderFacade {
    private AbstractFactory abstractFactory;

    public GliderFacade() {
        this.abstractFactory = AbstractFactory.getInstance();
        this.abstractFactory.createGliderDAO();
        System.out.println("GliderDAO créé");
    }

    public ArrayList<Glider> getAllGliders(){
        return this.abstractFactory.getDaoGlider().getAllGliders();
    }

    public ArrayList<Glider> getGlidersFromCompany() {
        User u = LoginFacade.getInstance().getConnectedUser();
        int idCompany = u.getCompanyId();
        ArrayList<Glider> gliders = this.abstractFactory.getDaoGlider().getGlidersFromCompany(idCompany);
        return gliders;
    }

    public boolean createGlider(String registrationID, float span, float maxWeight, java.sql.Date reviewDate) {
        User u = LoginFacade.getInstance().getConnectedUser();
        int IDCompany = u.getCompanyId();
        try {
            this.abstractFactory.getDaoGlider().createGlider(registrationID, span, maxWeight, new java.sql.Date(Calendar.getInstance().getTime().getTime()), reviewDate, IDCompany);
        } catch (SQLException e) {
            System.out.println(e);
            return false;
        }
        return true;
    }

    public void deleteGlider(String id) {
        this.abstractFactory.getDaoGlider().deleteGlider(id);
    }
}
