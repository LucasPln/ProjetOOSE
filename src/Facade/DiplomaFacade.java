package Facade;

import DAO.AbstractFactory;
import Model.Diploma;

import java.util.ArrayList;

/**
 * The type Diploma facade.
 */
public class DiplomaFacade {

    private AbstractFactory abstractFactory;

    /**
     * Instantiates a new Diploma facade.
     */
    public DiplomaFacade() {
        this.abstractFactory = AbstractFactory.getInstance();
        this.abstractFactory.createDiplomaDAO();
    }

    /**
     * Get all diploma array list.
     *
     * @return the array list
     */
    public ArrayList<Diploma> getAllDiploma(){
        return this.abstractFactory.getDaoDiploma().getAllDiploma();
    }
}
