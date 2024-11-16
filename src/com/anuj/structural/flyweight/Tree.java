package com.anuj.structural.flyweight;

public class Tree implements ITree{
    private final String type;
    private final String color;
    private final String texture;

    public Tree(String type, String color, String texture) {
        this.type = type;
        this.color = color;
        this.texture = texture;
    }

    @Override
    public void plantTree(int x, int y) {
        System.out.println(this + " planted at: " + x + ", " + y);
    }

    @Override
    public String toString() {
        return "Tree{" +
                "type='" + type + '\'' +
                ", color='" + color + '\'' +
                ", texture='" + texture + '\'' +
                '}';
    }
}
