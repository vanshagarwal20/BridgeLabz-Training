package JUNIT.junit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PasswordValidatorTest {

    PasswordValidator validator = new PasswordValidator();

    @Test
    void testValidPassword() {
        assertTrue(validator.isValid("Strong123"));
    }

    @Test
    void testInvalidPasswordTooShort() {
        assertFalse(validator.isValid("Ab1"));
    }

    @Test
    void testInvalidPasswordNoUppercase() {
        assertFalse(validator.isValid("weak1234"));
    }

    @Test
    void testInvalidPasswordNoDigit() {
        assertFalse(validator.isValid("WeakPass"));
    }
}

