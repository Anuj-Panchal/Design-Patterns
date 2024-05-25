package com.anuj.structural.proxy;

public class ProxyImage implements Image{
    Image image;

    @Override
    public void display() {
        if(image == null)
            image = new RealImage();
        image.display();
    }
}
