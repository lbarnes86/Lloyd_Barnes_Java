package com.company.inheritance;


import org.junit.Test;
import static org.junit.Assert.*;

public class ConstableTest {

    Constable constable = new Constable("Don", "county");

//    @Before
//    public void setUp() {
//
//    }

    @Test
    public void shouldReturnConstableName() {
        assertEquals("Don", constable.getName());

    }
    @Test
    public void shouldReturnJurisdiction(){
        assertEquals("county", constable.getJurisdiction())
        ;
    }
}
