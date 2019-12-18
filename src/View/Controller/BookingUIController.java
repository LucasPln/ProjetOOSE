package View.Controller;

import Facade.AllInfoCompanyFacade;

public class BookingUIController {
    private AllInfoCompanyFacade allInfoCompanyFacade;
    public BookingUIController(){
        this.allInfoCompanyFacade = new AllInfoCompanyFacade();
    }

}
