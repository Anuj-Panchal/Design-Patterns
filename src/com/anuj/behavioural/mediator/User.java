package com.anuj.behavioural.mediator;

public interface User {

    void sendMessage(ChatMediator chatMediator, String message);

    void receiveMessage(String message);

    String getUserName();
}
