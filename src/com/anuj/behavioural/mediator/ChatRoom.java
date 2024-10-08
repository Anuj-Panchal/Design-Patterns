package com.anuj.behavioural.mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatRoom implements ChatMediator {
    private final List<User> users;

    public ChatRoom() {
        this.users = new ArrayList<>();
    }

    @Override
    public void sendMessage(String message, String sender) {
        for(User user: users) {
            if(!user.getUserName().equals(sender))
                user.receiveMessage(message);
        }
    }

    @Override
    public void addUser(User user) {
        users.add(user);
    }
}
