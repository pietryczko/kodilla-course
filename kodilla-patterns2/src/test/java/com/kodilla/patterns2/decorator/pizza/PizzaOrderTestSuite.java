package com.kodilla.patterns2.decorator.pizza;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PizzaOrderTestSuite {

    @Test
    public void testBasicPizzaOrderGetPrice() {
        //Given
        BasicPizza pizzaOrder = new BasicPizzaOrder();
        //When
        double price = pizzaOrder.getPrice();
        //Then
        assertEquals(20.99, price);
    }

    @Test
    public void testBasicPizzaOrderGetIngredients() {
        //Given
        BasicPizza pizzaOrder = new BasicPizzaOrder();
        //When
        String ingredients = pizzaOrder.getIngredients();
        //Then
        assertEquals("Ingredients: Tomato sauce + cheese", ingredients);
    }

    @Test
    public void testExtraCheeseGetPrice() {
        //Given
        BasicPizza pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new ExtraCheeseDecorator(pizzaOrder);
        //When
        double price = pizzaOrder.getPrice();
        //Then
        assertEquals(25.99, price);
    }

    @Test
    public void testExtraCheeseGetIngredients() {
        //Given
        BasicPizza pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new ExtraCheeseDecorator(pizzaOrder);
        //When
        String ingredients = pizzaOrder.getIngredients();
        //Then
        assertEquals("Ingredients: Tomato sauce, cheese, extra cheese", ingredients);
    }
    @Test
    public void testSalamiGetPrice() {
        //Given
        BasicPizza pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new SalamiDecorator(pizzaOrder);
        //When
        double price = pizzaOrder.getPrice();
        //Then
        assertEquals(26.99, price);
    }

    @Test
    public void testSalamiGetIngredients() {
        //Given
        BasicPizza pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new SalamiDecorator(pizzaOrder);
        //When
        String ingredients = pizzaOrder.getIngredients();
        //Then
        assertEquals("Ingredients: Tomato sauce, cheese, salami", ingredients);
    }
    @Test
    public void testSalamiWithExtraCheeseGetPrice() {
        //Given
        BasicPizza pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new SalamiDecorator(pizzaOrder);
        pizzaOrder = new ExtraCheeseDecorator(pizzaOrder);
        //When
        double price = pizzaOrder.getPrice();
        //Then
        assertEquals(31.99, price);
    }

    @Test
    public void testSalamiWithExtraCheeseGetIngredients() {
        //Given
        BasicPizza pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new SalamiDecorator(pizzaOrder);
        pizzaOrder = new ExtraCheeseDecorator(pizzaOrder);
        //When
        String ingredients = pizzaOrder.getIngredients();
        //Then
        assertEquals("Ingredients: Tomato sauce, cheese, salami, extra cheese", ingredients);
    }
}
