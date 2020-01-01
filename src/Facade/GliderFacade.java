package Facade;

import DAO.AbstractFactory;
import Model.Glider;

import java.util.ArrayList;

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
}
