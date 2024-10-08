package com.anuj.behavioural.observer;

public class TvObserver implements Observer{

    @Override
    public void subscribeSubject(Subject subject) {
        subject.addObserver(this);
    }

    @Override
    public void update(double value) {
        System.out.println("TV Observer updated to value: " + value);
    }
}
