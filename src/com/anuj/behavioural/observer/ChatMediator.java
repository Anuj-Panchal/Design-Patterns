package com.anuj.behavioural.observer;

public interface ChatMediator {

    void sendMessage(String message, String sender);

    void addUser(User user);
}
