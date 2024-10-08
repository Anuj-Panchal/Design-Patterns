package com.anuj.behavioural.observer;

public interface Observer {

    void update(double value);

    void subscribeSubject(Subject subject);
}
