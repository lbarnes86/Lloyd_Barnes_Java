package com.company.inheritance;

import java.util.Objects;

public class Farmer extends Character{

    private boolean plowing;
    private boolean harvesting;
//using super keyword invoking parent class; https://pragjyotishcollege.ac.in/wp-content/uploads/2020/04/Super-Keyword-in-Java.pdf
    public Farmer(String name) {
       super(name, 75, 100, 75, 10, 1, false, false);
    }

//    Attack
    public void attack() {
        System.out.println("You're not so tough after all!");
    }

    public boolean isPlowing(){
        return false;
    }

    public boolean isHarvesting(){
        return false;
    }

//    Equals /Hash

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Farmer farmer = (Farmer) o;
        return plowing == farmer.plowing && harvesting == farmer.harvesting;
    }

    @Override
    public int hashCode() {
        return Objects.hash(plowing, harvesting);
    }


}
