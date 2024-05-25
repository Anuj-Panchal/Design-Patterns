package com.anuj.structural.proxy;

public class RealImage implements Image {

    public RealImage() {
        loadImageFromDisk();
    }

    private void loadImageFromDisk() {
        System.out.println("Loading image from disk");
    }

    @Override
    public void display() {
        System.out.println("Displaying image");
    }
}
