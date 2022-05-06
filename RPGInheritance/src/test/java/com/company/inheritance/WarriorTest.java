package com.company.inheritance;

import org.junit.Test;
import static org.junit.Assert.*;

public class WarriorTest {

    Warrior warrior = new Warrior("Adam", 100);

    @Test
    public void shouldReturnName(){
        assertEquals("Adam", warrior.getName());
    }



}

