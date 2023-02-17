package com.kodilla.patterns2.decorator.pizza;

public class BasicPizzaOrder implements BasicPizza {
    @Override
    public double getPrice(){
        return 20.99;
    }

    @Override
    public String getIngredients(){
        return "Ingredients: Tomato sauce, cheese";
    }
}
