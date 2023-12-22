package test.java;

import main.java.LoginValidator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestLoginValidator {
    LoginValidator loginValidator = new LoginValidator();

    //Test Cases for validateusername method
    @Test
    void testUsernameWithValidEmailAddress(){
        boolean result = loginValidator.validateUsername("cetinkayatahafurkan@gmail.com");
        assertTrue(result);
    }
    @Test
    void testUsernameWithoutEtSymbol(){
        boolean result = loginValidator.validateUsername("cetinkayatahafurkangmail.com");
        assertFalse(result);
    }
    @Test
    void testUsernameWithoutDomain(){
        boolean result = loginValidator.validateUsername("cetinkayatahafurkan@.com");
        assertFalse(result);
    }
    @Test
    void testUsernameWithInvalidCharacter(){
        boolean result = loginValidator.validateUsername("slnä@gmail.com");
        assertFalse(result);
    }
    @Test
    void testUsernameWithEmptyEmail(){
        boolean result = loginValidator.validateUsername("");
        assertFalse(result);
    }
    @Test
    void testUsernameWithNullEmail(){
        boolean result = loginValidator.validateUsername(null);
        assertFalse(result);
    }

    //Test cases for validate password method

    @Test
    void testValidatePasswordMethodWithValidPassword(){
        boolean result = loginValidator.validatePassword("ergergerg11$");
        assertTrue(result);
    }
    @Test
    void testValidatePasswordMethodWithoutSpecialCharacter() {
        boolean result = loginValidator.validatePassword("ergergerg11");
        assertFalse(result);
    }
    @Test
    void testValidatePasswordMethodWithoutNumber() {
        boolean result = loginValidator.validatePassword("ergergerg$");
        assertFalse(result);
    }
    @Test
    void testValidatePasswordMethodWithTooShortPassword() {
        boolean result = loginValidator.validatePassword("ger1$12");
        assertFalse(result);
    }
    @Test
    void testValidatePasswordMethodWithTooLongPassword() {
        boolean result = loginValidator.validatePassword("ergergerg11$$dkgh");
        assertFalse(result);
    }
    @Test
    void testValidatePasswordMethodWithEmptyPassword(){
        boolean result = loginValidator.validatePassword("");
        assertFalse(result);
    }
    @Test
    void testValidatePasswordMethodWithNullPassword(){
        boolean result = loginValidator.validatePassword(null);
        assertFalse(result);
    }
}
