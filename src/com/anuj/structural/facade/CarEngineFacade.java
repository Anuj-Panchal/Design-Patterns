package com.anuj.structural.facade;

public class CarEngineFacade {

    private AirController airController;

    private FuelInjector fuelInjector;

    private Ignition ignition;

    public CarEngineFacade(AirController airController, FuelInjector fuelInjector, Ignition ignition) {
        this.airController = airController;
        this.fuelInjector = fuelInjector;
        this.ignition = ignition;
    }

    public void startEngine() {
        airController.on();
        airController.takeAir();

        fuelInjector.on();
        fuelInjector.inject();

        ignition.on();
        ignition.ignite();
    }

    public void stopEngine() {
        airController.off();
        fuelInjector.off();
        ignition.off();
    }
}
