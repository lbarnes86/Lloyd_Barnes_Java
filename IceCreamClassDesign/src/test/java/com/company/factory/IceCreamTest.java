package com.company.factory;

import org.junit.Test;
import static org.junit.Assert.*;

public class IceCreamTest {

//
String[] ingredients = new String[] {"sugar", "milk", "birthday cake flavor"};
IceCream factoryIceCream = new IceCream("birthday cake", 5.99, 3.99, 40, ingredients);

@Test
    public void shouldReturnIceCreamFlavor() {
    assertEquals("birthday cake", factoryIceCream.getFlavor());
}

@Test
    public void shouldReturnSalePrice(){
    assertEquals(5.99, factoryIceCream.getSalePrice(), .01);

}

@Test
    public void shouldReturnProductionCost() {
    assertEquals(3.99, factoryIceCream.getProductionCost(), .01);

}

@Test
    public void shouldReturnProductionTime() {
    assertEquals(40, factoryIceCream.getProductionTime(), .01);
}

@Test
    public void shouldReturnIngredients() {
    assertArrayEquals( ingredients, factoryIceCream.getIngredients() );
//    assertArrayEquals();Equals("sugar, milk, birthday cake flavor", factoryIceCream.getIngredients());
}

}
