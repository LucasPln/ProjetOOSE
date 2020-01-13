package View.Controller;

import Facade.AllInfoCompanyFacade;

/**
 * The type Monitor ui controller.
 */
public class MonitorUIController {
    private AllInfoCompanyFacade allInfoCompanyFacade;

    /**
     * Instantiates a new Monitor ui controller.
     */
    public MonitorUIController(){
        this.allInfoCompanyFacade = new AllInfoCompanyFacade();
    }

}
