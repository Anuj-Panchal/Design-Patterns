package com.anuj.behavioural.mediator;

public class ChatUser implements User{

    private final String userName;

    public ChatUser(String userName) {
        this.userName = userName;
    }

    @Override
    public void sendMessage(ChatMediator chatMediator, String message) {
        chatMediator.sendMessage(message, userName);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println(userName + " received: " + message);
    }

    public String getUserName() {
        return userName;
    }
}
