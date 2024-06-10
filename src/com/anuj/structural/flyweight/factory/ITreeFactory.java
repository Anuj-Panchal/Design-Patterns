package com.anuj.structural.flyweight.factory;

import com.anuj.structural.flyweight.ITree;

import java.util.Map;

public interface ITreeFactory {

    ITree getTree(String type, String color, String texture);

    int getTotalObjects();
}
