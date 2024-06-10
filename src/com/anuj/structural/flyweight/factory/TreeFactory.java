package com.anuj.structural.flyweight.factory;

import com.anuj.structural.flyweight.ITree;
import com.anuj.structural.flyweight.Tree;

import java.util.HashMap;
import java.util.Map;

public class TreeFactory implements ITreeFactory{
    private final Map<String, ITree> map;

    public TreeFactory() {
        map = new HashMap<>();
    }

    @Override
    public ITree getTree(String type, String color, String texture) {
        String intrinsicState = type + "_" + color + "_" + texture;
        if(!map.containsKey(intrinsicState))
            map.put(intrinsicState, new Tree(type, color, texture));
        return map.get(intrinsicState);
    }

    @Override
    public int getTotalObjects() {
        return map.size();
    }
}
