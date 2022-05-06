package com.company.pointofsale;

import org.junit.Test;
import static org.junit.Assert.*;

public class IceCreamTest {

    IceCream posIceCream = new IceCream("butter pecan", 4.99, 2);

    @Test
    public void shouldReturnFlavor() {
        assertEquals("butter pecan", posIceCream.getFlavor());

    }

    @Test
    public void shouldReturnPrice() {
        assertEquals(4.99, posIceCream.getPrice(), .01);
    }

    @Test
    public void shouldReturnQuantity() {
        assertEquals(2, posIceCream.getQuantity(), .01);
    }
}
