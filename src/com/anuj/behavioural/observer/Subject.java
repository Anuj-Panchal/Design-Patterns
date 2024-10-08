package com.anuj.behavioural.observer;

public interface Subject {

    void addObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObserver();

    void setValue(double value);
}
