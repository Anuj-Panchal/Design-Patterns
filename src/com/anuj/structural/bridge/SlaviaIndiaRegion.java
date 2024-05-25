package com.anuj.structural.bridge;

public class SlaviaIndiaRegion implements ICarRegion{

    @Override
    public void printSafetyRequirement() {
        System.out.println("Safety Requirement for India Region");
    }

    @Override
    public boolean isRightHanded() {
        return true;
    }
}
