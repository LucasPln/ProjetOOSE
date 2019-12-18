package View.Controller;

import Facade.AllInfoCompanyFacade;

public class CompanyMemberUIController {
    private AllInfoCompanyFacade allInfoCompanyFacade;


    public CompanyMemberUIController(){
        this.allInfoCompanyFacade = new AllInfoCompanyFacade();
    }

}
