package View.Controller;

import Facade.NameCompanyFacade;

/**
 * The type Equipment ui controller.
 */
public class EquipmentUIController {
    private NameCompanyFacade nameCompanyFacade;

    /**
     * Instantiates a new Equipment ui controller.
     */
    public EquipmentUIController(){
        this.nameCompanyFacade = new NameCompanyFacade();
    }

}
