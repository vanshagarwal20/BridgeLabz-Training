package JUNIT.junit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {

    UserRegistration registration = new UserRegistration();

    @Test
    void testValidUserRegistration() {
        assertDoesNotThrow(() -> {
            registration.registerUser("Vansh", "vansh@gmail.com", "secure123");
        });
    }

    @Test
    void testInvalidUsername() {
        assertThrows(IllegalArgumentException.class, () -> {
            registration.registerUser("Va", "v@gmail.com", "secure123");
        });
    }

    @Test
    void testInvalidEmail() {
        assertThrows(IllegalArgumentException.class, () -> {
            registration.registerUser("Vansh", "gmail.com", "secure123");
        });
    }

    @Test
    void testInvalidPassword() {
        assertThrows(IllegalArgumentException.class, () -> {
            registration.registerUser("Vansh", "v@gmail.com", "123");
        });
    }
}

