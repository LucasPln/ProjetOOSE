package Test;

import Model.Glider;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GliderTest {

    @Test
    void getRegistrationGlider() {
        Glider glider = new Glider("glider");
        assertEquals("glider", glider.getRegistrationGlider());
    }

    @Test
    void setRegistrationGlider() {
        Glider glider = new Glider();
        glider.setRegistrationGlider("glider");
        assertEquals("glider", glider.getRegistrationGlider());
    }
}