package com.anuj.behavioural.visitor;

public class PriceCalculator implements IVisitor {

    @Override
    public void visit(Book book) {
        System.out.println("Calculating price of: " + book.getTitle());
        System.out.println("Price: " + book.getPrice());
    }

    @Override
    public void visit(Fruit fruit) {
        System.out.println("Calculating price of: " + fruit.getName());
        System.out.println("Price: " + fruit.getPricePerKgram() * fruit.getWeight());
    }
}
