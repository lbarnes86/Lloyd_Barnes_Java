package com.company.inheritance;

import java.util.Objects;

public class Constable extends Character {

    private String jurisdiction;
// using super keyword invoking parent class; https://pragjyotishcollege.ac.in/wp-content/uploads/2020/04/Super-Keyword-in-Java.pdf
    public Constable(String name, String jurisdiction) {
        super(name, 60, 100, 60, 20, 5, false,false);
        this.jurisdiction = jurisdiction;
    }

//    Arrest
    public void arrest(){
        System.out.println("You are under arrest!");
    }

//    Attack
    public void attack(){
        System.out.println("Take this, take that!");
    }

    public String getJurisdiction(){
        return jurisdiction;
    }

//   Equals / Hash

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Constable constable = (Constable) o;
        return Objects.equals(jurisdiction, constable.jurisdiction);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jurisdiction);
    }

//    toString

    @Override
    public String toString() {
        return "Constable{" +
                "jurisdiction='" + jurisdiction + '\'' +
                '}';
    }
}
