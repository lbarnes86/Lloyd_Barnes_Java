package com.company.factory;

import java.util.Arrays;
import java.util.Objects;

public class IceCream {

    // CODE PROVIDED FROM ASSIGNMENT:
    // com.company.factory.IceCream iceCream =
    // new com.company.factory.IceCream
    // (flavor, salePrice, productionCost, productionTime, ingredients);

    private String flavor;
    private double salePrice;
    private double productionCost;
    private int productionTime;
    private String[] ingredients;

//    Constructor
    public IceCream(String flavor, double salePrice, double productionCost, int productionTime, String[] ingredients) {
        this.flavor = flavor;
        this.salePrice = salePrice;
        this.productionCost = productionCost;
        this.productionTime = productionTime;
        this.ingredients = ingredients;
    }

//    Getters and Setters

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(double salePrice) {
        this.salePrice = salePrice;
    }

    public double getProductionCost() {
        return productionCost;
    }

    public void setProductionCost(double productionCost) {
        this.productionCost = productionCost;
    }

    public int getProductionTime() {
        return productionTime;
    }

    public void setProductionTime(int productionTime) {
        this.productionTime = productionTime;
    }

    public String[] getIngredients() {
        return ingredients;
    }

    public void setIngredients(String[] ingredients) {
        this.ingredients = ingredients;
    }
// Generate Equals & Hash.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IceCream iceCream = (IceCream) o;
        return Double.compare(iceCream.salePrice, salePrice) == 0 && Double.compare(iceCream.productionCost, productionCost) == 0 && productionTime == iceCream.productionTime && Objects.equals(flavor, iceCream.flavor) && Arrays.equals(ingredients, iceCream.ingredients);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(flavor, salePrice, productionCost, productionTime);
        result = 31 * result + Arrays.hashCode(ingredients);
        return result;
    }


//    Generate toString

    @Override
    public String toString() {
        return "IceCream{" +
                "flavor='" + flavor + '\'' +
                ", salePrice=" + salePrice +
                ", productionCost=" + productionCost +
                ", productionTime=" + productionTime +
                ", ingredients=" + Arrays.toString(ingredients) +
                '}';
    }

    public void pos() {
        System.out.println();
    }

}
