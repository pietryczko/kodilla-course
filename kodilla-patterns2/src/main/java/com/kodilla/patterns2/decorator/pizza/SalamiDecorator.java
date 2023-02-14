package com.kodilla.patterns2.decorator.pizza;

public class SalamiDecorator extends PizzaOrderDecorator {
    public SalamiDecorator(BasicPizza basicPizza) {
        super(basicPizza);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 6.00;
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + ", salami";
    }
}