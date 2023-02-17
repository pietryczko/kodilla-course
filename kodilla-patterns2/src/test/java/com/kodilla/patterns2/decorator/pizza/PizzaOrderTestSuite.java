package com.kodilla.patterns2.decorator.pizza;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PizzaOrderTestSuite {

    @Test
    public void testBasicPizza() {
        //Given
        BasicPizza pizzaOrder = new BasicPizzaOrder();
        //When
        double price = pizzaOrder.getPrice();
        String ingredients = pizzaOrder.getIngredients();
        //Then
        assertEquals(20.99, price);
        assertEquals("Ingredients: Tomato sauce + cheese", ingredients);
    }

    @Test
    public void testExtraCheese() {
        //Given
        BasicPizza pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new ExtraCheeseDecorator(pizzaOrder);
        //When
        double price = pizzaOrder.getPrice();
        String ingredients = pizzaOrder.getIngredients();
        //Then
        assertEquals(25.99, price);
        assertEquals("Ingredients: Tomato sauce, cheese, extra cheese", ingredients);
    }

    @Test
    public void testSalami() {
        //Given
        BasicPizza pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new SalamiDecorator(pizzaOrder);
        //When
        double price = pizzaOrder.getPrice();
        String ingredients = pizzaOrder.getIngredients();
        //Then
        assertEquals(26.99, price);
        assertEquals("Ingredients: Tomato sauce, cheese, salami", ingredients);
    }

    @Test
    public void testSalamiWithExtraCheese() {
        //Given
        BasicPizza pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new SalamiDecorator(pizzaOrder);
        pizzaOrder = new ExtraCheeseDecorator(pizzaOrder);
        //When
        double price = pizzaOrder.getPrice();
        String ingredients = pizzaOrder.getIngredients();
        //Then
        assertEquals(31.99, price);
        assertEquals("Ingredients: Tomato sauce, cheese, salami, extra cheese", ingredients);
    }
}
