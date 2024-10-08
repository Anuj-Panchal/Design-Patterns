package com.anuj.behavioural.observer;

public class PhoneObserver implements Observer{

    @Override
    public void subscribeSubject(Subject subject) {
        subject.addObserver(this);
    }

    @Override
    public void update(double value) {
        System.out.println("Phone Observer updated to value: " + value);
    }
}
