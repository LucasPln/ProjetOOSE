package View.Controller;

import Facade.AllInfoCompanyFacade;

public class MonitorUIController {
    private AllInfoCompanyFacade allInfoCompanyFacade;
    public MonitorUIController(){
        this.allInfoCompanyFacade = new AllInfoCompanyFacade();
    }

}
