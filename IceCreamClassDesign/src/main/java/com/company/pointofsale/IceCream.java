package com.company.pointofsale;

import java.util.Objects;

public class IceCream {

//    CODE PROVIDED FROM ASSIGNMENT:
//    com.company.pointofsale.IceCream iceCream =
//        new com.company.pointofsale.IceCream
//        (flavor, price, quantity);
    private String flavor;
    private double price;
    private int quantity;
// Generate Constructor
    public IceCream(String flavor, double price, int quantity) {
        this.flavor = flavor;
        this.price = price;
        this.quantity = quantity;
    }

//    Getters & Setters.

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

//    Generate Equals & Hash.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IceCream iceCream = (IceCream) o;
        return Double.compare(iceCream.price, price) == 0 && quantity == iceCream.quantity && Objects.equals(flavor, iceCream.flavor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flavor, price, quantity);
    }
//    Generate toString.

    @Override
    public String toString() {
        return "IceCream{" +
                "flavor='" + flavor + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
