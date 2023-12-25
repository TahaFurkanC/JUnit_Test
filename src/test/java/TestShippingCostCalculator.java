package test.java;

import main.java.ShippingCostCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


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
    void localDestinationWithExpressDelivery() {
        double weight = 2.0;
        String destination = "Local";
        String deliverySpeed = "Express";

        double expectedCost = 2.0 * 1.0 * 2.5;

        double actualCost = calculator.calculateCost(weight, destination, deliverySpeed);
        assertEquals(expectedCost, actualCost);
    }
    @Test
    void internationalDestinationWithStandardDelivery() {
        double weight = 2.0;
        String destination = "International";
        String deliverySpeed = "Standard";

        double expectedCost = 2.0 * 5.0 * 1.0;

        double actualCost = calculator.calculateCost(weight, destination, deliverySpeed);
        assertEquals(expectedCost, actualCost);
    }
    @Test
    void internationalDestinationWithExpressDelivery() {
        double weight = 2.0;
        String destination = "International";
        String deliverySpeed = "Express";

        double expectedCost = 2.0 * 5.0 * 2.5;

        double actualCost = calculator.calculateCost(weight, destination, deliverySpeed);
        assertEquals(expectedCost, actualCost);
    }
    @Test
    void zeroWeightLocalStandardDelivery(){
        double weight = 0.0;
        String destination = "Local";
        String deliverySpeed = "Standard";

        assertThrows(Exception.class,()->{
            double actualCost = calculator.calculateCost(weight, destination, deliverySpeed);
        });
    }
    @Test
    void zeroWeightLocalExpressDelivery(){
        double weight = 0.0;
        String destination = "Local";
        String deliverySpeed = "Express";

        assertThrows(Exception.class,()->{
            double actualCost = calculator.calculateCost(weight, destination, deliverySpeed);
        });
    }
    @Test
    void zeroWeightInternationalStandardDelivery(){
        double weight = 0.0;
        String destination = "International";
        String deliverySpeed = "Standard";

        assertThrows(Exception.class,()->{
            double actualCost = calculator.calculateCost(weight, destination, deliverySpeed);
        });
    }
    @Test
    void zeroWeightInternationalExpressDelivery(){
        double weight = 0.0;
        String destination = "International";
        String deliverySpeed = "Express";

        assertThrows(Exception.class,()->{
            double actualCost = calculator.calculateCost(weight, destination, deliverySpeed);
        });
    }
    @Test
    void negativeWeightLocalStandardDelivery(){
        double weight = -10.0;
        String destination = "Local";
        String deliverySpeed = "Standard";

        assertThrows(Exception.class,()->{
            double actualCost = calculator.calculateCost(weight, destination, deliverySpeed);
        });
    }
    @Test
    void negativeWeightLocalExpressDelivery(){
        double weight = -10.0;
        String destination = "Local";
        String deliverySpeed = "Express";

        assertThrows(Exception.class,()->{
            double actualCost = calculator.calculateCost(weight, destination, deliverySpeed);
        });
    }
    @Test
    void negativeWeightInternationalStandardDelivery(){
        double weight = -10.0;
        String destination = "International";
        String deliverySpeed = "Standard";

        assertThrows(Exception.class,()->{
            double actualCost = calculator.calculateCost(weight, destination, deliverySpeed);
        });
    }
    @Test
    void negativeWeightInternationalExpressDelivery(){
        double weight = -10.0;
        String destination = "International";
        String deliverySpeed = "Express";

        assertThrows(Exception.class,()->{
            double actualCost = calculator.calculateCost(weight, destination, deliverySpeed);
        });
    }
}
