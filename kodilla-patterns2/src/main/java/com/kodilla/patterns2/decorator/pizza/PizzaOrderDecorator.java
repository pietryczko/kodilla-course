package com.kodilla.patterns2.decorator.pizza;

public abstract class PizzaOrderDecorator implements BasicPizza {
    private final BasicPizza basicPizza;

    public PizzaOrderDecorator(BasicPizza basicPizza) {
        this.basicPizza = basicPizza;
    }

    @Override
    public double getPrice() {
        return basicPizza.getPrice();
    }

    @Override
    public String getIngredients() {
        return basicPizza.getIngredients();
    }
}
