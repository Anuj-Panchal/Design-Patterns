package com.anuj.creational.prototype;

public class ShapeClient {

    private IShape shape;

    public ShapeClient(IShape shape) {
        this.shape = shape;
    }

    public IShape getShape() {
        return shape.clone();
    }
}
