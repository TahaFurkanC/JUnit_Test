package test.java;

import main.java.ShippingCostCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestShippingCostCalculator {
    ShippingCostCalculator calculator = new ShippingCostCalculator();

    @Test
    void localDestinationWithStandardDelivery() {
        double weight = 2.0;
        String destination = "Local";
        String deliverySpeed = "Standard";

        double expectedCost = 2.0 * 1.0 * 1.0;
        double actualCost = calculator.calculateCost(weight, destination, deliverySpeed);
        assertEquals(expectedCost, actualCost);
    }
    @Test
    void zeroWeightWithStandardDelivery(){
        double weight = 0.0;
        String destination = "Local";
        String deliverySpeed = "Standard";

        double expectedCost = 0.0 * 1.0 * 1.0;
        double actualCost = calculator.calculateCost(weight, destination, deliverySpeed);
        assertEquals(expectedCost, actualCost);
    }
}
