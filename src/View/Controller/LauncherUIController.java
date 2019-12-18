package View.Controller;

import Facade.NameCompanyFacade;

public class LauncherUIController {
    private NameCompanyFacade nameCompanyFacade;
    public LauncherUIController(){
        this.nameCompanyFacade = new NameCompanyFacade();
    }

}
