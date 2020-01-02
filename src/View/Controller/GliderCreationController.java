package View.Controller;

import Facade.GliderFacade;
import javafx.event.ActionEvent;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

public class GliderCreationController {
    private GliderFacade gliderFacade;
    public DatePicker reviewDateInput;
    public TextField registrationIDInput;
    public TextField spanInput;
    public TextField maxWidthInput;

    public GliderCreationController() { this.gliderFacade = new GliderFacade();}

    public void createGlider(ActionEvent actionEvent) {
        boolean done = gliderFacade.createGlider(
                registrationIDInput.getText(),
                Float.parseFloat(spanInput.getText()),
                Float.parseFloat(maxWidthInput.getText()),
                java.sql.Date.valueOf(reviewDateInput.getValue()),
                1
        );

        System.out.println(done);
    }
}
