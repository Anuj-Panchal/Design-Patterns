package com.anuj.structural.decorator;

public class PlainCoffee implements ICoffee {
    private double price;

    private String description;

    public PlainCoffee() {
        price = 2D;
        description = "Plain Coffee";
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getDescription() {
        return description;
    }
}
