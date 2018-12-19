package com.kodilla.patterns2.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class PizzaOrderTestSuite {
    @Test
    public void testBasicPizzaGetPrice() {
        //Given
        PizzaOrder pizza = new BasicPizza();
        //When
        BigDecimal price = pizza.getPrice();
        //Then
        assertEquals(new BigDecimal("15"), price);
    }

    @Test
    public void testBasicPizzaGetDescription() {
        //Given
        PizzaOrder pizza = new BasicPizza();
        //When
        String description = pizza.getDescription();
        //Then
        assertEquals("Pizza with cheese", description);
    }

    @Test
    public void testPizzaWithExtraCheeseAnchoviesGetPrice() {
        //Given
        PizzaOrder pizza = new BasicPizza();
        pizza = new ExtraCheeseDecorator(pizza);
        pizza = new AnchoviesDecorator(pizza);
        //When
        BigDecimal price = pizza.getPrice();
        //Then
        assertEquals(new BigDecimal("22.5"), price);
    }

    @Test
    public void testPizzaWithExtraCheeseAnchoviesGetDescription() {
        //Given
        PizzaOrder pizza = new BasicPizza();
        pizza = new ExtraCheeseDecorator(pizza);
        pizza = new AnchoviesDecorator(pizza);
        //When
        String description = pizza.getDescription();
        //Then
        assertEquals("Pizza with cheese, extra cheese, anchovies", description);
    }

    @Test
    public void testPizzaWithHamDoublePineappleGetPrice() {
        //Given
        PizzaOrder pizza = new BasicPizza();
        pizza = new HamDecorator(pizza);
        pizza = new PineappleDecorator(pizza);
        pizza = new PineappleDecorator(pizza);
        //When
        BigDecimal price = pizza.getPrice();
        //Then
        assertEquals(new BigDecimal("26.0"), price);
    }

    @Test
    public void testPizzaWithHamDoublePineappleGetDescription() {
        //Given
        PizzaOrder pizza = new BasicPizza();
        pizza = new HamDecorator(pizza);
        pizza = new PineappleDecorator(pizza);
        pizza = new PineappleDecorator(pizza);
        //When
        String description = pizza.getDescription();
        //Then
        assertEquals("Pizza with cheese, ham, pineapple, pineapple", description);
    }
}
