package com.company.inheritance;

import java.util.Objects;

public class Warrior extends Character{

    private int shieldStrength;

    public Warrior(String name, int shieldStrength) {
        super(name, 75, 100, 100, 50, 10, false, false);
        this.shieldStrength = 100;
    }

// Attack
     public void attack() {
         System.out.println("Is this a joke? You don't stand a chance!");
     }


//     Equals/Hash


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Warrior warrior = (Warrior) o;
        return shieldStrength == warrior.shieldStrength;
    }

    @Override
    public int hashCode() {
        return Objects.hash(shieldStrength);
    }

    // toString
    @Override
    public String toString() {
        return "Warrior{" +
                "shieldStrength=" + shieldStrength +
                '}';
    }
};