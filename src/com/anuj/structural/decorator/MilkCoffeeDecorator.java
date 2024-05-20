package com.anuj.structural.decorator;

public class MilkCoffeeDecorator implements CoffeeDecorator{
    private final ICoffee coffee;

    public MilkCoffeeDecorator(ICoffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public double getPrice() {
        return coffee.getPrice() + 0.2;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + " + milk";
    }
}
