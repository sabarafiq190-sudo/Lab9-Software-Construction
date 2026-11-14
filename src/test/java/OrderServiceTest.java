package ccom.lab.lab9;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrderServiceTest {

    @Test
    void calculateTotal_appliesVipDiscount_withoutTouchingDatabase() {
        // Arrange
        VipDiscount tenPercent = total -> total * 0.90;
        OrderService service = new OrderService(tenPercent);

        // Act
        double result = service.calculateTotal(1000.0);

        // Assert
        assertEquals(900.0, result, 0.0001);
    }
}