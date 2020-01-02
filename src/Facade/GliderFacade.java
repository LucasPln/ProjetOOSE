package Facade;

import DAO.AbstractFactory;
import Model.Glider;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class GliderFacade {
    private AbstractFactory abstractFactory;

    public GliderFacade() {
        this.abstractFactory = AbstractFactory.getInstance();
        this.abstractFactory.createGliderDAO();
        System.out.println("GliderDAO créé");
    }

    public ArrayList<Glider> getGlidersFromCompany(int idCompany) {
        ArrayList<Glider> gliders = this.abstractFactory.getDaoGlider().getGlidersFromCompany(idCompany);
        return gliders;
    }

    public boolean createGlider(String registrationID, float span, float maxWeight, java.sql.Date reviewDate, int IDCompany) {
        try {
            this.abstractFactory.getDaoGlider().createGlider(registrationID, span, maxWeight, new java.sql.Date(Calendar.getInstance().getTime().getTime()), reviewDate, IDCompany);
        } catch (SQLException e) {
            System.out.println(e);
            return false;
        }
        return true;
    }
}
