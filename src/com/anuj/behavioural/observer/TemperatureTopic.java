package com.anuj.behavioural.observer;

import java.util.ArrayList;
import java.util.List;

public class TemperatureTopic implements Subject{

    private final List<Observer> observers;

    private double value;

    public TemperatureTopic() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        observers.forEach(observer -> observer.update(value));
    }

    @Override
    public void setValue(double value) {
        this.value = value;
        notifyObserver();
    }
}
