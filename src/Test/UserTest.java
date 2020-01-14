package Test;

import Model.User;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    void getFirstName() {
        User user = new User("toto");
        assertEquals("toto", user.getFirstName());
    }

    @Test
    void setFirstName() {
        User user = new User();
        user.setFirstName("toto");
        assertEquals("toto", user.getFirstName());
    }
}