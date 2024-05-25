package com.anuj.structural.bridge;

public class SlaviaUSRegion implements ICarRegion{

    @Override
    public void printSafetyRequirement() {
        System.out.println("Safety Requirement for US Region");
    }

    @Override
    public boolean isRightHanded() {
        return false;
    }
}
