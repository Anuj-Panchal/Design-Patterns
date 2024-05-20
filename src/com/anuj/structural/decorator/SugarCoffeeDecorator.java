package com.anuj.structural.decorator;

public class SugarCoffeeDecorator implements CoffeeDecorator {
    private final ICoffee coffee;

    public SugarCoffeeDecorator(ICoffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public double getPrice() {
        return coffee.getPrice() + 0.4;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + " + sugar";
    }
}
