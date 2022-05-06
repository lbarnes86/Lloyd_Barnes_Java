package com.company.inheritance;

import org.junit.Test;
import static org.junit.Assert.*;

public class FarmerTest {

    Farmer farmer = new Farmer("Lloyd");


    @Test
    public void shouldReturnFarmerName(){
        assertEquals("Lloyd", farmer.getName());
    }
}
