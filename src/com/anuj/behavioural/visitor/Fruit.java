package com.anuj.behavioural.visitor;

public class Fruit implements Item {

    private final String name;

    private final double pricePerKgram;

    private final double weight;

    public Fruit(String name, double pricePerKgram, double weight) {
        this.name = name;
        this.pricePerKgram = pricePerKgram;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public double getPricePerKgram() {
        return pricePerKgram;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
