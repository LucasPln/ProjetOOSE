package View.Controller;

import Facade.AllInfoCompanyFacade;

/**
 * The type Company member ui controller.
 */
public class CompanyMemberUIController {
    private AllInfoCompanyFacade allInfoCompanyFacade;


    /**
     * Instantiates a new Company member ui controller.
     */
    public CompanyMemberUIController(){
        this.allInfoCompanyFacade = new AllInfoCompanyFacade();
    }

}
