package com.anuj.behavioural.mediator;

public interface ChatMediator {

    void sendMessage(String message, String sender);

    void addUser(User user);
}
