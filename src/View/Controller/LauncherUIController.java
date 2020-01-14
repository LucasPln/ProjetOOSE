package View.Controller;

import Facade.NameCompanyFacade;

/**
 * The type Launcher ui controller.
 */
public class LauncherUIController {
    private NameCompanyFacade nameCompanyFacade;

    /**
     * Instantiates a new Launcher ui controller.
     */
    public LauncherUIController(){
        this.nameCompanyFacade = new NameCompanyFacade();
    }

}
