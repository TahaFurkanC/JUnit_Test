package test.java;

import main.java.AgeRestrictionValidator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestAgeRestrictionValidator {
    AgeRestrictionValidator ageRestrictionValidator = new AgeRestrictionValidator();
    @Test
    void testAgeJustBelowMinimum(){
        boolean result = ageRestrictionValidator.isEligible(17);
        assertFalse(result);
    }
    @Test
    void testAgeAtMinimumBoundary(){
        boolean result = ageRestrictionValidator.isEligible(18);
        assertTrue(result);
    }
    @Test
    void testAgeJustAboveMinimum(){
        boolean result = ageRestrictionValidator.isEligible(19);
        assertTrue(result);
    }
    @Test
    void testAgeJustBelowMaximum(){
        boolean result = ageRestrictionValidator.isEligible(64);
        assertTrue(result);
    }
}
