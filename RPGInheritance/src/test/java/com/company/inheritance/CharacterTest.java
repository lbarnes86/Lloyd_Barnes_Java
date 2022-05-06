package com.company.inheritance;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.theories.suppliers.TestedOn;

import static org.junit.Assert.*;

public class CharacterTest {


     Character character = new Character("Dan", 90, 100, 95, 75, 10, true, false);


    @Test
    public void shouldReturnCharacterName() {
       assertEquals("Dan", character.getName());
    }

    @Test
    public void shouldReturnCharacterStrength() {
        assertEquals(90, character.getStrength());
    }

    @Test
    public void shouldReturnCharacterHealth() {
        assertEquals(100, character.getHealth());
    }

    @Test
    public void shouldReturnCharacterStamina(){
    assertEquals(95, character.getStamina());
    }

    @Test
    public void ShouldReturnCharacterSpeed(){
    assertEquals(75, character.getSpeed());
    }

    @Test
    public void ShouldReturnCharacterAttackPower(){
        assertEquals(10, character.getAttackPower());
    }

    @Test
    public void shouldReturnCharacterRunning() {
        assertEquals(false, character.isRunning());

    }

    @Test
    public void shouldReturnCharacterArrest(){
    assertEquals(false, character.isArrested());
    }

}

