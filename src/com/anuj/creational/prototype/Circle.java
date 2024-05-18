package com.anuj.creational.prototype;

public class Circle implements IShape{
    private String color;

    public Circle() {
        this.color = "";
    }

    public Circle(String color) {
        this.color = color;
    }

    @Override
    public IShape clone() {
        return new Circle(this.color);
    }

    @Override
    public void draw() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "color='" + color + '\'' +
                '}';
    }
}
