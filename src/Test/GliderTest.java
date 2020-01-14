package Test;

import Model.Glider;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * The type Glider test.
 */
class GliderTest {

    /**
     * Gets registration glider.
     */
    @Test
    void getRegistrationGlider() {
        Glider glider = new Glider("glider");
        assertEquals("glider", glider.getRegistrationGlider());
    }

    /**
     * Sets registration glider.
     */
    @Test
    void setRegistrationGlider() {
        Glider glider = new Glider();
        glider.setRegistrationGlider("glider");
        assertEquals("glider", glider.getRegistrationGlider());
    }
}