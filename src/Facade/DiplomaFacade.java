package Facade;

import DAO.AbstractFactory;
import Model.Diploma;

import java.util.ArrayList;

public class DiplomaFacade {

    private AbstractFactory abstractFactory;

    public DiplomaFacade() {
        this.abstractFactory = AbstractFactory.getInstance();
        this.abstractFactory.createDiplomaDAO();
    }

    public ArrayList<Diploma> getAllDiploma(){
        return this.abstractFactory.getDaoDiploma().getAllDiploma();
    }
}
