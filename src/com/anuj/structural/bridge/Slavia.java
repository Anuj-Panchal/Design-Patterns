package com.anuj.structural.bridge;

public class Slavia implements ICar{

    private ICarRegion carRegion;

    public Slavia(ICarRegion carRegion) {
        this.carRegion = carRegion;
    }

    @Override
    public void printSafetyRequirement() {
        carRegion.printSafetyRequirement();
    }

    @Override
    public boolean isRightHanded() {
        return carRegion.isRightHanded();
    }
}
