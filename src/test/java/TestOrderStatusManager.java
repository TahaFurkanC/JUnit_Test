package test.java;

import main.java.OrderStatusManager;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestOrderStatusManager {
    OrderStatusManager manager = new OrderStatusManager();
    @Test
    void testTransitionFromNewToPending(){
        OrderStatusManager.OrderState result = manager.nextState(OrderStatusManager.OrderState.NEW);
        assertEquals(OrderStatusManager.OrderState.PENDING,result,"1");
    }
    @Test
    void testTransitionFromPendingToShipped(){
        OrderStatusManager.OrderState result = manager.nextState(OrderStatusManager.OrderState.PENDING);
        assertEquals(OrderStatusManager.OrderState.SHIPPED,result,"2");
    }
    @Test
    void testTransitionFromShippedToDelivered(){
        OrderStatusManager.OrderState result = manager.nextState(OrderStatusManager.OrderState.SHIPPED);
        assertEquals(OrderStatusManager.OrderState.DELIVERED,result,"3");
    }
    @Test
    void testNoTransitionFromDelivered(){
        OrderStatusManager.OrderState result = manager.nextState(OrderStatusManager.OrderState.DELIVERED);
        assertEquals(OrderStatusManager.OrderState.DELIVERED,result,"4");
    }
    @Test
    void testNoTransitionFromCancelled(){
        OrderStatusManager.OrderState result = manager.nextState(OrderStatusManager.OrderState.CANCELLED);
        assertEquals(OrderStatusManager.OrderState.CANCELLED,result,"5");
    }
    @Test
    void testCancelFromNewState(){
        OrderStatusManager.OrderState result = manager.cancelOrder(OrderStatusManager.OrderState.NEW);
        assertEquals(OrderStatusManager.OrderState.CANCELLED,result,"6");
    }
    @Test
    void testCancelFromPendingState(){
        OrderStatusManager.OrderState result = manager.cancelOrder(OrderStatusManager.OrderState.PENDING);
        assertEquals(OrderStatusManager.OrderState.CANCELLED,result,"7");
    }
    @Test
    void testNoCancellationFromShippedState(){
        OrderStatusManager.OrderState result = manager.cancelOrder(OrderStatusManager.OrderState.SHIPPED);
        assertEquals(OrderStatusManager.OrderState.SHIPPED,result,"8");
    }
    @Test
    void testNoCancellationFromDeliveredState(){
        OrderStatusManager.OrderState result = manager.cancelOrder(OrderStatusManager.OrderState.DELIVERED);
        assertEquals(OrderStatusManager.OrderState.DELIVERED,result,"9");
    }
    @Test
    void testNoCancellationFromAlreadyCancelledState(){
        OrderStatusManager.OrderState result = manager.cancelOrder(OrderStatusManager.OrderState.CANCELLED);
        assertEquals(OrderStatusManager.OrderState.CANCELLED,result,"10");
    }
}
