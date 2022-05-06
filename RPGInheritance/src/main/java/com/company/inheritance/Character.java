package com.company.inheritance;

import java.util.Objects;

public class Character {

    //    Using properties that all characters have/use.
    private String name;
    private int strength;
    private int health;
    private int stamina;
    private int speed;
    private int attackPower;
    private boolean running;
    private boolean arrested;

    public Character() {

    }

    public Character(String name, int strength, int health, int stamina, int speed, int attackPower, boolean running, boolean arrested) {
        this.name = name;
        this.strength = strength;
        this.health = health;
        this.stamina = stamina;
        this.speed = speed;
        this.attackPower = attackPower;
        this.running = false;
        this.arrested = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    public boolean isRunning() {
        return running;
    }

    public void setRunning(boolean running) {
        this.running = running;
    }

    public boolean isArrested() {
        return arrested;
    }

    public void setArrested(boolean arrested) {
        this.arrested = arrested;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Character character = (Character) o;
        return strength == character.strength && health == character.health && stamina == character.stamina && speed == character.speed && attackPower == character.attackPower && running == character.running && arrested == character.arrested && Objects.equals(name, character.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, strength, health, stamina, speed, attackPower, running, arrested);
    }
}
