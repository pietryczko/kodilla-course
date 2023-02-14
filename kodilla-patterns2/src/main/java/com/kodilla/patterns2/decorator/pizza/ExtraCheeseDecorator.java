package com.kodilla.patterns2.decorator.pizza;

public class ExtraCheeseDecorator extends PizzaOrderDecorator {
    public ExtraCheeseDecorator(BasicPizza basicPizza) {
        super(basicPizza);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 5.00;
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + ", extra cheese";
    }
}

