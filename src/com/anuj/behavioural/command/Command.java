package com.anuj.behavioural.command;

public interface Command {
    void execute();

    void undo();

    void setText(String text);
}
