package Test;

import Model.User;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * The type User test.
 */
class UserTest {

    /**
     * Gets first name.
     */
    @Test
    void getFirstName() {
        User user = new User("toto");
        assertEquals("toto", user.getFirstName());
    }

    /**
     * Sets first name.
     */
    @Test
    void setFirstName() {
        User user = new User();
        user.setFirstName("toto");
        assertEquals("toto", user.getFirstName());
    }
}